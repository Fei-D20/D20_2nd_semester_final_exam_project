package com.application.controller.story;

import com.domain.eventcard.Dom_EventCard;
import com.function.story.Func_EventList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-10-12.39
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_EventList {
    public static ObservableList<Dom_EventCard> getEventList(){
        return FXCollections.observableArrayList(Func_EventList.getEventList());
    }
}
