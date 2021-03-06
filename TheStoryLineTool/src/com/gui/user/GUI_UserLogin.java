package com.gui.user;

import com.application.opreation.user.showPanal.App_Opr_ShowForgotPassword;
import com.application.opreation.user.showPanal.App_Opr_ShowRegister;
import com.application.opreation.user.event.App_Opr_UserLogin;
import com.application.opreation.user.event.App_Opr_UserLoginRegisterClose;
import com.application.opreation.user.showPanal.App_Opr_ShowUserLogin;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-22.03
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_UserLogin {

    /**
     * this is the login stage. when the application start to running this window will show up and require the user
     * input the user name and pass word.
     * @param primaryStage for setting the owner for this loginStage.
     */

    public void showLoginStage(Stage primaryStage){

        // The element of pane
        Label lb_Login_user = new Label("User Name : ");
        TextField tf_LoginUser = new TextField();

        Label lb_Login_Password = new Label("Password : ");
        TextField tf_LoginPassword = new TextField();

        Button bu_Register = new Button("New User Register");

        Button bu_ForgotPassword= new Button("Forgot Password");

        Button bu_Login = new Button(" Login ");
        Button bu_cancel = new Button("Cancel");
        HBox hBox_Login = new HBox(bu_Login, bu_cancel);
        hBox_Login.setAlignment(Pos.CENTER_RIGHT);


        // the pane contain the element and it will be put on the scene
        GridPane gp_Login = new GridPane();
        gp_Login.setStyle("-fx-background-color: lightgray");
        gp_Login.setPadding(new Insets(2));
        gp_Login.setPrefWidth(300);
        gp_Login.setPrefHeight(200);
        gp_Login.setAlignment(Pos.CENTER);
        gp_Login.setHgap(2);
        gp_Login.setVgap(2);

        gp_Login.add(lb_Login_user,0,0);
        gp_Login.add(tf_LoginUser,1,0);
        gp_Login.add(lb_Login_Password,0,1);
        gp_Login.add(tf_LoginPassword,1,1);
        gp_Login.add(bu_Register, 0,2);
        gp_Login.add(bu_ForgotPassword, 0,3);
        gp_Login.add(hBox_Login,1,2);


        // the scene and stage about login
        Scene scene_Login = new Scene(gp_Login);
        Stage stage_Login = new Stage();
        stage_Login.setTitle("Log in");
        stage_Login.initOwner(primaryStage);
        stage_Login.initModality(Modality.WINDOW_MODAL);
        stage_Login.setAlwaysOnTop(true);
        stage_Login.setResizable(false);
        stage_Login.setScene(scene_Login);
        stage_Login.show();

        /*
         * here is the event about button action.
         */
        bu_Register.setOnAction(new App_Opr_ShowRegister(stage_Login,primaryStage));
        bu_Login.setOnAction(new App_Opr_UserLogin(stage_Login, tf_LoginUser, tf_LoginPassword));
        bu_cancel.setOnAction(new App_Opr_UserLoginRegisterClose(stage_Login));
        bu_ForgotPassword.setOnAction(new App_Opr_ShowForgotPassword(stage_Login,primaryStage));

    }
}
