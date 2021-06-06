package com.Domain.eventcard;

import java.time.LocalDateTime;
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
    private int commentID;
    private String commentAuthor;
    private LocalDateTime localDateTime;
    private String commentText;

    public Dom_Comment() {
    }

    public Dom_Comment(int commentID, String commentAuthor, LocalDateTime localDateTime, String commentText) {
        this.commentID = commentID;
        this.commentAuthor = commentAuthor;
        this.localDateTime = localDateTime;
        this.commentText = commentText;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dom_Comment that = (Dom_Comment) o;
        return commentID == that.commentID && Objects.equals(commentAuthor, that.commentAuthor) && Objects.equals(localDateTime, that.localDateTime) && Objects.equals(commentText, that.commentText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentID, commentAuthor, localDateTime, commentText);
    }

    @Override
    public String toString() {
        return "Dom_Comment{" +
                "eventID=" + commentID +
                ", commentAuthor='" + commentAuthor + '\'' +
                ", localDateTime=" + localDateTime +
                ", commentText='" + commentText + '\'' +
                '}';
    }
}
