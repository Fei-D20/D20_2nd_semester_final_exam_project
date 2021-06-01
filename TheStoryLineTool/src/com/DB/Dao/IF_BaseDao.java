package com.DB.Dao;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-13.32
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public interface IF_BaseDao<T> {

    public void add(T t);

    public void modify(T t);

    public void delete(int id);

    public ResultSet getInstance(T t);

    public ArrayList<T> getAll();
}
