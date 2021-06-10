package com.function.story;

import com.db.daoimplement.eventcard.Impl_EventCardDao;
import com.db.util.CRUD_Util;
import com.db.util.ConnectionUtil;
import com.domain.eventcard.Dom_EventCard;
import com.domain.story.Dom_EventList;
import com.function.eventCard.IF_Func_Dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
            ResultSet all = impl_eventCardDao.getAll();
            ResultSetMetaData metaData = all.getMetaData();
            while(all.next()){
                Dom_EventCard dom_eventCard = new Dom_EventCard(
                        all.getInt(1),
                        all.getString(2),
                        all.getString(3),
                        all.getDate(9).toLocalDate()
                );
                Dom_EventList.getInstance().add(dom_eventCard);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ConnectionUtil.closeConPSAndRS(CRUD_Util.getConnection(),CRUD_Util.getPreparedStatement(),CRUD_Util.getResultSet());
        }
        return Dom_EventList.getInstance();
    }

//    public void getEvent(int index){
//        Dom_EventList.getInstance();
//    }

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
