package com.application.opreation.story;

import com.domain.eventcard.Dom_EventCard;
import javafx.scene.control.ListView;
import javafx.util.StringConverter;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-14-10.26
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Converter_EventList extends StringConverter<Dom_EventCard> {
    private ListView<Dom_EventCard> lv_EventList;

    public App_Converter_EventList(ListView<Dom_EventCard> lv_EventList) {
        this.lv_EventList = lv_EventList;
    }

    @Override
    public String toString(Dom_EventCard object) {
        String s = object.getEventName();
        return s;
    }

    @Override
    public Dom_EventCard fromString(String string) {
        Dom_EventCard selectedItem = lv_EventList.getSelectionModel().getSelectedItem();

        int selectedIndex = lv_EventList.getSelectionModel().getSelectedIndex();
        String eventNumber = String.valueOf(selectedIndex + 1);

        selectedItem.setEventName("Event " + eventNumber + " : " + string);
        return selectedItem;
    }
}
