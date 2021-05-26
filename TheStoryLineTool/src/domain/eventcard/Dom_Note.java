package domain.eventcard;

import java.util.Objects;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-26-20.26
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Dom_Note {
    private int eventID;
    private StringBuffer noteText;

    public Dom_Note(int eventID) {
        this.eventID = eventID;
    }

    public int getEventID() {
        return eventID;
    }

    public StringBuffer getNoteText() {
        return noteText;
    }

    public void setNoteText(StringBuffer noteText) {
        this.noteText = noteText;
    }

    @Override
    public String toString() {
        return "Dom_Note{" +
                "eventID=" + eventID +
                ", noteText=" + noteText +
                '}';
    }
}
