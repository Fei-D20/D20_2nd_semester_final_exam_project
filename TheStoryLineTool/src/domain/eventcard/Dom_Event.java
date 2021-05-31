package domain.eventcard;

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
    private String eventName = "new Event";
    private String eventDate;
    private int chapterNo;
    private String role;
    private String location;
    private String eventDescribed;

    public Dom_Event() {
    }

    public Dom_Event(int eventID) {
        this.eventID = eventID;
    }

    public Dom_Event(int eventID, String eventName, String eventDate, int chapterNo, String role, String location, String eventDescribed) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.chapterNo = chapterNo;
        this.role = role;
        this.location = location;
        this.eventDescribed = eventDescribed;
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

    public String getEventDescribed() {
        return eventDescribed;
    }

    public void setEventDescribed(String eventDescribed) {
        this.eventDescribed = eventDescribed;
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
                ", eventDescribed='" + eventDescribed + '\'' +
                '}';
    }
}


