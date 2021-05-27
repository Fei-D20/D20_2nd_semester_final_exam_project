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
    private String eventUrl;

    private String event;
    private String role;
    private String time;
    private int chapter;

    public Dom_Event(int eventID) {
        this.eventID = eventID;
        this.eventUrl  = "src/file/eventCard/event/" + this.eventID + ".property";
    }


    @Override
    public String toString() {
        return "Dom_Event{" +
                "eventID=" + eventID +
                ", event='" + event + '\'' +
                ", role='" + role + '\'' +
                ", eventTime=" + time +
                ", Chapter=" + chapter +
                '}';
    }
}


