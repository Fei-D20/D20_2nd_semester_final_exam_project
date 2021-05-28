package GUI.EventCard;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
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


        Label lb_event = new Label("Event : ");
        TextArea textArea_eventValue = new TextArea();

        textArea_eventValue.setPrefHeight(30);
        textArea_eventValue.setWrapText(true);
        textArea_eventValue.setEditable(false);
        textArea_eventValue.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getClickCount() == 2){
                    textArea_eventValue.setEditable(true);
                } else {
                    textArea_eventValue.setEditable(false);
                }
            }
        });
        textArea_eventValue.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if(newValue.length() > 120){
                    textArea_eventValue.setText(oldValue);
                }
            }
        });


        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(lb_chapter,lb_role,lb_time,lb_event,textArea_eventValue);
        vBox.setStyle("-fx-background-color: lightgray");

//        AnchorPane anchorPane = new AnchorPane(vBox);
//        AnchorPane.setLeftAnchor(vBox,1.0);
//        AnchorPane.setRightAnchor(vBox,1.0);
//        AnchorPane.setTopAnchor(vBox,1.0);
//        AnchorPane.setBottomAnchor(vBox,1.0);
//        anchorPane.getChildren().add(vBox);

        return vBox;
    }
}
