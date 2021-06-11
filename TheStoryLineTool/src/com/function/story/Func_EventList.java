package com.function.story;

import com.db.daoimplement.eventcard.Impl_EventCardDao;
import com.db.daoimplement.eventcard.Impl_EventDao;
import com.db.util.CRUD_Util;
import com.db.util.ConnectionUtil;
import com.domain.eventcard.Dom_Comment;
import com.domain.eventcard.Dom_Event;
import com.domain.eventcard.Dom_EventCard;
import com.domain.eventcard.Dom_Note;
import com.domain.story.Dom_EventList;
import com.function.eventCard.IF_Func_Dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-29-19.18
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_EventList implements IF_Func_Dao<Dom_EventCard> {

    public static ArrayList<Dom_EventCard> getEventList() {
        try {
            Impl_EventCardDao impl_eventCardDao = new Impl_EventCardDao();
            ResultSet eventCardRS = impl_eventCardDao.getAll();

            while(eventCardRS.next()){
                Dom_EventCard dom_eventCard = new Dom_EventCard(
                        eventCardRS.getInt(1),
                        eventCardRS.getString(2),
                        eventCardRS.getString(3),
                        eventCardRS.getDate(9).toLocalDate()
                );
                Dom_Event dom_event = dom_eventCard.getDom_event();
                dom_event.setEventID(dom_eventCard.getEventCardID());
                dom_event.setEventName(dom_eventCard.getEventName());

//                Impl_EventDao impl_eventDao = new Impl_EventDao();
//                ResultSet eventRS = impl_eventDao.getInstance(dom_event);
//                while (eventRS.next()) {
//                    LocalDate date = eventRS.getDate(2).toLocalDate();
//                    String location = eventRS.getString(5);
//                    int chapter = eventRS.getInt(3);
//                    String role = eventRS.getString(4);
//                    String quickNote = eventRS.getString(6);
//                    System.out.println(quickNote);
//                    dom_event.setEventDate(date);
//                    dom_event.setLocation(location);
//                    dom_event.setChapterNo(chapter);
//                    dom_event.setRole(role);
//                    dom_event.setQuickNote(quickNote);
//                    dom_eventCard.setDom_event(dom_event);
//                }
//
//                System.out.println("addevent" + dom_event);

                Dom_EventList.getInstance().add(dom_eventCard);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ConnectionUtil.closeConPSAndRS(CRUD_Util.getConnection(),CRUD_Util.getPreparedStatement(),CRUD_Util.getResultSet());
        }
        return Dom_EventList.getInstance();
    }


    @Override
    public void add(Dom_EventCard dom_eventCard) {
        Dom_EventList.getInstance().add(dom_eventCard);
    }

    @Override
    public void modify(Dom_EventCard dom_eventCard) {
    }

    @Override
    public void delete(Dom_EventCard dom_eventCard) {
        Dom_EventList.getInstance().remove(dom_eventCard);
    }

    @Override
    public void getInstance(Dom_EventCard dom_eventCard) {

    }

    @Override
    public void getAll() {

    }
}
