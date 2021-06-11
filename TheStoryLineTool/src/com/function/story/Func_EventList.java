package com.function.story;

import com.db.daoimplement.eventcard.Impl_EventCardDao;
import com.db.util.CRUD_Util;
import com.db.util.ConnectionUtil;
import com.domain.eventcard.Dom_Comment;
import com.domain.eventcard.Dom_Event;
import com.domain.eventcard.Dom_EventCard;
import com.domain.eventcard.Dom_Note;
import com.domain.story.Dom_EventList;
import com.function.eventCard.Func_Comment;
import com.function.eventCard.Func_Event;
import com.function.eventCard.Func_Note;
import com.function.eventCard.IF_Func_Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
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
                Func_Event func_event = new Func_Event();
                Dom_Event eventInstance = func_event.getInstance(dom_event);
                dom_eventCard.setDom_event(eventInstance);

                Dom_Note dom_note = dom_eventCard.getDom_note();
                dom_note.setNoteID(dom_eventCard.getEventCardID());
                Func_Note func_note = new Func_Note();
                Dom_Note noteInstance = func_note.getInstance(dom_note);
                dom_eventCard.setDom_note(noteInstance);

                Dom_Comment dom_comment = dom_eventCard.getDom_comment();
                dom_comment.setCommentID(dom_eventCard.getEventCardID());
                Func_Comment func_comment = new Func_Comment();
                Dom_Comment commentInstance = func_comment.getInstance(dom_comment);
                dom_eventCard.setDom_comment(commentInstance);


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
    public Dom_EventCard getInstance(Dom_EventCard dom_eventCard) {

        return dom_eventCard;
    }

    @Override
    public ArrayList<Dom_EventCard> getAll() {

        return null;
    }
}
