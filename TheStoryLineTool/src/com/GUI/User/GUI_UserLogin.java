package com.GUI.User;

import com.Application.controller.user.User.App_UserLogin;
import com.Domain.user.Dom_LoginedUser;
import com.GUI.main_OnePage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
     * @param stage
     */
    public static void showLoginStage(Stage stage){

        // The element of pane
        Label lb_Login_user = new Label("User Name : ");
        TextField tf_LoginUser = new TextField();

        Label lb_Login_Password = new Label("Password : ");
        TextField tf_LoginPassword = new TextField();

        Button bu_Register = new Button("New User Register");

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
        gp_Login.add(hBox_Login,1,2);


        // the scene and stage about login
        Scene scene_Login = new Scene(gp_Login);
        Stage stage_Login = new Stage();
        stage_Login.setTitle("Log in");
        stage_Login.initOwner(stage);
        stage_Login.initModality(Modality.WINDOW_MODAL);
        stage_Login.setAlwaysOnTop(true);
        stage_Login.setResizable(false);
        stage_Login.setScene(scene_Login);
        stage_Login.show();

        // the mouse click event about the buttons
        bu_Register.setOnAction(event -> GUI_UserRegister.showRegisterStage(stage_Login,scene_Login));
        bu_Login.setOnAction(event -> App_UserLogin.login(stage_Login,tf_LoginUser,tf_LoginPassword));
        bu_cancel.setOnAction(event -> App_UserLogin.close(stage_Login));

    }
}
