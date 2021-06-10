package com.db.test;

import com.db.daoimplement.user.Impl_UserDao;
import com.domain.user.Dom_User;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-09-08.30
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class UserTest {
    Dom_User dom_user = new Dom_User("qwer","123");
    @Test
    public void testInsert(){
        Impl_UserDao impl_userDao = new Impl_UserDao();
        impl_userDao.add(dom_user);

    }

    @Test
    public void testModify(){
        Dom_User dom_user1 = new Dom_User("qwer","123");
        Impl_UserDao impl_userDao = new Impl_UserDao();
        impl_userDao.add(dom_user1);

        dom_user1.setUserName("ttrr");
        System.out.println(dom_user1);
        impl_userDao.modify(dom_user1);
    }



    @Test
    public void testGetInstance() throws SQLException {
        Impl_UserDao impl_userDao = new Impl_UserDao();
        ResultSet instance = impl_userDao.getInstance(dom_user);
        ResultSetMetaData metaData = instance.getMetaData();
        int columnCount = metaData.getColumnCount();
        while (instance.next()){
            for (int i = 0; i < columnCount; i++) {
                String columnName = metaData.getColumnName(i + 1);
                switch (columnName){
                    case "fld_UserID" : dom_user.setUserID(instance.getInt(i+1));
                }
            }

            System.out.println(dom_user);
        }

    }

    @Test
    public void testGetAll(){
        Impl_UserDao impl_userDao = new Impl_UserDao();
        ResultSet all = impl_userDao.getAll();
    }

    @Test
    public void testDelete(){
        Impl_UserDao impl_userDao = new Impl_UserDao();
        impl_userDao.delete(dom_user);
    }
}
