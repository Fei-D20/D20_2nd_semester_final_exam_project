package GUI.EventMap;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-28-15.17
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class AnP_EventMap {
    public AnchorPane showEventMap(){
        Label lb_EventMap = new Label("Event Map : ");
        lb_EventMap.setStyle("-fx-font-weight: bold;" +
                "-fx-font-size: 16;" +
                "-fx-background-color: lightgray;");
        lb_EventMap.setPrefHeight(1);
        lb_EventMap.setPrefWidth(800);
        lb_EventMap.setPadding(new Insets(1));

        Node node_EventMap = new Node_EventMap().showEventMap();



        VBox vBox = new VBox();
        vBox.setPrefWidth(800); // this is decide the event card weight
        vBox.getChildren().addAll(lb_EventMap,node_EventMap);


        vBox.setStyle("-fx-background-color: gray");

        AnchorPane anchorPane = new AnchorPane(vBox);
        AnchorPane.setLeftAnchor(vBox,1.0);
        AnchorPane.setRightAnchor(vBox,1.0);
        AnchorPane.setTopAnchor(vBox,1.0);
        AnchorPane.setBottomAnchor(vBox,1.0);
        anchorPane.setStyle("-fx-background-color: lightgray");

        return anchorPane;
    }
}
