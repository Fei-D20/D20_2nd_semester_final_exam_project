package com.function.eventCard;

import com.db.daoimplement.eventcard.Impl_EventDao;
import com.db.util.CRUD_Util;
import com.db.util.ConnectionUtil;
import com.domain.eventcard.Dom_Event;
import com.domain.eventcard.Dom_EventCard;
import com.function.IF_Func;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-10-23.44
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_Event implements IF_Func<Dom_Event> {
    private Impl_EventDao impl_eventDao = new Impl_EventDao();

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
    public Dom_Event getInstance(Dom_Event dom_event) {
        ResultSet instance = impl_eventDao.getInstance(dom_event);
        try {
            dom_event.setEventDate(instance.getDate(1).toLocalDate());
            dom_event.setChapterNo(instance.getInt(2));
            dom_event.setRole(instance.getString(3));
            dom_event.setLocation(instance.getString(4));
            dom_event.setQuickNote(instance.getString(5));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ConnectionUtil.closeConPSAndRS(CRUD_Util.getConnection(),CRUD_Util.getPreparedStatement(),CRUD_Util.getResultSet());
        }
        return dom_event;
    }

    @Override
    public ArrayList<Dom_Event> getAll() {
        impl_eventDao.getAll();
        return null;
    }

    @Test
    public void testGetInstance(){
        Func_Event func_event = new Func_Event();
        Dom_EventCard dom_eventCard = new Dom_EventCard();
        dom_eventCard.setEventCardID(669058);
        dom_eventCard.getDom_event().setEventID(669058);
        Dom_Event instance = func_event.getInstance(dom_eventCard.getDom_event());
        System.out.println(instance);
    }
}
