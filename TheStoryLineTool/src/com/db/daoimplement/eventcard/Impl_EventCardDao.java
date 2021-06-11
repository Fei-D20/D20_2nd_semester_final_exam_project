package com.db.daoimplement.eventcard;

import com.db.dao.eventcard.IF_EventCardDao;
import com.db.util.CRUD_Util;
import com.domain.eventcard.Dom_EventCard;

import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-06-09.39
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */

public class Impl_EventCardDao implements IF_EventCardDao {

    /**
     * this is the event card method. and notice when we set the event, note and comment.
     * we need create the row in those table first.
     * @param dom_eventCard
     */

    public void add(Dom_EventCard dom_eventCard) {
        try {
            String sql = "INSERT INTO  tbl_EventCard(fld_EventCardID, fld_EventName, fld_AuthorName, fld_EventId,fld_NoteID,fld_CommentID,fld_PreEventCardId,fld_AfterEventCardID,fld_EditDate) values (?,?,?,?,?,?,?,?,?)";

            LocalDate localDate = dom_eventCard.getLocalDate();
            Date date = Date.valueOf(localDate);

            CRUD_Util.update(sql,
                    dom_eventCard.getEventCardID(),
                    dom_eventCard.getEventName(),
                    dom_eventCard.getAuthorName(),
                    dom_eventCard.getDom_event().getEventID(),
                    dom_eventCard.getDom_note().getNoteID(),
                    dom_eventCard.getDom_comment().getCommentID(),
                    dom_eventCard.getPreEventCardID(),
                    dom_eventCard.getAfterEventCardID(),
                    date
            );

            System.out.println("The Event : " + dom_eventCard.getEventName() + "   added into database is successful ! ");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void modify(Dom_EventCard dom_eventCard) {
        try {
            String sql = "UPDATE tbl_EventCard SET  " +
                    "fld_EventName = ?," +
                    "fld_AuthorName= ?," +
                    "fld_EditDate= ?," +
                    "fld_PreEventCardID= ?," +
                    "fld_AfterEventCardID= ? " +
                    "WHERE fld_EventCardID= ?";
            CRUD_Util.update(sql,
                    dom_eventCard.getEventName(),
                    dom_eventCard.getAuthorName(),
                    java.sql.Date.valueOf(dom_eventCard.getLocalDate()),
                    dom_eventCard.getPreEventCardID(),
                    dom_eventCard.getAfterEventCardID(),
                    dom_eventCard.getEventCardID()
            );
            System.out.println("update finished");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public void delete(Dom_EventCard dom_eventCard) {
        try {
            String sql = "DELETE FROM tbl_EventCard WHERE fld_EventCardID = ?";
            CRUD_Util.update(sql, dom_eventCard.getEventCardID());
            System.out.println("delete finished");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public ResultSet getInstance(Dom_EventCard dom_eventCard) {
        ResultSet instance = null;

        try {
            String sql = "SELECT fld_EventName, fld_AuthorName ,fld_EventID, fld_NoteID, fld_commentID,fld_PreEventCardId,fld_AfterEventCardID,fld_EditDate FROM Tbl_EventCard where fld_EventCardID = ?";
            instance = CRUD_Util.getInstance(sql, dom_eventCard.getEventCardID());
            return instance;
        } catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public ResultSet getAll() {
        try {
            String sql = "SELECT * FROM tbl_EventCard";
            ResultSet table = CRUD_Util.getTable(sql);
            return table;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
