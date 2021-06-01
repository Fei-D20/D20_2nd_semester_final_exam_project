package com.DB.DaoImplement;

import com.DB.Dao.IF_UserDao;
import com.DB.util.connection.CRUD_Util;
import com.Domain.user.Dom_User;
import com.sun.deploy.util.UpdateCheck;

import java.util.ArrayList;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-15.14
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Impl_UserDaoImpl implements IF_UserDao {

    @Override
    public void add(Dom_User user) {
        try {
            String sql = "INSERT INTO  tbl_User(fld_UserID, fld_UserName, fld_Password) values (?,?,?)\n";
            CRUD_Util.update(sql,user.getUserID(),user.getUserName(),user.getPassWord());
            System.out.println("Insert finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modify(Dom_User dom_user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Dom_User getInstance(int id) {
        return null;
    }

    @Override
    public ArrayList<Dom_User> getAll() {
        return null;
    }
}
