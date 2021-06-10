package com.Application.opration.create;

import com.Domain.eventcard.Dom_EventCard;
import com.Domain.story.Dom_EventList;
import com.Domain.user.Dom_LoginedUser;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;


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

    @Override
    public void handle(Event event){

        Dom_EventCard newEventCard = new Dom_EventCard();

        newEventCard.setAuthorName(Dom_LoginedUser.getInstance().getUserName());
        newEventCard.setEventName("new Event");

        newEventCard.getDom_event().setQuickNote("some thing happening");
        newEventCard.getDom_note().setNoteText("What happened?");
        newEventCard.getDom_comment().setCommentAuthor("who are you");
        newEventCard.getDom_comment().setCommentText("what you want to say? ");

        System.out.println("the new event card :" + newEventCard.toString());
        Dom_EventList.getInstance().add(newEventCard);
        lv_EventList.getItems().add(newEventCard);

        lv_EventList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        lv_EventList.getSelectionModel().clearSelection();
        lv_EventList.getSelectionModel().select(newEventCard);
        lv_EventList.scrollTo(lv_EventList.getSelectionModel().getSelectedIndex());
        lv_EventList.requestFocus();
    }

    public ListView<Dom_EventCard> getLv_EventList() {
        return lv_EventList;
    }

    public void setLv_EventList(ListView<Dom_EventCard> lv_EventList) {
        this.lv_EventList = lv_EventList;
    }
}
