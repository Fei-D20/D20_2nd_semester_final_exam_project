package com.domain.user;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-23.00
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Dom_LoginUser extends Dom_User {
    // in this case is working for store the user who are already log in
    private static Dom_User loginUser = new Dom_User();

    private Dom_LoginUser() {
    }

    public static Dom_User getInstance(){
        return loginUser;
    }

    public static void setInstance(Dom_User dom_user){
        if (dom_user != null) {
            loginUser = dom_user;
            System.out.println("the login user is : " + loginUser.getUserName());
        }
    }
}
