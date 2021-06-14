package com.gui.user;

import com.application.opreation.user.event.App_Opr_SendPassword;
import com.application.opreation.user.showPanal.App_Opr_ShowUserLogin;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI_ForgotPassword {
    /**
     * this is show the user input the info for get the password which be forgot.
     * @param stage_Login for cancel button return to login stage
     * @param primaryStage for show user login panal if user can log in to primary stage
     */

    public void showForgotPasswordStage(Stage stage_Login,Stage primaryStage){

        //create objects for the scene

        Label lb_username = new Label("User name");
        TextField tf_UserName = new TextField();


        Label lb_email = new Label("Your Email : ");
        TextField tf_Email = new TextField();


        Button bu_SendPassword = new Button(" Send ");
        Button bu_PasswordCancel = new Button("Cancel");

        //Gridpane design, contain the elements
        GridPane gp_ForPassword = new GridPane();

        gp_ForPassword.setStyle("-fx-background-color: lightgray");
        gp_ForPassword.setPadding(new Insets(2));
        gp_ForPassword.setPrefWidth(300);
        gp_ForPassword.setPrefHeight(200);
        gp_ForPassword.setAlignment(Pos.CENTER);
        gp_ForPassword.setHgap(2);
        gp_ForPassword.setVgap(2);

        gp_ForPassword.add(lb_email,0,0);
        gp_ForPassword.add(tf_Email,1,0);
        gp_ForPassword.add(lb_username,0,1);
        gp_ForPassword.add(tf_UserName,1,1);
        gp_ForPassword.add(bu_SendPassword, 0,2);
        gp_ForPassword.add(bu_PasswordCancel, 0,3);

        //scene code
        Scene scene_ForPassword = new Scene(gp_ForPassword);
        stage_Login.setScene(scene_ForPassword);
        stage_Login.show();


        bu_SendPassword.setOnAction(new App_Opr_SendPassword(tf_Email,tf_UserName));
        bu_PasswordCancel.setOnAction(new App_Opr_ShowUserLogin(primaryStage));
    }
}



