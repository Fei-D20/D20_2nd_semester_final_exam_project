package com.DB.Test;

import com.DB.DaoImplement.Impl_UserDaoImpl;
import org.junit.Test;

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
       Impl_UserDaoImpl impl_userDao = new Impl_UserDaoImpl();
       impl_userDao.getAll();
   }
}
