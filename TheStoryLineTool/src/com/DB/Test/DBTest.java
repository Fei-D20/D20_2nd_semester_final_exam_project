package com.DB.Test;

import com.DB.util.ConnectionUtil;
import org.junit.Test;

import java.sql.Connection;

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
/*
    @Test
    public void testInsert() {
        try {
            String sql = "INSERT INTO  schema_TestTable.tbl_TestTable(column_1, column_2, column_3) values (?,?,?) ";
            update(sql, 1, "Nordea","debt");
            update(sql, 2, "DanskBank","card");
            update(sql, 3, "SydDenmarkBank","card");
            System.out.println("Insert finished");
        } catch (Exception e) {
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
*/}
