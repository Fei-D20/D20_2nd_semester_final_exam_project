package com.DB.Test;

import com.DB.DaoImplement.eventcard.Impl_CommentDao;
import com.DB.DaoImplement.eventcard.Impl_NoteDao;
import com.Domain.eventcard.Dom_Comment;
import com.Domain.eventcard.Dom_Note;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
        impl_noteDao.add(new Dom_Note(1, " note tested"));
    }

    @Test
    public void testDelete(){
        Impl_NoteDao impl_noteDao = new Impl_NoteDao();
        impl_noteDao.delete(new Dom_Note(1, " note deleted"));
    }
    @Test
    public void testmodify() {
        Impl_NoteDao impl_noteDao = new Impl_NoteDao();
        impl_noteDao.modify(new Dom_Note(1, " note tested"));
}}