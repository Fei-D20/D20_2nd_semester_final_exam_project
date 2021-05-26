package func.eventcard;

import domain.eventcard.Dom_EventCard;
import org.junit.Test;

import java.io.File;
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
        int eventID = dom_eventCard.getEventID();
        String url = "src/file/eventcard/eventcardinfo/" + eventID + ".txt"; // 这里可以把文件地址 放到 dom event 里面, 让它更新
        Func_IO func_io = new Func_IO();
        func_io.output(url,"test string");

        return dom_eventCard;
    }

    @Test
    public void test(){
        Func_EventCard func_eventCard = new Func_EventCard();
        Dom_EventCard fei = func_eventCard.createEventCard("Fei", new Date());
        // test to get the unify eventCard
        System.out.println("eventcard: " + fei.toString());
        System.out.println("eventcardID : " + fei.getEventID());
        // if change the author
        fei.setAuthorOfCard("Fei2");
        System.out.println("change name eventcard : " + fei.getEventID());

        // create the different eventcard
        Dom_EventCard fei1 = func_eventCard.createEventCard("fei", new Date());
        System.out.println("fei1 new eventcard: " + fei1.getEventID());


    }

}
