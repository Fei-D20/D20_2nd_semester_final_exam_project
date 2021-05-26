package application.controller;

import GUI.MainPane.AnchorPane_EventCardList;
import GUI.Node.Node_EventCard;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.TilePane;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-23.27
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Controller_addEventCard {
    public EventHandler<ActionEvent> addEventCard(AnchorPane_EventCardList anchorPane_eventCardList){
        EventHandler<ActionEvent> actionEventEventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Node_EventCard node_eventCard = new Node_EventCard();
                Node eventCard = node_eventCard.getEventCard(anchorPane_eventCardList);

                anchorPane_eventCardList.tilePane_EventCardList.getChildren().add(eventCard);
                TilePane.setMargin(eventCard,new Insets(1));
            }
        };
        return actionEventEventHandler;
    }
}
