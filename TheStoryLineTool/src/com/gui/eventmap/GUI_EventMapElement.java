package com.gui.eventmap;

import com.domain.eventcard.Dom_EventCard;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-14-12.00
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_EventMapElement {

    public VBox showElement(ListView<Dom_EventCard> lv_EventList){
        Dom_EventCard selectedItem = lv_EventList.getSelectionModel().getSelectedItem();

        Label lb_EventMapEvent = new Label();
        lb_EventMapEvent.setPrefWidth(150);
        lb_EventMapEvent.setText(selectedItem.getEventName());
        lb_EventMapEvent.setStyle("-fx-background-color: darkgreen;-fx-font-size: 14;-fx-text-fill: white;");

        TextArea ta_EventMapEvent = new TextArea();
        ta_EventMapEvent.setText(selectedItem.getDom_event().getQuickNote());
        ta_EventMapEvent.setWrapText(true);
        ta_EventMapEvent.setEditable(false);

        VBox vb_EventMapEvent = new VBox();
        vb_EventMapEvent.setPrefWidth(150);
        vb_EventMapEvent.setPrefHeight(130);
        vb_EventMapEvent.setStyle("-fx-background-color: lightgray;");
        vb_EventMapEvent.setPadding(new Insets(2));
        vb_EventMapEvent.getChildren().addAll(lb_EventMapEvent, ta_EventMapEvent);

        return vb_EventMapEvent;
    }
}
