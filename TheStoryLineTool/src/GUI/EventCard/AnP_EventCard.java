package GUI.EventCard;

import javafx.scene.Node;
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
        Node eventCardTitle = new Node_EventTitle().showEventCardTitle();
        Node event = new Node_Event().showEvent();

        VBox vBox = new VBox();
        vBox.setPrefWidth(350);
        vBox.getChildren().addAll(eventCardTitle,event);
        vBox.setStyle("-fx-background-color: darkgray");

        AnchorPane anchorPane = new AnchorPane(vBox);
        AnchorPane.setLeftAnchor(vBox,1.0);
        AnchorPane.setRightAnchor(vBox,1.0);
        AnchorPane.setTopAnchor(vBox,1.0);
        AnchorPane.setBottomAnchor(vBox,1.0);
        anchorPane.setStyle("-fx-background-color: lightgray");

        return anchorPane;
    }
}
