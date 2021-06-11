package com.function.eventCard;

import com.db.daoimplement.eventcard.Impl_NoteDao;
import com.db.util.CRUD_Util;
import com.db.util.ConnectionUtil;
import com.domain.eventcard.Dom_Note;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-10-23.46
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_Note implements IF_Func_Dao<Dom_Note> {

    Impl_NoteDao impl_noteDao = new Impl_NoteDao();

    @Override
    public void add(Dom_Note dom_note) {
        impl_noteDao.add(dom_note);
    }

    @Override
    public void modify(Dom_Note dom_note) {
        impl_noteDao.modify(dom_note);
    }

    @Override
    public void delete(Dom_Note dom_note) {
        impl_noteDao.delete(dom_note);
    }

    @Override
    public Dom_Note getInstance(Dom_Note dom_note) {
        ResultSet instance = impl_noteDao.getInstance(dom_note);
        try {
            dom_note.setNoteText(instance.getString(1));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ConnectionUtil.closeConPSAndRS(CRUD_Util.getConnection(),CRUD_Util.getPreparedStatement(),CRUD_Util.getResultSet());
        }

        return dom_note;
    }

    @Override
    public ArrayList<Dom_Note> getAll() {
        impl_noteDao.getAll();
        return null;
    }
}
