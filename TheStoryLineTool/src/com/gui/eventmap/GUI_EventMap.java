package com.gui.eventmap;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-09.17
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_EventMap {
    private TilePane tp_EventMap;
    public AnchorPane showEventMap(){
        Label lb_EventMap = new Label("Event Map : ");
        lb_EventMap.setStyle("-fx-font-weight: bold;" +
                "-fx-font-size: 16;" +
                "-fx-background-color: lightgray;");
        lb_EventMap.setPrefHeight(1);
        lb_EventMap.setPrefWidth(800);
        lb_EventMap.setPadding(new Insets(1));


        tp_EventMap = new TilePane();

        VBox vb_EventMap = new VBox();
        vb_EventMap.setPrefWidth(800); // this is decide the event card weight
        vb_EventMap.getChildren().addAll(lb_EventMap, tp_EventMap);
        vb_EventMap.setStyle("-fx-background-color: gray");


        AnchorPane anP_EventMap = new AnchorPane(vb_EventMap);
        AnchorPane.setLeftAnchor(vb_EventMap, 1.0);
        AnchorPane.setRightAnchor(vb_EventMap, 1.0);
        AnchorPane.setTopAnchor(vb_EventMap, 1.0);
        AnchorPane.setBottomAnchor(vb_EventMap, 1.0);
        anP_EventMap.setStyle("-fx-background-color: lightgray");

        return anP_EventMap;
    }

    public TilePane getTp_EventMap() {
        return tp_EventMap;
    }

    public void setTp_EventMap(TilePane tp_EventMap) {
        this.tp_EventMap = tp_EventMap;
    }
}
