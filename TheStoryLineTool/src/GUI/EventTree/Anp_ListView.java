package GUI.EventTree;

import func.eventcard.Func_EventCard;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.List;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-27-12.24
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Anp_ListView {
    public AnchorPane getListView(){

        ObservableList<String> eventCardList = new Func_EventCard().getEventCardList();
        ListView<String> stringListView = new ListView<>(eventCardList);
        stringListView.setPlaceholder(new Label("Event Card List"));
        stringListView.setPrefHeight(800);
        stringListView.setPrefWidth(200);
        stringListView.setOpacity(0.5);
        stringListView.setStyle("-fx-text-fill: blue;" +
                "-fx-font-size: 16;" +
                "-fx-font-weight: bold" );


        AnchorPane anchorPane = new AnchorPane(stringListView);
        return anchorPane;

    }
}
