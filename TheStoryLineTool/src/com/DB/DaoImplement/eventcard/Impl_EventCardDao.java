package com.DB.DaoImplement.eventcard;

import com.DB.Dao.eventcard.IF_EventCardDao;
import com.DB.util.CRUD_Util;
import com.Domain.eventcard.Dom_EventCard;
import com.Domain.user.Dom_User;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-06-09.39
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Impl_EventCardDao implements IF_EventCardDao {

    @Override
    public void add(Dom_EventCard dom_eventCard) {
    }

    @Override
    public void modify(Dom_EventCard dom_eventCard) {

    }

    @Override
    public void delete(Dom_EventCard dom_eventCard) {

    }

    @Override
    public ResultSet getInstance(Dom_EventCard dom_eventCard) {
        return null;
    }

    @Override
    public ArrayList<Dom_EventCard> getAll() {
        return null;
    }
    // this is not finish

}
