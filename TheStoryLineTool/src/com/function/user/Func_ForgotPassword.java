package com.function.user;

import com.db.daoimplement.user.Impl_UserDao;
import com.db.util.CRUD_Util;
import com.db.util.ConnectionUtil;
import com.domain.user.Dom_User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-09-13.30
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_ForgotPassword {
    public String sendPassword(String email,String userName){
        String fld_password = null;
        try {
            Impl_UserDao impl_userDao = new Impl_UserDao();
            Dom_User dom_user = new Dom_User();
            dom_user.setUserName(userName);
            ResultSet instance = impl_userDao.getInstance(dom_user);
            fld_password = instance.getString("fld_Password");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ConnectionUtil.closeConPSAndRS(CRUD_Util.getConnection(),CRUD_Util.getPreparedStatement(),CRUD_Util.getResultSet());
        }
        return fld_password;
    }
}
