package com.Domain.user;

import com.Domain.eventcard.Dom_EventCard;

import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-23.00
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Dom_LoginedUser {
    // in this case is working for store the user who are already log in
    private static Dom_User loginedUser = new Dom_User();

    private Dom_LoginedUser() {
    }

    public static Dom_User getInstance(){
        return loginedUser;
    }

    public static void setInstance(Dom_User dom_user){
        loginedUser = dom_user;
        System.out.println("it is worded : " + dom_user.getAuthorID());
    }
}
