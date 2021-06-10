package com.db.test;

import com.db.daoimplement.eventcard.Impl_NoteDao;
import com.domain.eventcard.Dom_Note;
import org.junit.Test;

import java.sql.ResultSet;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-10.47
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class NoteTest {
    @Test
    public void testInsert(){
        Impl_NoteDao impl_noteDao = new Impl_NoteDao();
        impl_noteDao.add(new Dom_Note(2, " note tested"));
    }

    @Test
    public void testDelete(){
        Impl_NoteDao impl_noteDao = new Impl_NoteDao();
        impl_noteDao.delete(new Dom_Note(2, " note deleted"));
    }

    @Test
    public void testmodify() {
        Impl_NoteDao impl_noteDao = new Impl_NoteDao();
        impl_noteDao.modify(new Dom_Note(1, " note tested2"));
    }

    @Test
    public void testGetInstance(){
        Impl_NoteDao impl_noteDao = new Impl_NoteDao();
        Dom_Note dom_note = new Dom_Note();
        dom_note.setNoteID(1);
        ResultSet instance = impl_noteDao.getInstance(dom_note);
    }

    @Test
    public void testGetAll(){
        Impl_NoteDao impl_noteDao = new Impl_NoteDao();
        ResultSet all = impl_noteDao.getAll();
    }

}