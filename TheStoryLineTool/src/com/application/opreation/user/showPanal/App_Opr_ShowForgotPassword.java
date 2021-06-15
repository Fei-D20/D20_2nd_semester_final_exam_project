package com.application.opreation.user.showPanal;

import com.gui.user.GUI_ForgotPassword;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-14-16.36
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Opr_ShowForgotPassword implements EventHandler<ActionEvent> {
    Stage stage_Login;
    Stage primaryStage;

    public App_Opr_ShowForgotPassword(Stage stage_Login, Stage primaryStage) {
        this.stage_Login = stage_Login;
        this.primaryStage = primaryStage;
    }

    /**
     * this is action about when the forgot password button be pressed.
     */



    @Override
    public void handle(ActionEvent event) {
        GUI_ForgotPassword gui_forgotPassword = new GUI_ForgotPassword();
        gui_forgotPassword.showForgotPasswordStage(stage_Login,primaryStage);
    }
}
