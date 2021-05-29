package GUI.EventCard;

import application.opration.edit.Edit_InputLimit;
import application.opration.mouse.Opr_Editable_DoubleClick;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-28-13.18
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Node_EventComment {
    public Node showEventComment(){

        Label lb_Author = new Label("Author : ");
        Label lb_Date = new Label("Date : ");

        TextArea ta_Comment = new TextArea();

        ta_Comment.setPrefHeight(250);
        ta_Comment.setWrapText(true);
        ta_Comment.setEditable(false);
        ta_Comment.setOnMouseClicked(new Opr_Editable_DoubleClick());
        ta_Comment.textProperty().addListener(new Edit_InputLimit(2000,ta_Comment));
        ta_Comment.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(newValue);
            }
        });
        ta_Comment.setPromptText("Please input in 2000 word");


        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(lb_Author,lb_Date,ta_Comment);
        vBox.setStyle("-fx-background-color: lightgray");


        return vBox;
    }
}
