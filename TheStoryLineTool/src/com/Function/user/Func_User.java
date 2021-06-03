package com.Function.user;

import com.DB.DaoImplement.Impl_UserDaoImpl;
import com.DB.util.CRUD_Util;
import com.DB.util.ConnectionUtil;
import com.Domain.user.Dom_User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-16.43
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_User extends CRUD_Util{
    private static Impl_UserDaoImpl impl_userDao = new Impl_UserDaoImpl();
    public static void userRegister(Dom_User user){
        impl_userDao.add(user);
    }

    public static Dom_User userLogin(Dom_User temp_User){
        try {
            ResultSet instance = null; // here return the user info based on the user name.
            try {
                instance = impl_userDao.getInstance(temp_User);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if(instance == null){
                System.out.println(" the author is not exist !!");
                return null;
            } else {
                String temp_userPassWord = temp_User.getPassWord();
                String fld_password = instance.getString("Fld_Password");

                if(temp_userPassWord.equals(fld_password)){ // should use equals but it always false
                    temp_User.setUserID(instance.getInt("Fld_UserID"));
                    System.out.println("the found user is : " + temp_User.toString());
                    return temp_User;
                } else {
                    System.out.println("the pass word is not correct !! ");
                    return null;
                }
            }
        } catch (SQLException throwables) {
            System.out.println("some thing happened ");
            throwables.printStackTrace();
        }finally {
            ConnectionUtil.closeConPSAndRS(CRUD_Util.getConnection(),CRUD_Util.getPreparedStatement(),CRUD_Util.getResultSet());
            System.out.println("the connection been closed. ");
        }
        return null;
    }
}
