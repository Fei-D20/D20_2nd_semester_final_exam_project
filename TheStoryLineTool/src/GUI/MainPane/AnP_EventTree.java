package GUI.MainPane;

import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeItem;
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
public class AnP_EventTree {
    TreeView<String> stringTreeView_EventCardTree = new TreeView<String>();

    public AnchorPane getEventTree(){
        stringTreeView_EventCardTree.setPrefHeight(800);
        stringTreeView_EventCardTree.setPrefWidth(200);
        stringTreeView_EventCardTree.setOpacity(0.5);
        stringTreeView_EventCardTree.setStyle("-fx-text-fill: blue;" +
                "-fx-font-size: 16;" );
        TreeItem<String> root = new TreeItem<String>("root");

        TreeItem<String> event = new TreeItem<String>("Event");
        TreeItem<String> event1 = new TreeItem<String>("Event1");
        TreeItem<String> event2 = new TreeItem<String>("Event2");
        TreeItem<String> event3 = new TreeItem<String>("Event3");

        TreeItem<String> chapter = new TreeItem<>("Chapter");
        TreeItem<String> chapter1 = new TreeItem<>("Chapter1");
        TreeItem<String> chapter2 = new TreeItem<>("Chapter2");
        TreeItem<String> chapter3 = new TreeItem<>("Chapter3");

        stringTreeView_EventCardTree.setRoot(root);
        event.getChildren().addAll(event1,event2,event3);
        chapter.getChildren().addAll(chapter1,chapter2,chapter3);
        root.getChildren().addAll(event,chapter);

        root.setExpanded(true);
        event.setExpanded(true);
        chapter.setExpanded(true);
        root.setExpanded(true);



        AnchorPane anchorPane = new AnchorPane(stringTreeView_EventCardTree);
        // before here is all for the left side of borderPane
        return anchorPane;
    }
}
