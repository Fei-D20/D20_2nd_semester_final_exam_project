package com.DB.Test;
import java.sql.Date;
import com.DB.DaoImplement.eventcard.Impl_CommentDao;
import com.DB.DaoImplement.eventcard.Impl_EventCardDao;
import com.Domain.eventcard.Dom_Comment;
import com.Domain.eventcard.Dom_EventCard;
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
public class EventCardTest {
    @Test
    public void testInsert(){
        Impl_EventCardDao impl_eventCardDao = new Impl_EventCardDao();
        impl_eventCardDao.add(new Dom_EventCard(1,"Event1","Raheela",LocalDate.now()));

    }

    @Test
    public void testDelete(){
        Impl_EventCardDao impl_eventCardDao = new Impl_EventCardDao();
        impl_eventCardDao.delete(new Dom_EventCard(1,"Event1","Raheela",LocalDate.now()));

    }
}
