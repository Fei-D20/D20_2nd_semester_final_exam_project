package application.controller.eventcard;

import GUI.EventCard.AnP_EventCard;
import GUI.MainPane.AnP_Root;

import domain.eventcard.Dom_EventCard;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.AnchorPane;

import javax.swing.event.ChangeEvent;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-31-00.01
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_ChangeEventCard implements ChangeListener<Dom_EventCard> {
    @Override
    public void changed(ObservableValue<? extends Dom_EventCard> observable, Dom_EventCard oldValue, Dom_EventCard newValue) {

    }
}
