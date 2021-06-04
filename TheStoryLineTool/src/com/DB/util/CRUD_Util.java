package com.DB.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * @ author Fei Gu
 * @ create 2021-05-03-13.52
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description
 * @ Version
 */
public class CRUD_Util {

    static Connection connection = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;

    public static void update(String sql, Object... args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i + 1, args[i]);
            }
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.closeConAndPS(connection, preparedStatement);
        }
    }

    public static ResultSet getInstance(String sql, Object args) {

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, args);

            resultSet = preparedStatement.executeQuery();

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 0; i < columnCount; i++) {
                System.out.print(metaData.getColumnName(i + 1) + "\t");
            }
            System.out.println();

            if (resultSet.next()) {
                for (int i = 0; i < columnCount; i++) {
                    System.out.print(resultSet.getObject(i + 1) + "    |    ");
                }
                System.out.println();
            }

            return resultSet;


        } catch (Exception e) {
            e.printStackTrace();
        }
        // remember close the at end of the usage:
        // finally {
        //            ConnectionUtil.closeConPSAndRS(connection, preparedStatement, resultSet);
        //        }
        return resultSet;
    }

    public static ResultSet getTable(String sql) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = preparedStatement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                System.out.print(metaData.getColumnName(i + 1) + "\t");
            }
            System.out.println();

            while (resultSet.next()) {
                for (int i = 0; i < columnCount; i++) {
                    System.out.print(resultSet.getString(i + 1) + "      |      ");
                }
                System.out.println();
            }

            resultSet.beforeFirst();
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.closeConPSAndRS(connection, preparedStatement, resultSet);
        }
        return null;
    }

    public static Connection getConnection() {
        return connection;
    }

    public static PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public static ResultSet getResultSet() {
        return resultSet;
    }
}
