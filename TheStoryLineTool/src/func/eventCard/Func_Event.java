package func.eventCard;

import java.util.ArrayList;
import java.util.Date;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-26-21.47
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_Event {
    public void write(String eventUrl, int eventNumber, String event, String role, Date eventTime,int chapter){
        String text = "EventNumber=" + eventNumber + "\n" +
                "Event=" + event + "\n" +
                "Role=" + role + "\n" +
                "EventTime=" + eventTime + "\n" +
                "Chapter=" + chapter +
                "url=" + eventUrl;
        Func_IO.write(eventUrl, text);
    }

    public ArrayList<String> read(String eventUrl){
        ArrayList<String> eventText = Func_IO.read(eventUrl);
        return eventText;
    }
}
