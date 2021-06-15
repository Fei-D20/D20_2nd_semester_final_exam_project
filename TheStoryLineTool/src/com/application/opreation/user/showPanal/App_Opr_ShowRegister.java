package com.application.opreation.user.showPanal;

import com.gui.user.GUI_UserRegister;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-14-16.12
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Opr_ShowRegister implements EventHandler<ActionEvent> {

    private Stage stage_Login;
    private Stage primaryStage;

    /**
     * here is the constructor for show the register penal.
     * @param stage_Login
     * @param primaryStage
     */
    public App_Opr_ShowRegister(Stage stage_Login, Stage primaryStage) {
        this.stage_Login = stage_Login;
        this.primaryStage = primaryStage;
    }

    /**
     * this override method is the when the register button be press. then show the register panal.
     * @param event mouse click on the button.
     */
    @Override
    public void handle(ActionEvent event) {
        GUI_UserRegister gui_userRegister = new GUI_UserRegister();
        gui_userRegister.showRegisterStage(stage_Login, primaryStage);
    }
}
