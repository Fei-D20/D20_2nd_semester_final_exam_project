package com.Function.story;

import com.DB.DaoImplement.eventcard.Impl_EventCardDao;
import com.DB.util.CRUD_Util;
import com.DB.util.ConnectionUtil;
import com.Domain.eventcard.Dom_EventCard;
import com.Domain.story.Dom_EventList;

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
public class Func_EventList {
    /**
     * The method will set an event card object into the singleton event list.
     * @param eventCard the item of the event list. which is from instance an event card
     */
    public static void addEvent(Dom_EventCard eventCard){
        Impl_EventCardDao impl_eventCardDao = new Impl_EventCardDao();
        Dom_EventList.getInstance().add(eventCard);
        impl_eventCardDao.add(eventCard);
    }

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

    public void getEvent(int index){
        Dom_EventList.getInstance();
    }
}
