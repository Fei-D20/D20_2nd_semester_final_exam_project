package com.DB.DaoImplement.eventcard;

import com.DB.Dao.eventcard.IF_EventCardDao;
import com.DB.util.CRUD_Util;
import com.Domain.eventcard.Dom_EventCard;
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
    public Impl_EventCardDao() {
    }

    public void add(Dom_EventCard dom_eventCard) {
        try {
            String sql = "INSERT INTO  tbl_EventCard(fld_EventCardID, fld_EventName, fld_AuthorID, fld_EventId,fld_NoteID,fld_CommentID,fld_PreEventCardId,fld_AfterEventCardID,fld_EditDate) values (?,?,?,?)";
            CRUD_Util.update(sql, new Object[]{dom_eventCard.getEventCardID(), dom_eventCard.getEventName(), dom_eventCard.getDom_event().getEventID(), dom_eventCard.getDom_note().getNoteID(), dom_eventCard.getDom_comment().getCommentID(),
                    dom_eventCard.getPreEventCardID(), dom_eventCard.getAfterEventCardID()});
            System.out.println("The Event : " + dom_eventCard.getEventName() + "   added into database is successful ! ");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public void modify(Dom_EventCard dom_eventCard) {
        try {
            String sql = "UPDATE tbl_EventCard SET fld_EventCardID = ?,fld_EventName = ? ,fld_AuthorName = ? , fld_EventID= ?,fld_NoteID=?,fld_CommentID=?,fld_PreEventCardId = ?,fld_AfterEventCard=?,fld_editDate=?  where fld_EventCardID = ?";
            CRUD_Util.update(sql, new Object[]{dom_eventCard.getEventCardID(), dom_eventCard.getEventName(), dom_eventCard.getDom_event().getEventID(), dom_eventCard.getDom_note().getNoteID(), dom_eventCard.getEditDate()});
            System.out.println("update finished");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public void delete(Dom_EventCard dom_eventCard) {
        try {
            String sql = "DELETE FROM tbl_EventCard WHERE fld_EventCardID = ?";
            CRUD_Util.update(sql, new Object[]{dom_eventCard.getEventCardID()});
            System.out.println("delete finished");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public ResultSet getInstance(Dom_EventCard dom_eventCard) {
        ResultSet instance = null;

        try {
            String sql = "SELECT fld_EventCardID, fld_EventID, fld_AuthorName , fld_NoteID, fld_commentID,fld_PreEventCardId,fld_AfterEventCard,fld_EditDate FROM Tbl_EventCard where Fld_EventName = ?";
            instance = CRUD_Util.getInstance(sql, dom_eventCard.getEventName());
            return instance;
        } catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public ArrayList<Dom_EventCard> getAll() {
        try {
            String sql = "SELECT * FROM tbl_EventCard";
            ResultSet var2 = CRUD_Util.getTable(sql);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        return null;
    }
}
