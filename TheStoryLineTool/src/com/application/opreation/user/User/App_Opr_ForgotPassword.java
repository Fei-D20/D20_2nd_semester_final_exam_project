package com.application.opreation.user.User;


import com.function.user.Func_ForgotPassword;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class App_Opr_ForgotPassword {
    public static void PasswordRequest(TextField tf_Email,TextField tf_username){
        String email = tf_Email.getText();
        String username = tf_username.getText();
        Func_ForgotPassword func_forgotPassword = new Func_ForgotPassword();
        String password = func_forgotPassword.sendPassword(email, username);

        System.out.println("Password " + password + " is send to your Email");
    }

    public static void close(Stage stage){
        stage.close();
    }
}


