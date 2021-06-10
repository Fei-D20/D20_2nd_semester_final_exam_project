package com.gui.eventcard;

import com.application.opration.edit.Edit_InputLimit;
import com.application.opration.mouse.Opr_Editable_DoubleClick;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-09.08
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_Comment {
    public VBox showComment(){
        Label lb_Comment = new Label("Comment : ");
        lb_Comment.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;" + "-fx-background-color: darkgray;");
        lb_Comment.setPrefHeight(1);
        lb_Comment.setPrefWidth(500);
        lb_Comment.setPadding(new Insets(1));

        Label lb_CommentAuthor = new Label("Author : ");
        Label lb_CommentDate = new Label("Date : ");
        TextArea ta_CommentValue = new TextArea();
        ta_CommentValue.setPrefHeight(250);
        ta_CommentValue.setWrapText(true);
        ta_CommentValue.setEditable(false);
        ta_CommentValue.setOnMouseClicked(new Opr_Editable_DoubleClick());
        ta_CommentValue.setPromptText("event comment : max 2000 word");
        ta_CommentValue.textProperty().addListener(new Edit_InputLimit(2000, ta_CommentValue));
        ta_CommentValue.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(newValue);
            }
        });

        VBox vb_Comment = new VBox(10);
        vb_Comment.getChildren().addAll(lb_Comment, lb_CommentAuthor, lb_CommentDate, ta_CommentValue);
        vb_Comment.setStyle("-fx-background-color: lightgray");

        return vb_Comment;
    }
}
