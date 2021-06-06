package com.DB.Test;

import com.Application.controller.user.User.App_UserRegister;
import com.DB.util.ConnectionUtil;
import com.Domain.user.Dom_User;
import com.Function.user.Func_User;
import com.GUI.User.GUI_UserRegister;
import javafx.scene.control.TextField;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static com.DB.util.CRUD_Util.*;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-12.40
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class DBTest {
    @Test
    public void testGetconnection() throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        ConnectionUtil.closeConnection(connection);
    }

    @Test
    public void testInsert  () {
String userName;
String password;

        // import the dom_user object, the username and password from App_UserRegister because
        // there it has been converted from TextField to String
        App_UserRegister RegisterObject= new App_UserRegister();
      dom_user(userName, password);

            try{
                // (1) load the driver into memory

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                // (2) establish Connection
                Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=StoryLineTool","sa","123456");


                // (3) create the statement
                PreparedStatement ps = con.prepareStatement("INSERT into tbl_User VALUES (?,?)");


                // (4) Set values
                ps.setString(1, String.valueOf(userName));
                ps.setString(2,String.valueOf(password));



                // 4.1 execute the Update
                ps.executeUpdate();

                // (5) close the connection
                con.close();

            }catch(Exception e){
                System.out.println("register finish");
                e.printStackTrace();
            }

        }



        @Test
    public void testUpdate() {
        try {
            String sql = "UPDATE schema_TestTable.tbl_TestTable SET column_2 = ? where column_1 = ?";
            update(sql, "DanskBank", 1);
            System.out.println("update finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDelete() {
        try {
            String sql = "DELETE FROM schema_TestTable.tbl_TestTable WHERE column_1 = ?";
            update(sql, 1);
            System.out.println("delete finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetInstance() {
        String sql = "SELECT column_1,column_2,column_3 FROM schema_TestTable.tbl_TestTable where column_1 = ?";
        getInstance(sql, 2);
    }

    @Test
    public void testGetTable() {
        String sql = "SELECT * FROM tbl_User";
        getTable(sql);
    }
}
