package com.application.opreation.eventtitle;

import com.domain.eventcard.Dom_EventCard;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ListView;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-11-01.25
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Opr_ModifyText implements ChangeListener<String> {

    private static ListView<Dom_EventCard> lv_EventList;

    public App_Opr_ModifyText() {
    }

    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
    }

    public static ListView<Dom_EventCard> getLv_EventList() {
        return lv_EventList;
    }

    public static void setLv_EventList(ListView<Dom_EventCard> lv_EventList) {
        App_Opr_ModifyText.lv_EventList = lv_EventList;
    }
}
