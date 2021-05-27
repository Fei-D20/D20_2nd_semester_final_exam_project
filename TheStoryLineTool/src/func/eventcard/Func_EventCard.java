package func.eventcard;

import domain.eventcard.Dom_EventCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-26-20.40
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_EventCard{
    public Dom_EventCard createEventCard(String authorOfCard, Date timeOfCard){
        Dom_EventCard dom_eventCard = new Dom_EventCard(authorOfCard,timeOfCard);
        write(dom_eventCard.getEventCardUrl(),
                dom_eventCard.getEventID(),
                dom_eventCard.getAuthorOfCard(),
                dom_eventCard.getTimeOfCard());
        addToEventCardList(dom_eventCard.getEventID());
        return dom_eventCard;
    }

    public void write(String eventCardUrl,int eventID,String authorOfCard,Date timeOfCard){
         String eventCardText =
                 "EventID=" + eventID + "\n" +
                 "Author=" + authorOfCard + "\n" +
                 "Time=" + timeOfCard +
                 "url=" + eventCardUrl;
        Func_IO.write(eventCardUrl,eventCardText);
    }


    public ArrayList<String> read(String eventCardUrl,String ... strings){
        ArrayList<String> eventText = Func_IO.read(eventCardUrl, strings);
        return eventText;
    }

    public void addToEventCardList(int eventID){
        String listText = "EventID=" + eventID + "\n";
        String listUrl = "src/file/eventCard/eventCard/list.property";
        Func_IO.write(listUrl,listText,true);
    }

    public ObservableList<String> getEventCardList()  {
//        List<String> read = Func_IO.read("file/eventCard/eventCard/list.property", "EventID");

        ObservableList<String> observableList = null;
        String listUrl = "src/file/eventCard/eventCard/-219404838.property";
        ArrayList<String> eventCardList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(listUrl)));
            String data;
            while ((data = bufferedReader.readLine()) != null){
                eventCardList.add(data);
                System.out.println(data);
            }


            observableList = FXCollections.observableList(eventCardList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedReader != null) bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return observableList;
    }




    /******************  Test  ******************/


    @Test
    public void test9(){
    }

    @Test
    public void test(){
        //1. create an event card :
        Func_EventCard func_eventCard = new Func_EventCard();
        Dom_EventCard fei_gu = func_eventCard.createEventCard("Fei Gu", new Date());
        System.out.println(fei_gu);
    }

    @Test
    public void test2(){
        //2. create the .property file and insert info
        Func_EventCard func_eventCard = new Func_EventCard();
        String s = "src/file/eventCard/eventCard/1211819962.property";
        func_eventCard.write(s,1211819962,"Tommy:)",new Date());

    }


    @Test
    public void test3(){
        Func_EventCard func_eventCard = new Func_EventCard();
        String s = "file/eventCard/eventCard/-135163226.property";
        ArrayList<String> read = func_eventCard.read(s,"EventID", "Author", "Time");
        for (int i = 0; i < read.size(); i++) {
            System.out.println(read.get(i));
        }

    }

    @Test
    public void test5(){
        Func_EventCard func_eventCard = new Func_EventCard();
        String s = "file/eventCard/eventCard/-135163226.property";
        ArrayList<String> read = func_eventCard.read(s,"Author","Time");
        for (int i = 0; i < read.size(); i++) {
            System.out.println(read.get(i));
        }

    }



}
