package GUI.mainpane;

import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeView;
import javafx.scene.layout.AnchorPane;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-23.04
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class AnchorPane_EventTree {
    TreeView<String> stringTreeView_EventCardTree = new TreeView<>();

    public AnchorPane getEventTree(){
        stringTreeView_EventCardTree.setPrefHeight(800);
        stringTreeView_EventCardTree.setPrefWidth(200);
        stringTreeView_EventCardTree.setTooltip(new Tooltip("event card tree"));
        stringTreeView_EventCardTree.setOpacity(0.5);

        AnchorPane anchorPane = new AnchorPane(stringTreeView_EventCardTree);
        // before here is all for the left side of borderPane
        return anchorPane;
    }
}
