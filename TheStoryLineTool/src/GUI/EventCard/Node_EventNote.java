package GUI.EventCard;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-28-13.02
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Node_EventNote {

    public Node showNote(){

            TextArea ta_noteValue = new TextArea();

            ta_noteValue.setPrefHeight(250);
            ta_noteValue.setWrapText(true);
            ta_noteValue.setEditable(false);
            ta_noteValue.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    if(event.getClickCount() == 2){
                        ta_noteValue.setEditable(true);
                    } else {
                        ta_noteValue.setEditable(false);
                    }
                }
            });
            ta_noteValue.textProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if(newValue.length() > 2000){
                        ta_noteValue.setText(oldValue);
                    }
                }
            });

            ta_noteValue.setPromptText("Please input in 2000 word");


            VBox vBox = new VBox(10);
            vBox.getChildren().addAll(ta_noteValue);
            vBox.setStyle("-fx-background-color: lightgray");


            return vBox;
    }

}
