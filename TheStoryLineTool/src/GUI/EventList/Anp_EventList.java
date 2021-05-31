package GUI.EventList;


import GUI.EventCard.AnP_EventCard;
import GUI.MainPane.AnP_Root;
import application.controller.eventcard.App_ChangeEventCard;
import domain.eventcard.Dom_EventCard;
import domain.story.Dom_EventList;
import domain.user.Dom_Author;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-27-12.24
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Anp_EventList {

    public AnchorPane showListView(){

        Label lb_EventList = new Label("Event List : ");
        lb_EventList.setStyle("-fx-font-weight: bold;" +
                "-fx-font-size: 16;");
        lb_EventList.setPrefHeight(1);
        lb_EventList.setPadding(new Insets(1));

        Node node_EventList = new Node_EventList().showEventList();
        ListView lv_EventList = (ListView) node_EventList;

        ButtonBar buttonBar = new ButtonBar();
        Button button = new Button("add");
        buttonBar.getButtons().add(button);

        // *
        Dom_Author fei = new Dom_Author("fei" , 001, 123);
        // *
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // create the domain object
                Dom_EventCard newEventCard = new Dom_EventCard(fei.getAuthorID());

                // put it into event list
                Dom_EventList.getInstance().add(newEventCard);

                // put it into the event list showing.
                lv_EventList.getItems().add(newEventCard);
            }
        });

        VBox vBox = new VBox();
        vBox.setPrefWidth(200); // this is decide the event card weight
        vBox.getChildren().addAll(lb_EventList,node_EventList,buttonBar);


        vBox.setStyle("-fx-background-color: darkgray");

        AnchorPane anchorPane = new AnchorPane(vBox);
        AnchorPane.setLeftAnchor(vBox,1.0);
        AnchorPane.setRightAnchor(vBox,1.0);
        AnchorPane.setTopAnchor(vBox,1.0);
        AnchorPane.setBottomAnchor(vBox,1.0);
        anchorPane.setStyle("-fx-background-color: lightgray");


        return anchorPane;

    }
}
