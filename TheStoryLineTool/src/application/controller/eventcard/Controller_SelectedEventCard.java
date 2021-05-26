package application.controller.eventcard;

import GUI.MainPane.AnP_EventCardList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-26-00.16
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Controller_SelectedEventCard {
    public ChangeListener<Boolean> SelectedEventCard(AnP_EventCardList anP_eventCardList){
        ChangeListener<Boolean> changeListener = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                System.out.println(newValue);
            }
        };

        return changeListener;

    }


}
