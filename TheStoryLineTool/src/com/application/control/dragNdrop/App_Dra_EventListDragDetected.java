package com.application.control.dragNdrop;

import com.domain.eventcard.Dom_EventCard;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-14-09.08
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Dra_EventListDragDetected implements EventHandler<MouseEvent> {
    private AnchorPane anP_EventMap;
    ListView<Dom_EventCard> lv_EventList;

    public App_Dra_EventListDragDetected(AnchorPane anP_EventMap, ListView<Dom_EventCard> lv_EventList) {
        this.anP_EventMap = anP_EventMap;
        this.lv_EventList = lv_EventList;
    }

    @Override
    public void handle(MouseEvent event) {

        Dragboard dragboard = anP_EventMap.startDragAndDrop(TransferMode.ANY);
        dragboard.setDragView(new Text(lv_EventList.getSelectionModel().getSelectedItem().getEventName()).snapshot(null, null), event.getX(), event.getY());

        ClipboardContent cc = new ClipboardContent();
        cc.putString(lv_EventList.getSelectionModel().getSelectedItem().getEventName());

        dragboard.setContent(cc);

        lv_EventList.startFullDrag();
    }
}
