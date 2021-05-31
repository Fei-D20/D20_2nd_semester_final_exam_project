package GUI.EventList;

import domain.eventcard.Dom_EventCard;
import domain.story.Dom_EventList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.util.StringConverter;

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
        ObservableList<Dom_EventCard> dom_eventCards = FXCollections.observableArrayList(Dom_EventList.getInstance());
        ListView<Dom_EventCard> lv_EventList = new ListView<Dom_EventCard>(dom_eventCards);
        lv_EventList.setEditable(true);
        lv_EventList.setCellFactory(TextFieldListCell.forListView(new StringConverter<Dom_EventCard>() {
            @Override
            public String toString(Dom_EventCard object) {
                String s = object.getAuthorID() + " : " + object.getEditDate() + object.getAuthorID();
                return s;
            }

            @Override
            public Dom_EventCard fromString(String string) {
                return null;
            }
        }));


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
