package com.gui.eventcard;

import com.application.opration.edit.Edit_InputLimit;
import com.application.opration.mouse.Opr_Editable_DoubleClick;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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
    public VBox showEvent(){
        Label lb_Event = new Label("Event : ");
        lb_Event.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;" + "-fx-background-color: darkgray");
        lb_Event.setPrefHeight(1);
        lb_Event.setPadding(new Insets(1));

        Label lb_EventChapter = new Label("Chapter : ");
        Label lb_EventRole = new Label("Role : ");
        Label lb_EventTime = new Label("Time : ");

        TextArea ta_EventValue = new TextArea();
        ta_EventValue.setPrefHeight(30);
        ta_EventValue.setWrapText(true);
        ta_EventValue.setEditable(false);
        ta_EventValue.setOnMouseClicked(new Opr_Editable_DoubleClick());
        ta_EventValue.textProperty().addListener(new Edit_InputLimit(120, ta_EventValue));
        ta_EventValue.setPromptText("Quick note :  max 120 words ");

        VBox vb_Event = new VBox(10);
        vb_Event.getChildren().addAll(lb_EventChapter, lb_EventRole, lb_EventTime, ta_EventValue);
        vb_Event.setStyle("-fx-background-color: lightgray");

        return vb_Event;
    }
}
