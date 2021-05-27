package func.eventCard;

import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-27-00.53
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_Comment {
    public void write(String commentUrl,int eventID,String authorOfComment,String commentText){
        String text = "EventID=" + eventID + "\n" +
                "Author=" + authorOfComment + "\n" +
                "Comment=" + commentText +
                "url=" + commentUrl;
        Func_IO.write(commentUrl, text);
    }

    public ArrayList<String> read(String commentUrl){
        ArrayList<String> commentText = Func_IO.read(commentUrl);
        return commentText;
    }
}
