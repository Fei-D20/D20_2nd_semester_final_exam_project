package GUI.mainpane;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-23.07
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class AnchorPane_EventCardList {

    TilePane tilePane_EventCardList = new TilePane();

    public AnchorPane getEventCardList(){

        tilePane_EventCardList.setPrefHeight(800);
        tilePane_EventCardList.setPrefWidth(200);
        tilePane_EventCardList.setStyle("-fx-background-color: lightgray");

        Label lable_eventCardList = new Label("Event Card List");
        lable_eventCardList.setPrefSize(200,50);
        lable_eventCardList.setStyle("-fx-background-color: lightgray;" +
                "-fx-font-weight: bold;" +
                "-fx-font-size: 16");
        VBox vBox_EventCardList = new VBox(lable_eventCardList, tilePane_EventCardList);
        VBox.setMargin(lable_eventCardList,new Insets(0,0,1,0));

        AnchorPane anchorPane = new AnchorPane(vBox_EventCardList);
        // before here is all for the right side of borderPane
        return anchorPane;
    }
}
