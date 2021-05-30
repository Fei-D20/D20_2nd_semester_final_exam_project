package GUI.MainPane;

import GUI.EventCard.AnP_EventCard;
import GUI.EventList.Anp_EventList;
import GUI.EventMap.AnP_EventMap;
import GUI.MenuBar.AnP_ControlBar;
import GUI.TimeLine.Anp_TimeLine;
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

    public AnchorPane getRoot(){


        AnchorPane anP_EventCard = new AnP_EventCard().showEventCard();
        AnchorPane anp_ControlBar = new AnP_ControlBar().showControlBar();
        AnchorPane anP_EventList = new Anp_EventList().showListView();
        AnchorPane anP_EventMap = new AnP_EventMap().showEventMap();
        AnchorPane anP_TimeLine = new Anp_TimeLine().showTimeLine();


        // So now we can set the four part on the borderPane
        BorderPane borderPane = new BorderPane();

        borderPane.setTop(anp_ControlBar);
        borderPane.setCenter(anP_EventMap);
        borderPane.setLeft(anP_EventList);
        borderPane.setRight(anP_EventCard);
        borderPane.setBottom(anP_TimeLine);
        borderPane.setStyle("-fx-background-color: gray");

        BorderPane.setMargin(anp_ControlBar,new Insets(1));
        BorderPane.setMargin(anP_EventList,new Insets(1));
        BorderPane.setMargin(anP_EventCard,new Insets(1));
        BorderPane.setMargin(anP_EventMap,new Insets(1));
        BorderPane.setMargin(anP_TimeLine,new Insets(1));

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
