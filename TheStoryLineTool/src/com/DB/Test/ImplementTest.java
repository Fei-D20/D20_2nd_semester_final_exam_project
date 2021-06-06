package com.DB.Test;

import com.DB.DaoImplement.eventcard.Impl_EventCardDao;
import com.DB.DaoImplement.user.Impl_UserDao;
import com.Domain.eventcard.Dom_EventCard;
import javafx.event.EventHandler;
import org.junit.Test;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.temporal.TemporalField;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-04-08.38
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class ImplementTest {
   @Test
   public void test1(){
       Impl_UserDao impl_userDao = new Impl_UserDao();
       impl_userDao.getAll();
   }

}
