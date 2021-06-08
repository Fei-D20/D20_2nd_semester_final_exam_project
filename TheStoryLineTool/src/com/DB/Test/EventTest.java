package com.DB.Test;
import java.sql.Date;
import com.DB.DaoImplement.eventcard.Impl_CommentDao;
import com.DB.DaoImplement.eventcard.Impl_EventDao;
import com.Domain.eventcard.Dom_Comment;
import com.Domain.eventcard.Dom_Event;
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


public class EventTest {

    @Test
public void testInsert(){
        Impl_EventDao impl_eventDao = new Impl_EventDao();
        impl_eventDao.add(new Dom_Event(1,"EventNew1",2,"Father","Valby",""));
        }

@Test
public void testDelete(){
    Impl_EventDao impl_eventDao = new Impl_EventDao();
    impl_eventDao.delete(new Dom_Event(1,"EventNew1",2,"Father","Valby","testing"));
}

@Test
public void testmodify() {
    Impl_EventDao impl_eventDao = new Impl_EventDao();
    impl_eventDao.modify(new Dom_Event(3,"event2",4,"valby","testing","test"));
}
        }

