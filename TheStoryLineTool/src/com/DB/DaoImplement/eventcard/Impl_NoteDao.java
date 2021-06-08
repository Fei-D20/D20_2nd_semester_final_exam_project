package com.DB.DaoImplement.eventcard;

import com.DB.Dao.eventcard.IF_NoteDao;
import com.DB.util.CRUD_Util;
import com.Domain.eventcard.Dom_Note;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-06-09.41
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */


public class Impl_NoteDao implements IF_NoteDao {
    public Impl_NoteDao() {
    }

    public void add(Dom_Note dom_note) {
        try {
            String sql = "INSERT INTO  tbl_Note(fld_NoteID, fld_NoteText) values (?,?,?,?)";
            CRUD_Util.update(sql, new Object[]{dom_note.getNoteID(), dom_note.getNoteText()});
            System.out.println("The Note : " + dom_note.getNoteText() + " saved into database is successful ! ");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public void modify(Dom_Note dom_note) {
        try {
            String sql = "UPDATE tbl_Note SET fld_NoteID = ?,fld_NoteText = ? where fld_NoteID = ?";
            CRUD_Util.update(sql, new Object[]{dom_note.getNoteID(), dom_note.getNoteText()});
            System.out.println("update finished");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public void delete(Dom_Note dom_note) {
        try {
            String sql = "DELETE FROM tbl_note WHERE fld_NoteID = ?";
            CRUD_Util.update(sql, new Object[]{dom_note.getNoteID()});
            System.out.println("delete finished");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public ResultSet getInstance(Dom_Note dom_note) {
        ResultSet instance = null;

        try {
            String sql = "SELECT fld_NoteID, fld_NoteText FROM Tbl_Note where Fld_NoteID = ?";
            instance = CRUD_Util.getInstance(sql, dom_note.getNoteID());
            return instance;
        } catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public ArrayList<Dom_Note> getAll() {
        try {
            String sql = "SELECT * FROM tbl_Note";
            ResultSet var2 = CRUD_Util.getTable(sql);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        return null;
    }
}
