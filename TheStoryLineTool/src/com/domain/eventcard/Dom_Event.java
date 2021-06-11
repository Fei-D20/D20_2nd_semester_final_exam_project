package com.domain.eventcard;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-26-20.18
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Dom_Event {
    private int eventID;
    private String eventName;
    private LocalDate eventDate;
    private int chapterNo;
    private String role;
    private String location;
    private String quickNote;

    public Dom_Event() {
    }

    public Dom_Event(int eventID, String eventName, LocalDate eventDate, int chapterNo, String role, String location, String quickNote) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.chapterNo = chapterNo;
        this.role = role;
        this.location = location;
        this.quickNote = quickNote;
    }


    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public int getChapterNo() {
        return chapterNo;
    }

    public void setChapterNo(int chapterNo) {
        this.chapterNo = chapterNo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getQuickNote() {
        return quickNote;
    }

    public void setQuickNote(String quickNote) {
        this.quickNote = quickNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dom_Event dom_event = (Dom_Event) o;
        return eventID == dom_event.eventID && chapterNo == dom_event.chapterNo && Objects.equals(eventName, dom_event.eventName) && Objects.equals(eventDate, dom_event.eventDate) && Objects.equals(role, dom_event.role) && Objects.equals(location, dom_event.location) && Objects.equals(quickNote, dom_event.quickNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventID, eventName, eventDate, chapterNo, role, location, quickNote);
    }

    @Override
    public String toString() {
        return "Dom_Event{" +
                "eventID=" + eventID +
                ", eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", chapterNo=" + chapterNo +
                ", role='" + role + '\'' +
                ", location='" + location + '\'' +
                ", quickNote='" + quickNote + '\'' +
                '}';
    }
}


