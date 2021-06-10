package com.Function.eventCard;

import com.Domain.eventcard.Dom_EventCard;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-10-11.21
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_EventCard {
    public void createNewEventCard(){
        Dom_EventCard dom_eventCard = new Dom_EventCard();
        dom_eventCard.setEventCardID(1);
    }
}
