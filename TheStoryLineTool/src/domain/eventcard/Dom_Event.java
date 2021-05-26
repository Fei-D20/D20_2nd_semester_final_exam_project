package domain.eventcard;

import java.util.Date;
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
    private int eventNumber;
    private String event;
    private String role;
    private Date eventTime;
    private int Chapter;

    public Dom_Event(int eventID) {
        this.eventID = eventID;
    }

    public int getEventID() {
        return eventID;
    }

    public int getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(int eventNumber) {
        this.eventNumber = eventNumber;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public int getChapter() {
        return Chapter;
    }

    public void setChapter(int chapter) {
        Chapter = chapter;
    }

    @Override
    public String toString() {
        return "Dom_Event{" +
                "eventID=" + eventID +
                ", eventNumber=" + eventNumber +
                ", event='" + event + '\'' +
                ", role='" + role + '\'' +
                ", eventTime=" + eventTime +
                ", Chapter=" + Chapter +
                '}';
    }
}


