package com.Function.eventCard;

import com.DB.DaoImplement.eventcard.Impl_NoteDao;
import com.Domain.eventcard.Dom_Note;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-10-23.46
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_Note {
    public static void addNote(Dom_Note dom_note){
        Impl_NoteDao impl_noteDao = new Impl_NoteDao();
        impl_noteDao.add(dom_note);
    }
}
