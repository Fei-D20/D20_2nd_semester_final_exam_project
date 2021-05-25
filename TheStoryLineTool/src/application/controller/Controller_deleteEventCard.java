package application.controller;

import GUI.MainPane.AnchorPane_EventCardList;
import GUI.Node.Node_EventCard;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-23.52
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Controller_deleteEventCard {
    public EventHandler<ActionEvent> removeEventCard(AnchorPane_EventCardList anchorPane_eventCardList){
        EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                /*
                 * here should get the event be selected event
                 */
                Node_EventCard node_eventCard = null;
                Object source = event.getSource();
                if (source instanceof Node_EventCard) {
                    node_eventCard = (Node_EventCard) source;
                }

                Object[] objects = anchorPane_eventCardList.tilePane_EventCardList.getChildren().toArray();
                if(objects instanceof Node_EventCard[]){
                    Node_EventCard[] node_eventCards = (Node_EventCard[]) objects;
                    for (Node_EventCard nec : node_eventCards) {
                        if(nec.equals(node_eventCard)){
                            anchorPane_eventCardList.tilePane_EventCardList.getChildren().remove(nec);
                        }
                    }

                }
            }
        };
        return eventHandler;
    }
}
