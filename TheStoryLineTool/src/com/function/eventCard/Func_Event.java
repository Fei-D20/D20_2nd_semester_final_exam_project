package com.function.eventCard;

import com.db.daoimplement.eventcard.Impl_EventDao;
import com.domain.eventcard.Dom_Event;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-10-23.44
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_Event implements IF_Func_Dao<Dom_Event> {
    Impl_EventDao impl_eventDao = new Impl_EventDao();

    @Override
    public void add(Dom_Event dom_event) {
        impl_eventDao.add(dom_event);
    }

    @Override
    public void modify(Dom_Event dom_event) {
        impl_eventDao.modify(dom_event);
    }

    @Override
    public void delete(Dom_Event dom_event) {
        impl_eventDao.delete(dom_event);
    }

    @Override
    public void getInstance(Dom_Event dom_event) {
        impl_eventDao.getInstance(dom_event);
    }

    @Override
    public void getAll() {
        impl_eventDao.getAll();
    }
}
