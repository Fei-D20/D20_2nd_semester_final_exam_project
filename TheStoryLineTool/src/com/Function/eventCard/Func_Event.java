package com.Function.eventCard;

import com.DB.DaoImplement.eventcard.Impl_EventDao;
import com.Domain.eventcard.Dom_Event;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-10-23.44
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_Event {
    public static void addEvent(Dom_Event dom_event){
        Impl_EventDao impl_eventDao = new Impl_EventDao();
        impl_eventDao.add(dom_event);
    }
}
