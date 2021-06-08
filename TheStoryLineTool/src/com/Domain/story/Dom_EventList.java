package com.Domain.story;

import com.Domain.eventcard.Dom_EventCard;

import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-29-19.15
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */

public class Dom_EventList {
    /**
     * In this class we use the singleton patten for instance the only one object.
     * So each of the method invoke this class variable will not instance a new one.
     */
    private static final ArrayList<Dom_EventCard> sto_eventList = new ArrayList<>();

    private Dom_EventList() {
    }

    public static ArrayList<Dom_EventCard> getInstance(){
        return sto_eventList;
    }
}
