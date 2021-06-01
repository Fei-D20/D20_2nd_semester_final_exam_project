package com.Function.user;

import com.DB.DaoImplement.Impl_UserDaoImpl;
import com.Domain.user.Dom_User;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-16.43
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_User {
    public static void userRegister(Dom_User user){
        Impl_UserDaoImpl impl_userDao = new Impl_UserDaoImpl();
        impl_userDao.add(user);
    }
}
