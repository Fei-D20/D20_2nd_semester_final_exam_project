package com.Domain.eventcard;

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
    private String eventDate;
    private int chapterNo;
    private String role;
    private String location;
    private String quickNote;

    public Dom_Event() {
    }


    public Dom_Event(int eventID, String eventName, String eventDate, int chapterNo, String role, String location, String quickNote) {
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

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
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
    public String toString() {
        return "Dom_Event{" +
                "eventID=" + eventID +
                ", eventName='" + eventName + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", chapterNo=" + chapterNo +
                ", role='" + role + '\'' +
                ", location='" + location + '\'' +
                ", eventDescribed='" + quickNote + '\'' +
                '}';
    }
}


