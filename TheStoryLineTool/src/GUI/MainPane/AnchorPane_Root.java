package GUI.MainPane;

import application.controller.Controller_addEventCard;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-23.11
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class AnchorPane_Root {
    AnchorPane_MenuBar anchorPane_menuBar = new AnchorPane_MenuBar();
    AnchorPane_Canvas anchorPane_canvas = new AnchorPane_Canvas();
    AnchorPane_EventTree anchorPane_eventTree = new AnchorPane_EventTree();
    AnchorPane_EventCardList anchorPane_eventCardList = new AnchorPane_EventCardList();

    public AnchorPane getRoot(){
        AnchorPane canvas = anchorPane_canvas.getCanvas();
        AnchorPane eventTree = anchorPane_eventTree.getEventTree();
        AnchorPane eventCardList = anchorPane_eventCardList.getEventCardList();
        AnchorPane menuBar = anchorPane_menuBar.getMenuBar(anchorPane_eventCardList);


        // So now we can set the four part on the borderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        borderPane.setCenter(canvas);
        borderPane.setLeft(eventTree);
        borderPane.setRight(eventCardList);
        borderPane.setStyle("-fx-background-color: gray");

        BorderPane.setMargin(menuBar,new Insets(1));
        BorderPane.setMargin(eventTree,new Insets(1));
        BorderPane.setMargin(eventCardList,new Insets(1));

        // this is behind of borderpane for set the margin for the scene
        AnchorPane root = new AnchorPane();
        root.getChildren().add(borderPane);
        root.setPadding(new Insets(5));
        AnchorPane.setTopAnchor(borderPane,0.0);
        AnchorPane.setLeftAnchor(borderPane,0.0);
        AnchorPane.setBottomAnchor(borderPane,0.0);
        AnchorPane.setRightAnchor(borderPane,0.0);

        return root;

    }
}
