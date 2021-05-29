package domain.eventcard;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.text.SimpleDateFormat;
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
    private SimpleStringProperty authorOfComment;
    private Date timeOfComment;
    private SimpleStringProperty commentUrl;

    public Dom_Comment() {
    }

    public Dom_Comment(int eventID) {
        this.eventID = eventID;
    }

    public Dom_Comment(int eventID, String authorOfComment,String commentUrl) {
        this.eventID = eventID;
        this.authorOfComment.setValue(authorOfComment);
        this.timeOfComment = new Date();
        this.commentUrl.setValue(commentUrl);
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getAuthorOfComment() {
        return authorOfComment.get();
    }

    public SimpleStringProperty authorOfCommentProperty() {
        return authorOfComment;
    }

    public void setAuthorOfComment(String authorOfComment) {
        this.authorOfComment.set(authorOfComment);
    }

    public Date getTimeOfComment() {
        return timeOfComment;
    }

    public void setTimeOfComment(Date timeOfComment) {
        this.timeOfComment = timeOfComment;
    }

    public String getCommentUrl() {
        return commentUrl.get();
    }

    public SimpleStringProperty commentUrlProperty() {
        return commentUrl;
    }

    public void setCommentUrl(String commentUrl) {
        this.commentUrl.set(commentUrl);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dom_Comment that = (Dom_Comment) o;
        return Objects.equals(eventID, that.eventID) && Objects.equals(authorOfComment, that.authorOfComment) && Objects.equals(timeOfComment, that.timeOfComment) && Objects.equals(commentUrl, that.commentUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventID, authorOfComment, timeOfComment, commentUrl);
    }

    @Override
    public String toString() {
        return "Dom_Comment{" +
                "eventID=" + eventID +
                ", authorOfComment=" + authorOfComment +
                ", timeOfComment=" + timeOfComment +
                ", commentUrl=" + commentUrl +
                '}';
    }
}
