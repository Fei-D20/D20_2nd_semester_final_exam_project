package com.application.opreation.story;

import com.domain.eventcard.Dom_EventCard;
import com.function.story.Func_EventList;
import com.gui.eventcard.GUI_EventCard;
import com.gui.eventmap.GUI_EventMap;
import com.gui.eventmap.GUI_EventMapElement;
import com.gui.eventmap.GUI_View;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-10-12.39
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Opr_EventList implements ChangeListener<Dom_EventCard> {
    private ListView<Dom_EventCard> lv_EventList;
    private GUI_EventCard gui_eventCard;
    private GUI_View gui_view;
    private GUI_EventMap gui_eventMap;

    /**
     * this class is working for create and get the event list.
     * @param lv_EventList
     * @param gui_eventCard
     * @param gui_view
     * @param gui_eventMap
     */

    public App_Opr_EventList(ListView<Dom_EventCard> lv_EventList, GUI_EventCard gui_eventCard, GUI_View gui_view, GUI_EventMap gui_eventMap) {
        this.lv_EventList = lv_EventList;
        this.gui_eventCard = gui_eventCard;
        this.gui_view = gui_view;
        this.gui_eventMap = gui_eventMap;
    }

    public App_Opr_EventList() {
    }

    /**
     * get the event list though function from database
     * @return the observablelist for gui
     */
    public ObservableList<Dom_EventCard> getEventList(){
        return FXCollections.observableArrayList(Func_EventList.getEventList());
    }


    @Override
    public void changed(ObservableValue<? extends Dom_EventCard> observable, Dom_EventCard oldValue, Dom_EventCard newValue) {
        lv_EventList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        Dom_EventCard selectedEventCard = newValue;
        if (selectedEventCard != null) {
            gui_eventCard.getGui_eventCardTitle().getLb_EventCardTitle().setText("Event Card : " + selectedEventCard.getEventCardID());
            gui_eventCard.getGui_eventCardTitle().getTf_EventTitleEventName().setText(selectedEventCard.getEventName());
            gui_eventCard.getGui_eventCardTitle().getTf_EventTitleAuthor().setText(selectedEventCard.getAuthorName());
            gui_eventCard.getGui_eventCardTitle().getTf_EventTitleDate().setText(String.valueOf(selectedEventCard.getLocalDate()));

            gui_eventCard.getGui_event().getTf_EventChapter().setText(String.valueOf(selectedEventCard.getDom_event().getChapterNo()));
            gui_eventCard.getGui_event().getTf_Role().setText(selectedEventCard.getDom_event().getRole());
            gui_eventCard.getGui_event().getTf_Time().setText(String.valueOf(selectedEventCard.getDom_event().getEventDate()));
            gui_eventCard.getGui_event().getTa_EventValue().setText(selectedEventCard.getDom_event().getQuickNote());

            gui_eventCard.getGui_note().getTa_NoteValue().setText(selectedEventCard.getDom_note().getNoteText());

            gui_eventCard.getGui_comment().getTf_CommentDate().setText(String.valueOf(selectedEventCard.getDom_comment().getLocalDate()));
            gui_eventCard.getGui_comment().getTf_CommentAuthor().setText(selectedEventCard.getDom_comment().getCommentAuthor());
            gui_eventCard.getGui_comment().getTa_CommentValue().setText(selectedEventCard.getDom_comment().getCommentText());


            App_Opr_View.setSelectedEvent(selectedEventCard);
            gui_view.getTa_View().setText(App_Opr_View.getOutputText(selectedEventCard));


        }
        lv_EventList.refresh();
    }
}
