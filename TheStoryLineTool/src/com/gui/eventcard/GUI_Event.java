package com.gui.eventcard;

import com.application.control.edit.Con_Edit_InputLimit;
import com.application.control.mouse.Con_Editable_DoubleClick;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-09.04
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_Event {
        private TextField tf_EventChapter;
        private TextField tf_Role;
        private TextField tf_Time;
        private TextArea ta_EventValue;
    public VBox showEvent(){
        Label lb_Event = new Label("Event : ");
        lb_Event.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;" + "-fx-background-color: darkgray");
        lb_Event.setPrefHeight(1);
        lb_Event.setPadding(new Insets(1));

        Label lb_EventChapter = new Label("Chapter : ");
        tf_EventChapter = new TextField();
        tf_EventChapter.setOnMouseClicked(new Con_Editable_DoubleClick());
        tf_EventChapter.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");

        Label lb_EventRole = new Label("Role : ");
        tf_Role = new TextField();
        tf_Role.setOnMouseClicked(new Con_Editable_DoubleClick());
        tf_Role.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");

        Label lb_EventTime = new Label("Time : ");
        tf_Time = new TextField();
        tf_Time.setOnMouseClicked(new Con_Editable_DoubleClick());
        tf_Time.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");


        TilePane tp_Event = new TilePane();
        tp_Event.getChildren().addAll(lb_EventChapter,tf_EventChapter,lb_EventRole,tf_Role,lb_EventTime,tf_Time);
        tp_Event.setStyle("-fx-background-color: lightgray");
        tp_Event.setPrefTileHeight(20);
        tp_Event.setPrefTileWidth(120);

        ta_EventValue = new TextArea();
        ta_EventValue.setPrefHeight(30);
        ta_EventValue.setWrapText(true);
        ta_EventValue.setEditable(false);
        ta_EventValue.setOnMouseClicked(new Con_Editable_DoubleClick());
        ta_EventValue.textProperty().addListener(new Con_Edit_InputLimit(120, ta_EventValue));
        ta_EventValue.setPromptText("Quick note :  max 120 words ");

        VBox vb_Event = new VBox(10);
        vb_Event.getChildren().addAll(lb_Event,tp_Event, ta_EventValue);
        vb_Event.setStyle("-fx-background-color: lightgray");

        return vb_Event;
    }

    public TextField getTf_EventChapter() {
        return tf_EventChapter;
    }

    public void setTf_EventChapter(TextField tf_EventChapter) {
        this.tf_EventChapter = tf_EventChapter;
    }

    public TextField getTf_Role() {
        return tf_Role;
    }

    public void setTf_Role(TextField tf_Role) {
        this.tf_Role = tf_Role;
    }

    public TextField getTf_Time() {
        return tf_Time;
    }

    public void setTf_Time(TextField tf_Time) {
        this.tf_Time = tf_Time;
    }

    public TextArea getTa_EventValue() {
        return ta_EventValue;
    }

    public void setTa_EventValue(TextArea ta_EventValue) {
        this.ta_EventValue = ta_EventValue;
    }
}
