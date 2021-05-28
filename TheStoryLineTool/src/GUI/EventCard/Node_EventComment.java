package GUI.EventCard;

import com.sun.javafx.font.freetype.HBGlyphLayout;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
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

        ta_Comment.setPrefHeight(400);
        ta_Comment.setWrapText(true);
        ta_Comment.setEditable(false);
        ta_Comment.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getClickCount() == 2){
                    ta_Comment.setEditable(true);
                } else {
                    ta_Comment.setEditable(false);
                }
            }
        });
        ta_Comment.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if(newValue.length() > 2000){
                    ta_Comment.setText(oldValue);
                }
            }
        });


        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(lb_Author,lb_Date,ta_Comment);
        vBox.setStyle("-fx-background-color: lightgray");


        return vBox;
    }
}
