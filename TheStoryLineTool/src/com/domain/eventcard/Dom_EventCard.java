package com.domain.eventcard;

import java.time.LocalDate;
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
    private int eventCardID;
    private String eventName;
    private String authorName;
    private double localX;
    private double localY;
    private LocalDate localDate = LocalDate.now();
    private Dom_Event dom_event = new Dom_Event();
    private Dom_Note dom_note = new Dom_Note();
    private Dom_Comment dom_comment = new Dom_Comment();

    public Dom_EventCard() {
    }

    public Dom_EventCard(int eventCardID, String eventName, String authorName, LocalDate localDate) {
        this.eventCardID = eventCardID;
        this.eventName = eventName;
        this.authorName = authorName;
        this.localDate = localDate;
    }

    public Dom_EventCard(int eventCardID, String eventName, String authorName, LocalDate localDate, Dom_Event dom_event, Dom_Note dom_note, Dom_Comment dom_comment) {
        this.eventCardID = eventCardID;
        this.eventName = eventName;
        this.authorName = authorName;
        this.localDate = localDate;
        this.dom_event = dom_event;
        this.dom_note = dom_note;
        this.dom_comment = dom_comment;
    }

    public int getEventCardID() {
        return eventCardID;
    }

    public void setEventCardID(int eventCardID) {
        this.eventCardID = eventCardID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getLocalX() {
        return localX;
    }

    public void setLocalX(double localX) {
        this.localX = localX;
    }

    public double getLocalY() {
        return localY;
    }

    public void setLocalY(double localY) {
        this.localY = localY;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Dom_Event getDom_event() {
        return dom_event;
    }

    public void setDom_event(Dom_Event dom_event) {
        this.dom_event = dom_event;
    }

    public Dom_Note getDom_note() {
        return dom_note;
    }

    public void setDom_note(Dom_Note dom_note) {
        this.dom_note = dom_note;
    }

    public Dom_Comment getDom_comment() {
        return dom_comment;
    }

    public void setDom_comment(Dom_Comment dom_comment) {
        this.dom_comment = dom_comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dom_EventCard that = (Dom_EventCard) o;
        return eventCardID == that.eventCardID && Double.compare(that.localX, localX) == 0 && Double.compare(that.localY, localY) == 0 && Objects.equals(eventName, that.eventName) && Objects.equals(authorName, that.authorName) && Objects.equals(localDate, that.localDate) && Objects.equals(dom_event, that.dom_event) && Objects.equals(dom_note, that.dom_note) && Objects.equals(dom_comment, that.dom_comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventCardID, eventName, authorName, localX, localY, localDate, dom_event, dom_note, dom_comment);
    }

    @Override
    public String toString() {
        return "Dom_EventCard{" +
                "eventCardID=" + eventCardID +
                ", eventName='" + eventName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", localX=" + localX +
                ", localY=" + localY +
                ", localDate=" + localDate +
                ", dom_event=" + dom_event +
                ", dom_note=" + dom_note +
                ", dom_comment=" + dom_comment +
                '}';
    }
}
