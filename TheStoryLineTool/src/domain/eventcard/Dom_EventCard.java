package domain.eventcard;

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
    private String authorOfCard;
    private Date timeOfCard;
    private String eventCardUrl;

    public Dom_Event dom_event = new Dom_Event(this.eventID);
    public Dom_Note dom_note = new Dom_Note(this.eventID);
    public Dom_Comment dom_comment = new Dom_Comment(this.eventID);

    public Dom_EventCard() {
    }

    public Dom_EventCard(int eventID) {
        this.eventID = eventID;
    }

    public Dom_EventCard(String authorOfCard, Date timeOfCard) {
        this.authorOfCard = authorOfCard;
        this.timeOfCard = timeOfCard;
        this.eventID = this.hashCode();
        this.eventCardUrl  = "src/file/eventCard/eventCard/" + this.eventID + ".property";
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getAuthorOfCard() {
        return authorOfCard;
    }

    public void setAuthorOfCard(String authorOfCard) {
        this.authorOfCard = authorOfCard;
    }

    public Date getTimeOfCard() {
        return timeOfCard;
    }

    public void setTimeOfCard(Date timeOfCard) {
        this.timeOfCard = timeOfCard;
    }

    public String getEventCardUrl() {
        return eventCardUrl;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dom_EventCard that = (Dom_EventCard) o;
        return eventID == that.eventID && Objects.equals(authorOfCard, that.authorOfCard) && Objects.equals(timeOfCard, that.timeOfCard) && Objects.equals(dom_event, that.dom_event) && Objects.equals(dom_note, that.dom_note) && Objects.equals(dom_comment, that.dom_comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorOfCard, timeOfCard, dom_event, dom_note, dom_comment);
    }

    @Override
    public String toString() {
        return "Dom_EventCard{" +
                "eventID=" + eventID +
                ", authorOfCard='" + authorOfCard + '\'' +
                ", timeOfCard=" + timeOfCard +
                ", dom_event=" + dom_event +
                ", dom_note=" + dom_note +
                ", dom_comment=" + dom_comment +
                '}';
    }
}
