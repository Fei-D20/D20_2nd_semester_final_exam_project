package GUI.EventList;

import func.eventCard.Func_EventCard;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-28-15.09
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Node_EventList {
    public Node showEventList(){
        ObservableList<String> ObList_EventList = new Func_EventCard().getEventList();
        ListView<String> lv_EventList = new ListView<>(ObList_EventList);
        lv_EventList.setPlaceholder(new Label("Event Card List"));
        lv_EventList.setPrefHeight(700);
        lv_EventList.setPrefWidth(200);
        lv_EventList.setOpacity(0.5);
        lv_EventList.setStyle("-fx-text-fill: blue;" +
                "-fx-font-size: 16;" +
                "-fx-font-weight: bold" );


        return lv_EventList;
    }
}
