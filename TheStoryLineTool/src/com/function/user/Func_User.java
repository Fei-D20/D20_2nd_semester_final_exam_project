package com.function.user;

import com.db.daoimplement.user.Impl_UserDao;
import com.db.util.CRUD_Util;
import com.db.util.ConnectionUtil;
import com.domain.user.Dom_User;

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

    /**
     * this class is not the good way to get . need to be rewrite and just see app_opr_usrlogin comment.
     */
    private static Impl_UserDao impl_userDao = new Impl_UserDao();
    public static void userRegister(Dom_User user){
        impl_userDao.add(user);
    }

    public static Dom_User userLogin(Dom_User temp_User){
        try {
            ResultSet instance = impl_userDao.getInstance(temp_User);

            String temp_userPassword = temp_User.getPassword();
            String fld_password = instance.getString("fld_password");

            if(temp_userPassword.equals(fld_password)){ // should use equals but it always false
                temp_User.setUserID(instance.getInt("fld_UserID"));
                System.out.println("the found user is : " + temp_User.toString());
                return temp_User;
            } else {
                System.out.println("the password is not correct !! ");
                return null;
            }
        } catch (SQLException throwables) {
            System.out.println("The user is not exist ! ");
            throwables.printStackTrace();
        }finally {
            ConnectionUtil.closeConPSAndRS(CRUD_Util.getConnection(),CRUD_Util.getPreparedStatement(),CRUD_Util.getResultSet());
            System.out.println("the connection been closed. ");
        }
        return null;
    }
}
