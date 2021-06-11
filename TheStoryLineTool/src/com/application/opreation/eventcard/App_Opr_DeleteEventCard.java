package com.application.opreation.eventcard;

import com.domain.eventcard.Dom_EventCard;
import com.function.eventCard.Func_Comment;
import com.function.eventCard.Func_Event;
import com.function.eventCard.Func_EventCard;
import com.function.eventCard.Func_Note;
import com.function.story.Func_EventList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-11-00.37
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Opr_DeleteEventCard implements EventHandler {

    private ListView<Dom_EventCard> lv_EventList;

    @Override
    public void handle(Event event) {
        Dom_EventCard selectedItem = lv_EventList.getSelectionModel().getSelectedItem();

        Func_EventCard func_eventCard = new Func_EventCard();
        func_eventCard.delete(selectedItem);

        Func_Event func_event = new Func_Event();
        func_event.delete(selectedItem.getDom_event());

        Func_Note func_note = new Func_Note();
        func_note.delete(selectedItem.getDom_note());

        Func_Comment func_comment = new Func_Comment();
        func_comment.delete(selectedItem.getDom_comment());


        Func_EventList func_eventList = new Func_EventList();
        func_eventList.delete(selectedItem);

        lv_EventList.getItems().remove(selectedItem);

    }

    public ListView<Dom_EventCard> getLv_EventList() {
        return lv_EventList;
    }

    public void setLv_EventList(ListView<Dom_EventCard> lv_EventList) {
        this.lv_EventList = lv_EventList;
    }
}
