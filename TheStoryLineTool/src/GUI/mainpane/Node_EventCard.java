package GUI.mainpane;

import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.junit.Test;

import java.lang.annotation.Target;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-13.39
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Node_EventCard {
    public Node getEventCard(){
        VBox vBox = new VBox();
        TextField textField_Event = new TextField("Event: ");
        textField_Event.setPrefWidth(200);
        textField_Event.setPrefHeight(20);
        textField_Event.setStyle("-fx-background-color: #FFFF00;" +
                "-fx-text-fill: darkblue;");

        TextField textField_note = new TextField("Note: ");
        textField_Event.setPrefWidth(200);
        textField_Event.setPrefHeight(100);
        textField_note.setStyle("-fx-background-color: #FFFF00;" +
                "-fx-text-fill: darkblue;");

        TextField textField_comment = new TextField("Comment: ");
        textField_Event.setPrefWidth(200);
        textField_Event.setPrefHeight(100);
        textField_comment.setStyle("-fx-background-color: #FFFF00;" +
                "-fx-text-fill: darkblue;");

        vBox.getChildren().addAll(textField_Event,textField_note,textField_comment);

        return vBox;
    }
}
