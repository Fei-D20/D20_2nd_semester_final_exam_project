package com.Test;

import com.DB.util.connection.ConnectionUtil;
import org.junit.Test;

import java.sql.Connection;

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
}
