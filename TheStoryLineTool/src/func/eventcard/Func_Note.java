package func.eventcard;

import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-27-00.36
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_Note {
    public void write(String noteUrl,int eventID,String noteText){
        String text = "EventID=" + eventID + "\n" +
                "Note=" + noteText;
        Func_IO.write(noteUrl,text);
    }

    public ArrayList<String> read(String noteUrl){
        ArrayList<String> noteText = Func_IO.read(noteUrl);
        return noteText;
    }
}
