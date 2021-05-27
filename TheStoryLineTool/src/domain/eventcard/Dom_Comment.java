package domain.eventcard;

import java.util.Date;
import java.util.Objects;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-26-20.28
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Dom_Comment {
    private int eventID;
    private String authorOfComment;
    private Date timeOfComment;
    private String commentUrl;

    public Dom_Comment(int eventID) {
        this.eventID = eventID;
        this.commentUrl = "src/file/eventCard/eventCardComment/" + this.eventID + ".property";
    }

    public String getAuthorOfComment() {
        return authorOfComment;
    }

    public void setAuthorOfComment(String authorOfComment) {
        this.authorOfComment = authorOfComment;
    }

    public Date getTimeOfComment() {
        return timeOfComment;
    }

    public void setTimeOfComment(Date timeOfComment) {
        this.timeOfComment = timeOfComment;
    }


    @Override
    public String toString() {
        return "Dom_Comment{" +
                "eventID=" + eventID +
                ", authorOfComment='" + authorOfComment + '\'' +
                ", timeOfComment=" + timeOfComment +
                '}';
    }
}
