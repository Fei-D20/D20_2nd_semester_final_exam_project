package GUI.MenuBar;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-22.44
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class AnP_ControlBar {

    public AnchorPane showControlBar(){
        Node node_MenuBar = new Node_MenuBar().showMenuBar();
        Node node_QuickStart = new Node_QuickStart().showQuickStart();


        // here add the menubar and quickstart on a vbox and set the gap of each of them
        VBox vBoxControlArea = new VBox(node_MenuBar,node_QuickStart);
        vBoxControlArea.setSpacing(3);

        // add the vbox of control area on the anchorPane for let it fit with the scene
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(vBoxControlArea);
        anchorPane.setPrefHeight(60);
        anchorPane.setStyle("-fx-background-color: lightgray;");
        AnchorPane.setTopAnchor(vBoxControlArea,0.0);
        AnchorPane.setLeftAnchor(vBoxControlArea,0.0);
        AnchorPane.setRightAnchor(vBoxControlArea,0.0);
        AnchorPane.setBottomAnchor(vBoxControlArea,0.0);

        // before here is all for the top side of borderPane
        return anchorPane;
    }
}
