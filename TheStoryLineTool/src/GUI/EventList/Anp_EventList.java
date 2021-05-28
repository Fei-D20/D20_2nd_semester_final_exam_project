package GUI.EventList;

import func.eventCard.Func_EventCard;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.util.Date;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-27-12.24
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Anp_EventList {
    public AnchorPane showListView(){

        Label lb_EventList = new Label("Event List : ");
        lb_EventList.setStyle("-fx-font-weight: bold;" +
                "-fx-font-size: 16;");
        lb_EventList.setPrefHeight(1);
        lb_EventList.setPadding(new Insets(1));

        Node node_eventlist = new Node_EventList().showEventList();


        VBox vBox = new VBox();
        vBox.setPrefWidth(200); // this is decide the event card weight
        vBox.getChildren().addAll(lb_EventList,node_eventlist);


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
