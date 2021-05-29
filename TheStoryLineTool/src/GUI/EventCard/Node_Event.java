package GUI.EventCard;

import application.opration.edit.Edit_InputLimit;
import application.opration.mouse.Opr_Editable_DoubleClick;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-28-01.14
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Node_Event {
    public Node showEvent(){


        Label lb_chapter = new Label("Chapter : ");
        Label lb_role = new Label("Role : ");
        Label lb_time = new Label("Time : ");



        TextArea textArea_eventValue = new TextArea();

        textArea_eventValue.setPrefHeight(30);
        textArea_eventValue.setWrapText(true);
        textArea_eventValue.setEditable(false);
        textArea_eventValue.setOnMouseClicked(new Opr_Editable_DoubleClick());
        textArea_eventValue.textProperty().addListener(new Edit_InputLimit(120,textArea_eventValue));

        textArea_eventValue.setPromptText("Please input in 120 word ");


        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(lb_chapter,lb_role,lb_time,textArea_eventValue);
        vBox.setStyle("-fx-background-color: lightgray");


        return vBox;
    }
}
