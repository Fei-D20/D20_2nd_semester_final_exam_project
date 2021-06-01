package com.DB.DaoImplement;

import com.DB.Dao.IF_UserDao;
import com.DB.util.CRUD_Util;
import com.Domain.user.Dom_User;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

import static com.DB.util.CRUD_Util.getInstance;
import static com.DB.util.CRUD_Util.update;


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
            String sql = "INSERT INTO  tbl_User(Fld_AuthorID, fld_UserName, fld_Password) values (?,?,?)";
            CRUD_Util.update(sql,user.getAuthorID(),user.getUserName(),user.getPassWord());
            System.out.println("The user : " + user.getUserName() + " register into database is successful ! ");
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
    public ResultSet getInstance(Dom_User temp_User) {
        ResultSet instance = null;
        try {
            String userName = temp_User.getUserName();
            String sql = "SELECT Fld_AuthorID,Fld_Password FROM Tbl_User where Fld_UserName = ?";
            instance = CRUD_Util.getInstance(sql, userName);
            return instance;
        } catch (Exception e) {
            System.out.println("The user is not exist, please register user ");
        }
        return null;
    }

    @Override
    public ArrayList<Dom_User> getAll() {
        return null;
    }
}
