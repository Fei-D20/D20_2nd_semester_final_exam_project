package domain.eventcard;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-26-20.31
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Dom_EventCard  {
    private int eventID;
    private int authorID;
    private String eventName;

    private LocalDateTime editDate;
    public Dom_Event dom_event;
    public Dom_Note dom_note;
    public Dom_Comment dom_comment ;

    /**
     * on this constructor each time the event card be created. excepte the authorID should be identify.
     * the date should be create by the exactly time.
     * after that the eventID be created by the hashcode() method to based on different time for specialized.
     * and the reset part of object will also use the same event id .
     * @param authorID the author who is log in.
     */
    public Dom_EventCard(int authorID) {
        this.authorID = authorID;
        this.editDate = LocalDateTime.now();
        this.eventID = hashCode();
        this.eventName = "New Event";
        this.dom_event = new Dom_Event(this.eventID);
        this.dom_note = new Dom_Note(this.eventID);
        this.dom_comment = new Dom_Comment(this.eventID);
    }


    public int getEventID() {
        return eventID;
    }


    public int getAuthorID() {
        return authorID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getEditDate() {
        return editDate;
    }

    public void setEditDate(LocalDateTime editDate) {
        this.editDate = editDate;
    }

    public Dom_Event getDom_event() {
        return dom_event;
    }


    public Dom_Note getDom_note() {
        return dom_note;
    }


    public Dom_Comment getDom_comment() {
        return dom_comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dom_EventCard that = (Dom_EventCard) o;
        return eventID == that.eventID && authorID == that.authorID && Objects.equals(eventName, that.eventName) && Objects.equals(editDate, that.editDate) && Objects.equals(dom_event, that.dom_event) && Objects.equals(dom_note, that.dom_note) && Objects.equals(dom_comment, that.dom_comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventID, authorID, eventName, editDate, dom_event, dom_note, dom_comment);
    }

    @Override
    public String toString() {
        return "Dom_EventCard{" +
                "eventID=" + eventID +
                ", authorID=" + authorID +
                ", eventName='" + eventName + '\'' +
                ", editDate=" + editDate +
                '}';
    }
}
