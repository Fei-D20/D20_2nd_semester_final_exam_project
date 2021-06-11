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

    private Dom_EventCard selectedEventCard;
    private ListView<Dom_EventCard> lv_EventList;

    public App_Opr_ModifyEventTitleEventName(Dom_EventCard selectedEventCard, ListView<Dom_EventCard> lv_EventList) {
        this.selectedEventCard = selectedEventCard;
        this.lv_EventList = lv_EventList;
    }

    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        Func_EventCard func_eventCard = new Func_EventCard();

        if(selectedEventCard != null) {
            selectedEventCard.setEventName(newValue);
            // here should be change the database but it not ...
        }

        lv_EventList.getSelectionModel().getSelectedItem().setEventName(newValue);
        lv_EventList.refresh();


    }

    public Dom_EventCard getSelectedEventCard() {
        return selectedEventCard;
    }

    public void setSelectedEventCard(Dom_EventCard selectedEventCard) {
        this.selectedEventCard = selectedEventCard;
    }

    public ListView<Dom_EventCard> getLv_EventList() {
        return lv_EventList;
    }

    public void setLv_EventList(ListView<Dom_EventCard> lv_EventList) {
        this.lv_EventList = lv_EventList;
    }
}
