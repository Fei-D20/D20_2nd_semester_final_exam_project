package com.DB.DaoImplement;

import com.DB.Dao.IF_UserDao;
import com.DB.util.CRUD_Util;
import com.Domain.user.Dom_User;

import java.sql.ResultSet;
import java.util.ArrayList;

import static com.DB.util.CRUD_Util.getTable;


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
    public void add(Dom_User dom_user) {
        try {
            String sql = "INSERT INTO  tbl_User(fld_userid, fld_username, fld_password, fld_identity) values (?,?,?,?)";
            CRUD_Util.update(sql,dom_user.getUserID(),dom_user.getUserName(),dom_user.getPassword(),dom_user.getAuthor());
            System.out.println("The user : " + dom_user.getUserName() + " register into database is successful ! ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modify(Dom_User dom_user) {
    }

    @Override
    public void delete(Dom_User dom_user) {

    }

    @Override
    public ResultSet getInstance(Dom_User dom_user) {
        ResultSet instance = null;
        try {
            String sql = "SELECT fld_userid, fld_password, fld_identity FROM Tbl_User where Fld_UserName = ?";
            instance = CRUD_Util.getInstance(sql, dom_user.getUserName());
            return instance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Dom_User> getAll() {
        String sql = "SELECT * FROM tbl_User";
        ResultSet table = getTable(sql);
        return null;
    }
}
