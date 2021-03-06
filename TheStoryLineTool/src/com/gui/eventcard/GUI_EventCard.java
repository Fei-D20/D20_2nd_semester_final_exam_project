package com.gui.eventcard;

import com.domain.eventcard.Dom_EventCard;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-09.11
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_EventCard {

    private GUI_EventCardTitle gui_eventCardTitle;
    private GUI_Event gui_event;
    private GUI_Note gui_note;
    private GUI_Comment gui_comment;



    public AnchorPane showEventCard(){
        // ************************ Event Card Title ******************************

        gui_eventCardTitle = new GUI_EventCardTitle();
        VBox vb_EventTitle = gui_eventCardTitle.showEventCard();


        // ****************** Event ******************

        gui_event = new GUI_Event();
        VBox vb_Event = gui_event.showEvent();


        //******* Note *********

        gui_note = new GUI_Note();
        VBox vb_Note = gui_note.showNote();

        // ****** Comment ********
        gui_comment = new GUI_Comment();
        VBox vb_Comment = gui_comment.showComment();


        VBox vb_EventCard = new VBox();
        vb_EventCard.setStyle("-fx-background-color: darkgray");
        vb_EventCard.setPrefWidth(500); // this is decide the event card weight
        vb_EventCard.getChildren().addAll(vb_EventTitle, vb_Event, vb_Note, vb_Comment);

        AnchorPane anP_EventCard = new AnchorPane(vb_EventCard);
        AnchorPane.setLeftAnchor(vb_EventCard, 1.0);
        AnchorPane.setRightAnchor(vb_EventCard, 1.0);
        AnchorPane.setTopAnchor(vb_EventCard, 1.0);
        AnchorPane.setBottomAnchor(vb_EventCard, 1.0);
        anP_EventCard.setStyle("-fx-background-color: lightgray");

        return anP_EventCard;
    }

    public GUI_EventCardTitle getGui_eventCardTitle() {
        return gui_eventCardTitle;
    }

    public void setGui_eventCardTitle(GUI_EventCardTitle gui_eventCardTitle) {
        this.gui_eventCardTitle = gui_eventCardTitle;
    }

    public GUI_Event getGui_event() {
        return gui_event;
    }

    public void setGui_event(GUI_Event gui_event) {
        this.gui_event = gui_event;
    }

    public GUI_Note getGui_note() {
        return gui_note;
    }

    public void setGui_note(GUI_Note gui_note) {
        this.gui_note = gui_note;
    }

    public GUI_Comment getGui_comment() {
        return gui_comment;
    }

    public void setGui_comment(GUI_Comment gui_comment) {
        this.gui_comment = gui_comment;
    }
}
