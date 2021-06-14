package com.application.opreation.eventcard;

import com.domain.eventcard.Dom_EventCard;
import com.domain.user.Dom_LoginedUser;
import com.function.eventCard.Func_Comment;
import com.function.eventCard.Func_Event;
import com.function.eventCard.Func_EventCard;
import com.function.eventCard.Func_Note;
import com.function.story.Func_EventList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.time.LocalDate;
import java.util.Random;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-29-17.02
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Opr_CreateNewEventCard implements EventHandler {

    private ListView<Dom_EventCard> lv_EventList;

    public App_Opr_CreateNewEventCard(ListView<Dom_EventCard> lv_EventList) {
        this.lv_EventList = lv_EventList;
    }

    @Override
    public void handle(Event event){

        Dom_EventCard newEventCard = new Dom_EventCard();

        newEventCard.setEventCardID(new Random().nextInt(999999));
        newEventCard.setAuthorName(Dom_LoginedUser.getInstance().getUserName());
        newEventCard.setEventName("new Event");
        newEventCard.setLocalDate(LocalDate.now());

        newEventCard.getDom_event().setEventID(newEventCard.getEventCardID());
//        newEventCard.getDom_event().setQuickNote("some thing happening");
//        newEventCard.getDom_event().setEventDate(LocalDate.now());

        newEventCard.getDom_note().setNoteID(newEventCard.getEventCardID());
//        newEventCard.getDom_note().setNoteText("What happened?");

        newEventCard.getDom_comment().setCommentID(newEventCard.getEventCardID());
//        newEventCard.getDom_comment().setCommentAuthor("who are you");
//        newEventCard.getDom_comment().setCommentText("what you want to say? ");
//        newEventCard.getDom_comment().setLocalDate(LocalDate.now());


        Func_Event func_event = new Func_Event();
        func_event.add(newEventCard.getDom_event());

        Func_Note func_note = new Func_Note();
        func_note.add(newEventCard.getDom_note());

        Func_Comment func_comment = new Func_Comment();
        func_comment.add(newEventCard.getDom_comment());

        Func_EventCard func_eventCard = new Func_EventCard();
        func_eventCard.add(newEventCard);

        Func_EventList func_eventList = new Func_EventList();
        func_eventList.add(newEventCard);

        lv_EventList.getItems().add(newEventCard);
        lv_EventList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        lv_EventList.getSelectionModel().clearSelection();
        lv_EventList.getSelectionModel().select(newEventCard);
        lv_EventList.scrollTo(lv_EventList.getSelectionModel().getSelectedIndex());
        lv_EventList.requestFocus();
    }
}
