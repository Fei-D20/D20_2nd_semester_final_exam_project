package func.eventCard;

import domain.eventcard.Dom_EventCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
        File file = new File(dom_eventCard.getEventCardUrl());
        System.out.println(file.getAbsolutePath());
        write(dom_eventCard.getEventCardUrl(),
                dom_eventCard.getEventID(),
                dom_eventCard.getAuthorOfCard(),
                dom_eventCard.getTimeOfCard());
        addToEventCardList(dom_eventCard.getEventCardUrl());
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

    public void addToEventCardList(String eventUrl){
        String listText = eventUrl + "\n";
        String listUrl = "func/eventCard/file/list.property";

        Func_IO.write(listUrl,listText,true);
    }

    public ObservableList<String> getEventList()  {

        ObservableList<String> observableList = null;

        String listUrl = "TheStoryLineTool/src/func/eventCard/file/list.property";
        // here should use the path from repository!!!
        BufferedReader bufferedReader = null;

        ArrayList<String> eventCardList = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(new File(listUrl)));
            String data;
            while ((data = bufferedReader.readLine()) != null){
                System.out.println(data);
                ArrayList<String> eventID = read(data, "EventID");
                for (String eventIDs : eventID) {

                eventCardList.add(eventIDs);
                }
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


    /*************** Test ********************/


    @Test
    public void test1CreateeventCard() throws IOException {
        Func_EventCard func_eventCard = new Func_EventCard();
        func_eventCard.createEventCard("fei", new Date());
    }


}
