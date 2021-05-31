package func.story;

import domain.eventcard.Dom_EventCard;
import domain.story.Dom_EventList;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-29-19.18
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_EventList {
    /**
     * The method will set an event card object into the singleton event list.
     * @param eventCard the item of the event list. which is from instance an event card
     */
    public void setEvent(Dom_EventCard eventCard){
//        data base part
        Dom_EventList.getInstance().add(eventCard);
    }

    public ArrayList<Dom_EventCard> getEventList(){
        return Dom_EventList.getInstance();
    }

    public void getEvent(int index){
        Dom_EventList.getInstance();
    }

    @Test
    public void test(){
        Dom_EventCard dom_eventCard2 = new Dom_EventCard(002);
        Dom_EventCard dom_eventCard3 = new Dom_EventCard(003);
        Dom_EventCard dom_eventCard4 = new Dom_EventCard(004);
        Dom_EventCard dom_eventCard5 = new Dom_EventCard(005);
        Dom_EventCard dom_eventCard6 = new Dom_EventCard(006);

        new Func_EventList().setEvent(dom_eventCard2);
        new Func_EventList().setEvent(dom_eventCard3);
        new Func_EventList().setEvent(dom_eventCard4);
        new Func_EventList().setEvent(dom_eventCard5);
        new Func_EventList().setEvent(dom_eventCard6);

        for (Dom_EventCard dom_eventCard : new Func_EventList().getEventList()) {
            System.out.println(dom_eventCard);
        }

    }
}
