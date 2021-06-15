package com.application.opreation.user.event;

import com.domain.user.Dom_LoginUser;
import com.domain.user.Dom_User;
import com.function.user.Func_User;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
public class App_Opr_UserLogin implements EventHandler<ActionEvent> {
    private Stage stage_Login;
    private TextField user;
    private TextField password;

    /**
     * here is the constructor to create the object to get the user login stage and text about user name and password.
     * @param stage_Login user login stage.
     * @param user username.
     * @param password password.
     */
    public App_Opr_UserLogin(Stage stage_Login, TextField user, TextField password) {
        this.stage_Login = stage_Login;
        this.user = user;
        this.password = password;
    }



    /**
     * this method will when the login button be pressed the input of user name and pass word will be get though
     * the function class.
     * @param event login button be pressed.
     */
    @Override
    public void handle(ActionEvent event) {
        String tf_LoginUserText = user.getText();
        String tf_LoginPasswordText = password.getText();

        Dom_User temp_User = new Dom_User(tf_LoginUserText, tf_LoginPasswordText);
        /*
         * this is not the good way to do the log in . it should use the loginUsr text to get the pass word and
         * though the function to compare the data and return the boolean.
         */
        Dom_User dom_user = Func_User.userLogin(temp_User);
        Dom_LoginUser.setInstance(dom_user);
        System.out.println("app: "+ Dom_LoginUser.getInstance().getUserID());

        stage_Login.close();
    }
}
