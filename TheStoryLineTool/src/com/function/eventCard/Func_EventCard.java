package com.function.eventCard;

import com.db.daoimplement.eventcard.Impl_EventCardDao;
import com.domain.eventcard.Dom_EventCard;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-10-23.59
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_EventCard implements IF_Func_Dao<Dom_EventCard>{
        Impl_EventCardDao impl_eventCardDao = new Impl_EventCardDao();

    @Override
    public void add(Dom_EventCard dom_eventCard) {
        impl_eventCardDao.add(dom_eventCard);
    }

    @Override
    public void modify(Dom_EventCard dom_eventCard) {
        impl_eventCardDao.modify(dom_eventCard);

    }

    @Override
    public void delete(Dom_EventCard dom_eventCard) {
        impl_eventCardDao.delete(dom_eventCard);
    }

    @Override
    public void getInstance(Dom_EventCard dom_eventCard) {
        impl_eventCardDao.getInstance(dom_eventCard);
    }

    @Override
    public void getAll() {
        impl_eventCardDao.getAll();
    }
}
