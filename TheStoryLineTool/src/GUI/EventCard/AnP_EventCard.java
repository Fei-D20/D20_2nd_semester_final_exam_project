package GUI.EventCard;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;



/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-13.39
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class AnP_EventCard {

    public AnchorPane showEventCard(){
        Node node_eventCardTitle = new Node_EventTitle().showEventCardTitle();
        Node node_event = new Node_Event().showEvent();
        Node node_eventNote = new Node_EventNote().showNote();
        Node node_eventComment = new Node_EventComment().showEventComment();

        Label lb_event = new Label("Event : ");
        lb_event.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;");
        lb_event.setPrefHeight(1);
        lb_event.setPadding(new Insets(1));

        Label lb_note = new Label("Note : ");
        lb_note.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;");
        lb_note.setPrefHeight(1);
        lb_note.setPadding(new Insets(1));

        Label lb_Comment = new Label("Comment : ");
        lb_Comment.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;");
        lb_Comment.setPrefHeight(1);
        lb_Comment.setPadding(new Insets(1));


        VBox vBox = new VBox();
        vBox.setStyle("-fx-background-color: darkgray");
        vBox.setPrefWidth(500); // this is decide the event card weight

        vBox.getChildren().addAll(
                node_eventCardTitle,
                lb_event,
                node_event,
                lb_note,
                node_eventNote,
                lb_Comment,
                node_eventComment
        );

        AnchorPane anchorPane = new AnchorPane(vBox);
        AnchorPane.setLeftAnchor(vBox,1.0);
        AnchorPane.setRightAnchor(vBox,1.0);
        AnchorPane.setTopAnchor(vBox,1.0);
        AnchorPane.setBottomAnchor(vBox,1.0);
        anchorPane.setStyle("-fx-background-color: lightgray");

        return anchorPane;
    }
}
