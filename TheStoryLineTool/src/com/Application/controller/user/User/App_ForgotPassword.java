package com.Application.controller.user.User;


import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class App_ForgotPassword {
    public static void PasswordRequest(TextField tf_Email){
        String email = tf_Email.getText();

        System.out.println("Password is send to your Email");
    }

    public static void close(Stage stage){
        stage.close();
    }
}


