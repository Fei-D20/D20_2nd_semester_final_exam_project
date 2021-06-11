package com.application.opreation.story;

import com.domain.eventcard.Dom_EventCard;
import com.function.story.Func_EventList;
import com.gui.eventcard.GUI_EventCard;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-10-12.39
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Opr_EventList implements ChangeListener<Dom_EventCard> {
    private Dom_EventCard selectedEventCard;
    private ListView<Dom_EventCard> lv_EventList;
    private GUI_EventCard gui_eventCard;


    public static ObservableList<Dom_EventCard> getEventList(){
        return FXCollections.observableArrayList(Func_EventList.getEventList());
    }


    @Override
    public void changed(ObservableValue<? extends Dom_EventCard> observable, Dom_EventCard oldValue, Dom_EventCard newValue) {
        lv_EventList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        selectedEventCard = newValue;
        System.out.println("get new: " + selectedEventCard);
        if (selectedEventCard != null) {
            gui_eventCard.getGui_eventCardTitle().getLb_EventCardTitle().setText("Event Card : " + selectedEventCard.getEventCardID());
            gui_eventCard.getGui_eventCardTitle().getTf_EventTitleEventName().setText(selectedEventCard.getEventName());
            gui_eventCard.getGui_eventCardTitle().getTf_EventTitleAuthor().setText(selectedEventCard.getAuthorName());
            gui_eventCard.getGui_eventCardTitle().getTf_EventTitleDate().setText(String.valueOf(selectedEventCard.getLocalDate()));

            gui_eventCard.getGui_event().getTf_EventChapter().setText(String.valueOf(selectedEventCard.getDom_event().getChapterNo()));
            gui_eventCard.getGui_event().getTf_Role().setText(selectedEventCard.getDom_event().getRole());
//            gui_eventCard.getGui_event().getTf_Time().setText(selectedEventCard.getDom_event().getEventDate().toString());
//            gui_eventCard.getGui_event().getTa_EventValue().setText(selectedEventCard.getDom_event().getQuickNote());

        }
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

    public GUI_EventCard getGui_eventCard() {
        return gui_eventCard;
    }

    public void setGui_eventCard(GUI_EventCard gui_eventCard) {
        this.gui_eventCard = gui_eventCard;
    }
}
