package com.function.eventCard;

import com.db.daoimplement.eventcard.Impl_EventCardDao;
import com.db.util.CRUD_Util;
import com.db.util.ConnectionUtil;
import com.domain.eventcard.Dom_EventCard;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    public Dom_EventCard getInstance(Dom_EventCard dom_eventCard)  {
        ResultSet instance = impl_eventCardDao.getInstance(dom_eventCard);
        try {
                dom_eventCard.setEventName(instance.getString(1));
                dom_eventCard.setAuthorName(instance.getString(2));
                dom_eventCard.getDom_event().setEventID(instance.getInt(3));
                dom_eventCard.getDom_note().setNoteID(instance.getInt(4));
                dom_eventCard.getDom_comment().setCommentID(instance.getInt(5));
                dom_eventCard.setPreEventCardID(instance.getInt(6));
                dom_eventCard.setAfterEventCardID(instance.getInt(7));
                dom_eventCard.setLocalDate(instance.getDate(8).toLocalDate());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ConnectionUtil.closeConPSAndRS(CRUD_Util.getConnection(),CRUD_Util.getPreparedStatement(),CRUD_Util.getResultSet());
        }

        return dom_eventCard;
    }

    @Override
    public ArrayList<Dom_EventCard> getAll() {
        impl_eventCardDao.getAll();
        return null;
    }

    @Test
    public void testGetInstace(){
        Func_EventCard func_eventCard = new Func_EventCard();
        Dom_EventCard dom_eventCard = new Dom_EventCard();
        dom_eventCard.setEventCardID(669058);
        Dom_EventCard instance = func_eventCard.getInstance(dom_eventCard);
        System.out.println(instance);
    }
}
