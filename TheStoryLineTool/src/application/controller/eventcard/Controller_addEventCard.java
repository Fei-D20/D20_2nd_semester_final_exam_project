package application.controller.eventcard;

import domain.eventcard.Dom_EventCard;
import func.eventCard.Func_EventCard;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import org.junit.Test;

import java.util.Date;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-23.27
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Controller_addEventCard {
//    public EventHandler<ActionEvent> addEventCard(AnP_EventCardList anP_eventCardList,String authorOfCard, Date timeOfCard){
        public EventHandler<ActionEvent> addEventCard(String authorOfCard, Date timeOfCard){

        // this is the part to create the event card at the application
        Func_EventCard func_eventCard = new Func_EventCard();
        Dom_EventCard eventCard = func_eventCard.createEventCard(authorOfCard,timeOfCard);
        System.out.println(eventCard.toString());

        // here is create the event card at the ui
        /*
        EventHandler<ActionEvent> actionEventEventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Node_EventCard node_eventCard = new Node_EventCard();

            }
        };
        return actionEventEventHandler;
         */
        return null;
    }

    @Test
    public void test(){
        Controller_addEventCard controller_addEventCard = new Controller_addEventCard();
        controller_addEventCard.addEventCard("fei",new Date());

    }


}
