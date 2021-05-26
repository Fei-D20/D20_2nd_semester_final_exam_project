package GUI.Node;

import GUI.MainPane.AnchorPane_EventCardList;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;



/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-13.39
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Node_EventCard {

    public Node getEventCard(AnchorPane_EventCardList anchorPane_eventCardList){
        VBox vBox = new VBox();

        Button delete = new Button("X");
//        delete.setPrefWidth(50);
//        delete.setPrefHeight(50);
        delete.setStyle("-fx-text-fill: Red;");
        delete.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            }
        });

        TextField textField_Event = new TextField("Event: ");
        textField_Event.setPrefWidth(200);
        textField_Event.setPrefHeight(20);
//        textField_Event.setStyle("-fx-background-color: #FFFF00;" +
//                "-fx-text-fill: darkblue;");

        TextField textField_note = new TextField("Note: ");
        textField_Event.setPrefWidth(200);
        textField_Event.setPrefHeight(100);
//        textField_note.setStyle("-fx-background-color: #FFFF00;" +
//                "-fx-text-fill: darkblue;");

        TextField textField_comment = new TextField("Comment: ");
        textField_Event.setPrefWidth(200);
        textField_Event.setPrefHeight(100);
//        textField_comment.setStyle("-fx-background-color: #FFFF00;" +
//                "-fx-text-fill: darkblue;");

        vBox.getChildren().addAll(delete,textField_Event,textField_note,textField_comment);
        vBox.setAlignment(Pos.BASELINE_RIGHT);
        vBox.setStyle("-fx-background-color: #FFFF00;" +
                "-fx-text-fill: darkblue");

        return vBox;
    }
}
