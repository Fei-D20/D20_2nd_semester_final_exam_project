package com.Application.controller.story;

import com.DB.util.CRUD_Util;
import com.DB.util.ConnectionUtil;
import com.Domain.eventcard.Dom_EventCard;
import com.Domain.story.Dom_EventList;
import com.Function.story.Func_EventList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

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
