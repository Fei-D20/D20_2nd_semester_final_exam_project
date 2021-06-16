package com.db.dao;

import java.sql.ResultSet;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-13.32
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public interface IF_BaseDao<T> {

    /**
     * insert one instance into database
     * @param t the instance t.
     */
    void add(T t);

    /**
     * modity a instance from the database
     * @param t the instance be changed
     */
    void modify(T t);

    /**
     * remove a instance from the database
     * @param t the instance's primary key
     */
    void delete(T t);

    /**
     * select a instance form the database
     * @param t which instance be choose
     * @return the result set from database
     */
    ResultSet getInstance(T t);

    /**
     * select all the instance from a table
      * @return the result set from database
     */
    ResultSet getAll();
}
