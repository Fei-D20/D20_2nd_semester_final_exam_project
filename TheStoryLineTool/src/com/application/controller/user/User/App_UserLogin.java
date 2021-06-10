package com.application.controller.user.User;

import com.domain.user.Dom_LoginedUser;
import com.domain.user.Dom_User;
import com.function.user.Func_User;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-22.07
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_UserLogin {
    public static void login(Stage stage, TextField user, TextField password){
        String tf_LoginUserText = user.getText();
        String tf_LoginPasswordText = password.getText();

        Dom_User temp_User = new Dom_User(tf_LoginUserText, tf_LoginPasswordText);
        Dom_User dom_user = Func_User.userLogin(temp_User);
        Dom_LoginedUser.setInstance(dom_user);
        System.out.println("app: "+Dom_LoginedUser.getInstance().getUserID());

        stage.close();
    }

    public static void close(Stage stage){
        stage.close();
    }
}
