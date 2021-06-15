package com.application.opreation.user.event;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-14-16.23
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Opr_UserLoginRegisterClose implements EventHandler<ActionEvent> {
    private Stage stage;

    public App_Opr_UserLoginRegisterClose(Stage stage) {
        this.stage = stage;
    }

    /**
     * this is the method to close the stage about user login or user register
     */


    @Override
    public void handle(ActionEvent event) {
        stage.close();
    }
}
