package com.application.opreation.user.event;


import com.function.user.Func_ForgotPassword;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class App_Opr_SendPassword implements EventHandler<ActionEvent> {
    private TextField tf_Email;
    private TextField tf_username;

    /**
     * this is the action when the send email to user mail box.
     * @param tf_Email user input email address
     * @param tf_username user input username
     */
    public App_Opr_SendPassword(TextField tf_Email, TextField tf_username) {
        this.tf_Email = tf_Email;
        this.tf_username = tf_username;
    }

    @Override
    public void handle(ActionEvent event) {
        String email = tf_Email.getText();
        String username = tf_username.getText();
        Func_ForgotPassword func_forgotPassword = new Func_ForgotPassword();
        String password = func_forgotPassword.sendPassword(email, username);

        System.out.println("Password " + password + " is send to your Email");
    }
}


