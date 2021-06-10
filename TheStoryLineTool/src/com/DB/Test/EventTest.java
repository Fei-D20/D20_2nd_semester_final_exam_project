package com.DB.Test;

import com.DB.DaoImplement.eventcard.Impl_EventDao;
import com.Domain.eventcard.Dom_Event;
import org.junit.Test;

import java.sql.ResultSet;
import java.time.LocalDate;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-10.47
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */


public class EventTest {

    @Test
    public void testInsert(){
        Impl_EventDao impl_eventDao = new Impl_EventDao();
        Dom_Event dom_event = new Dom_Event(3, "EventNew1", LocalDate.now(), 2, "Father", "Valby", "tser");

        impl_eventDao.add(dom_event);
    }

    @Test
    public void testmodify() {
        Impl_EventDao impl_eventDao = new Impl_EventDao();
        impl_eventDao.modify(new Dom_Event(1,"EventNew1",LocalDate.now(),2,"Mother","Valby","tser"));
    }

    @Test
    public void testDelete(){
        Impl_EventDao impl_eventDao = new Impl_EventDao();
        Dom_Event dom_event = new Dom_Event();
        dom_event.setEventID(1);
        impl_eventDao.delete(dom_event);
    }

    @Test
    public void testGetInstance(){
        Impl_EventDao impl_eventDao = new Impl_EventDao();
        Dom_Event dom_event = new Dom_Event();
        dom_event.setEventID(2);
        ResultSet instance = impl_eventDao.getInstance(dom_event);
    }

    @Test
    public void testGetAll(){
        Impl_EventDao impl_eventDao = new Impl_EventDao();
        ResultSet all = impl_eventDao.getAll();
    }
}

