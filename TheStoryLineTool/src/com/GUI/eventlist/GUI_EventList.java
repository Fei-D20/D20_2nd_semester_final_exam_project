package com.GUI.eventlist;

import com.Domain.eventcard.Dom_EventCard;
import com.Domain.story.Dom_EventList;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-08.40
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_EventList {

    private Label lb_EventList;
    private ListView<Dom_EventCard> lv_EventList;
    private Button bu_EventList_Add;
    private ButtonBar bb_EventList;


    public AnchorPane showEventList(){
        lb_EventList = new Label("Event List : ");

        lb_EventList.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;");
        lb_EventList.setPrefHeight(1);
        lb_EventList.setPadding(new Insets(1));


        lv_EventList = new ListView<Dom_EventCard>(FXCollections.observableArrayList(Dom_EventList.getInstance()));

        lv_EventList.setPlaceholder(new Label("Event Card List"));
        lv_EventList.setPrefHeight(700);
        lv_EventList.setPrefWidth(200);
        lv_EventList.setStyle("-fx-font-size: 12;" + "-fx-font-weight: bold");
        lv_EventList.setEditable(true);


        lv_EventList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);




        bb_EventList = new ButtonBar();
        bu_EventList_Add = new Button("Add");
        bb_EventList.getButtons().add(bu_EventList_Add);



        VBox vb_EventList = new VBox();
        vb_EventList.setPrefWidth(200); // this is decide the event card weight
        vb_EventList.getChildren().addAll(lb_EventList, lv_EventList, bb_EventList);
        vb_EventList.setStyle("-fx-background-color: darkgray");

        AnchorPane anP_EventList = new AnchorPane(vb_EventList);
        AnchorPane.setLeftAnchor(vb_EventList, 1.0);
        AnchorPane.setRightAnchor(vb_EventList, 1.0);
        AnchorPane.setTopAnchor(vb_EventList, 1.0);
        AnchorPane.setBottomAnchor(vb_EventList, 1.0);
        anP_EventList.setStyle("-fx-background-color: lightgray");

        return anP_EventList;

    }

    public Label getLb_EventList() {
        return lb_EventList;
    }

    public void setLb_EventList(Label lb_EventList) {
        this.lb_EventList = lb_EventList;
    }

    public ListView<Dom_EventCard> getLv_EventList() {
        return lv_EventList;
    }

    public void setLv_EventList(ListView<Dom_EventCard> lv_EventList) {
        this.lv_EventList = lv_EventList;
    }

    public ButtonBar getBb_EventList() {
        return bb_EventList;
    }

    public void setBb_EventList(ButtonBar bb_EventList) {
        this.bb_EventList = bb_EventList;
    }

    public Button getBu_EventList_Add() {
        return bu_EventList_Add;
    }

    public void setBu_EventList_Add(Button bu_EventList_Add) {
        this.bu_EventList_Add = bu_EventList_Add;
    }
}
