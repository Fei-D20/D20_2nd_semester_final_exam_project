package com.function.eventCard;

import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-11-00.02
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public interface IF_Func_Dao<T> {
    void add(T t);
    void modify(T t);
    void delete(T t);
    T getInstance(T t);
    ArrayList<T> getAll();
}
