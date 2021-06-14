package com.gui.user;


import com.application.opreation.user.App_Opr_UserRegister;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-16.13
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_UserRegister {
    public static void showRegisterStage(Stage stage,Scene scene){
        Label lb_Register_user = new Label("Your Name : ");
        TextField tf_RegisterUser = new TextField();

        Label lb_Register_Password = new Label("Please input password : ");
        TextField tf_RegisterPassword = new TextField();

        Button bu_Register = new Button(" Register ");
        Button bu_RegisterCancel = new Button("Cancel");

        GridPane gp_Register = new GridPane();

        gp_Register.setStyle("-fx-background-color: lightgray");
        gp_Register.setPadding(new Insets(2));
        gp_Register.setPrefWidth(300);
        gp_Register.setPrefHeight(200);
        gp_Register.setAlignment(Pos.CENTER);
        gp_Register.setHgap(2);
        gp_Register.setVgap(2);

        gp_Register.add(lb_Register_user,0,0);
        gp_Register.add(tf_RegisterUser,1,0);
        gp_Register.add(lb_Register_Password,0,1);
        gp_Register.add(tf_RegisterPassword,1,1);

        gp_Register.add(bu_Register,0,2);
        gp_Register.add(bu_RegisterCancel,1,2);


        Scene scene_Register = new Scene(gp_Register);
        stage.setScene(scene_Register);
        stage.show();

        bu_Register.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                App_Opr_UserRegister.register(tf_RegisterUser,tf_RegisterPassword);
                stage.close();
            }
        });

        bu_RegisterCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(scene);
            }
        });
    }
}
