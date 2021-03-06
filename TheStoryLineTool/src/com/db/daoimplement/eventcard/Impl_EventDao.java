package com.db.daoimplement.eventcard;

import com.db.dao.eventcard.IF_EventDao;
import com.db.util.CRUD_Util;
import com.domain.eventcard.Dom_Event;

import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-06-09.40
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */


public class Impl_EventDao implements IF_EventDao {

    /**
     * this is the eventDao implement class. in this class all the method dependent on the value from eventcard
     * so before use this method make sure in the tbl_EventCard have the value about this tbl_event
     * @param dom_event
     */

    public void add(Dom_Event dom_event) {
        try {
            String sql = "INSERT INTO  tbl_Event(fld_EventID, fld_EventDate, fld_ChapterNo, fld_Role,fld_Location,fld_QuickNote) values (?,?,?,?,?,?)";
            LocalDate eventDate = dom_event.getEventDate();
            Date date;
            if (eventDate != null) {
                date = Date.valueOf(eventDate);
            } else {
                date = Date.valueOf("2000-1-1");
            }
            CRUD_Util.update(sql, dom_event.getEventID(), date, dom_event.getChapterNo(), dom_event.getRole(), dom_event.getLocation(), dom_event.getQuickNote());
            System.out.println("The Event : " + dom_event.getEventID() + "   added into database is successful ! ");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public void modify(Dom_Event dom_event) {
        Date date;
        try {
            String sql = "UPDATE tbl_Event SET fld_EventDate = ? ,fld_ChapterNo = ? , fld_Role= ?,fld_Location=?,fld_QuickNote=? where fld_EventID = ?";
            LocalDate eventDate = dom_event.getEventDate();
            if (eventDate != null) {
                date = Date.valueOf(eventDate);
            } else {
                date = Date.valueOf("2000-1-1");
            }
            CRUD_Util.update(sql, date, dom_event.getChapterNo(), dom_event.getRole(), dom_event.getLocation(), dom_event.getQuickNote(),dom_event.getEventID());
            System.out.println("update finished");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    // this method can not work when the eventcard have the eventID.
    // because the FK have relationship with the tbl_EventCard. so we need delete it from tbl_EventCard first
    public void delete(Dom_Event dom_event) {
        try {
            String sql = "DELETE FROM tbl_Event WHERE fld_EventID = ?";
            CRUD_Util.update(sql,dom_event.getEventID());
            System.out.println("delete finished");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public ResultSet getInstance(Dom_Event dom_event) {
        ResultSet instance = null;

        try {
            String sql = "SELECT fld_EventDate, fld_ChapterNo, fld_Role,fld_Location,fld_QuickNote FROM Tbl_Event where Fld_EventID = ?";
            instance = CRUD_Util.getInstance(sql, dom_event.getEventID());
            return instance;
        } catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public ResultSet getAll() {
        try {
            String sql = "SELECT * FROM tbl_Event";
            ResultSet var2 = CRUD_Util.getTable(sql);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        return null;
    }

}
