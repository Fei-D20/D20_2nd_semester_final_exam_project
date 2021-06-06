package com.Function.story;

import com.Domain.eventcard.Dom_EventCard;
import com.Domain.story.Dom_EventList;
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
        Dom_EventList.getInstance().add(eventCard);
    }

    public ArrayList<Dom_EventCard> getEventList(){
        return Dom_EventList.getInstance();
    }

    public void getEvent(int index){
        Dom_EventList.getInstance();
    }
}
