package com.gui.eventmap;

import com.domain.eventcard.Dom_EventCard;
import com.function.story.Func_EventList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-09.17
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_EventMap {
    private Pane pane_EventMap;

    public AnchorPane showEventMap(){
        Label lb_EventMap = new Label("Event Map : ");
        lb_EventMap.setStyle("-fx-font-weight: bold;" +
                "-fx-font-size: 16;" +
                "-fx-background-color: lightgray;");
        lb_EventMap.setPrefHeight(1);
        lb_EventMap.setPrefWidth(800);
        lb_EventMap.setPadding(new Insets(1));



        pane_EventMap = new Pane();


        VBox vb_EventMap = new VBox();
        vb_EventMap.setPrefWidth(800); // this is decide the event card weight
        vb_EventMap.getChildren().addAll(lb_EventMap, pane_EventMap);
        vb_EventMap.setStyle("-fx-background-color: gray");


        AnchorPane anP_EventMap = new AnchorPane(vb_EventMap);
        AnchorPane.setLeftAnchor(vb_EventMap, 1.0);
        AnchorPane.setRightAnchor(vb_EventMap, 1.0);
        AnchorPane.setTopAnchor(vb_EventMap, 1.0);
        AnchorPane.setBottomAnchor(vb_EventMap, 1.0);
        anP_EventMap.setStyle("-fx-background-color: lightgray");


        return anP_EventMap;
    }

    public Pane getPane_EventMap() {
        return pane_EventMap;
    }

    public void setPane_EventMap(Pane pane_EventMap) {
        this.pane_EventMap = pane_EventMap;
    }
}
