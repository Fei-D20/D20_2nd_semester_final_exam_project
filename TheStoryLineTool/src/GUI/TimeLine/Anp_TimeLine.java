package GUI.TimeLine;

import GUI.EventMap.Node_EventMap;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-28-15.28
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Anp_TimeLine {
    public AnchorPane showTimeLine(){
        Label lb_TimeLine = new Label("Time Line : ");
        lb_TimeLine.setStyle("-fx-font-weight: bold;" +
                "-fx-font-size: 16;" +
                "-fx-background-color: lightgray;");
        lb_TimeLine.setPrefHeight(1);
        lb_TimeLine.setPrefWidth(2000);
        lb_TimeLine.setPadding(new Insets(1));

        Node node_TimeLine = new Node_TimeLine().showTimeLine();

        VBox vBox = new VBox();
        vBox.setPrefHeight(120); // this is decide the time line height
        vBox.setPrefWidth(2000);
        vBox.getChildren().addAll(lb_TimeLine,node_TimeLine);
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
