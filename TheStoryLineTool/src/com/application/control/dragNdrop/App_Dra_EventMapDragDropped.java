package com.application.control.dragNdrop;

import com.domain.eventcard.Dom_EventCard;
import com.gui.eventmap.GUI_EventMap;
import com.gui.eventmap.GUI_EventMapElement;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-14-09.23
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Dra_EventMapDragDropped implements EventHandler<DragEvent> {
    private ListView<Dom_EventCard> lv_EventList;
    private GUI_EventMap gui_eventMap;

    public App_Dra_EventMapDragDropped(ListView<Dom_EventCard> lv_EventList, GUI_EventMap gui_eventMap) {
        this.lv_EventList = lv_EventList;
        this.gui_eventMap = gui_eventMap;
    }

    @Override
    public void handle(DragEvent event) {

        VBox vb_EventMapEvent = new GUI_EventMapElement().showElement(lv_EventList);

        vb_EventMapEvent.setLayoutX(event.getSceneX() - 225);
        vb_EventMapEvent.setLayoutY(event.getSceneY() - 100);

        vb_EventMapEvent.setOnDragDetected(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                vb_EventMapEvent.startFullDrag();
            }
        });

        vb_EventMapEvent.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                vb_EventMapEvent.setLayoutX(event.getSceneX() - 225);
                vb_EventMapEvent.setLayoutY(event.getSceneY() - 100);
                lv_EventList.getSelectionModel().getSelectedItem().setLocalX(event.getSceneX() - 255);
                lv_EventList.getSelectionModel().getSelectedItem().setLocalY(event.getSceneX() - 100);
            }
        });

        gui_eventMap.getPane_EventMap().getChildren().add(vb_EventMapEvent);

    }
}
