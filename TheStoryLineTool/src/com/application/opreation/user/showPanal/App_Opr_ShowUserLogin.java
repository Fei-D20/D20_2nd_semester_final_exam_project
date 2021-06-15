package com.application.opreation.user.showPanal;

import com.gui.user.GUI_UserLogin;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-14-17.09
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Opr_ShowUserLogin implements EventHandler<ActionEvent> {
    Stage primaryStage;

    /**
     * this is the action by button press
     * the method for showing the user login panel
     * @param primaryStage see th showLoginStage method
     */
    public App_Opr_ShowUserLogin(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }


    @Override
    public void handle(ActionEvent event) {
        GUI_UserLogin gui_userLogin = new GUI_UserLogin();
        gui_userLogin.showLoginStage(primaryStage);
    }
}
