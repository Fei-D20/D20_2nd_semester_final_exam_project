package com.application.opreation.user.User;

import com.domain.user.Dom_User;
import com.function.user.Func_User;
import javafx.scene.control.TextField;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-16.22
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Opr_UserRegister {

    public static void register(TextField tf_UserName , TextField tf_Password){
        String userName = tf_UserName.getText();
        String password = tf_Password.getText();

        Dom_User dom_user = new Dom_User(userName, password);
        Func_User.userRegister(dom_user);

        System.out.println("register finish");

    }
}
