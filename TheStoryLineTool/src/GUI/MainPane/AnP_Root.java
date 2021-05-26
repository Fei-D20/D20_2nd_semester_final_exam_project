package GUI.MainPane;

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
public class AnP_Root {
    AnP_MenuBar anP_menuBar = new AnP_MenuBar();
    AnP_Canvas anP_canvas = new AnP_Canvas();
    AnP_EventTree anP_eventTree = new AnP_EventTree();
//    AnP_EventCardList anP_eventCardList = new AnP_EventCardList();
    AnP_EventCardEditPane anP_eventCardEditPane = new AnP_EventCardEditPane();

    public AnchorPane getRoot(){
        AnchorPane canvas = anP_canvas.getCanvas();
        AnchorPane eventTree = anP_eventTree.getEventTree();
        AnchorPane eventCardEditPane = anP_eventCardEditPane.getEventCardEditPane();
        AnchorPane menuBar = anP_menuBar.getMenuBar();
//        AnchorPane eventCardList = anP_eventCardList.getEventCardList();


        // So now we can set the four part on the borderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        borderPane.setCenter(canvas);
        borderPane.setLeft(eventTree);
        borderPane.setRight(eventCardEditPane);
        borderPane.setStyle("-fx-background-color: gray");

        BorderPane.setMargin(menuBar,new Insets(1));
        BorderPane.setMargin(eventTree,new Insets(1));
        BorderPane.setMargin(eventCardEditPane,new Insets(1));

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
