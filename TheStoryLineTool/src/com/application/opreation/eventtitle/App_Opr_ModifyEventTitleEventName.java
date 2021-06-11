package com.application.opreation.eventtitle;

import com.domain.eventcard.Dom_EventCard;
import com.function.eventCard.Func_EventCard;
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
public class App_Opr_ModifyEventTitleEventName implements ChangeListener<String> {

    private ListView<Dom_EventCard> lv_EventList;

    public App_Opr_ModifyEventTitleEventName(ListView<Dom_EventCard> lv_EventList) {
        this.lv_EventList = lv_EventList;
    }

    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

        lv_EventList.getSelectionModel().getSelectedItem().setEventName(newValue);
        Dom_EventCard selectedItem = lv_EventList.getSelectionModel().getSelectedItem();
        Func_EventCard func_eventCard = new Func_EventCard();
        func_eventCard.modify(selectedItem);
        lv_EventList.refresh();


    }
}
