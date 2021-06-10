package com.domain.user;

import java.util.Objects;
import java.util.Random;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-01-14.47
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Dom_User {
    int userID;
    String userName;
    String passWord;
    Boolean isAuthor;

    public Dom_User() {
    }

    public Dom_User(String userName, String passWord) {
        this.userID = new Random().nextInt(999999);
        this.userName = userName;
        this.passWord = passWord;
    }

    public Dom_User(String userName, String passWord, boolean isAuthor) {
        this.userID = new Random().nextInt(999999);
        this.userName = userName;
        this.passWord = passWord;
        this.isAuthor = isAuthor;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Boolean getAuthor() {
        return isAuthor;
    }

    public void setAuthor(Boolean author) {
        isAuthor = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dom_User dom_user = (Dom_User) o;
        return userID == dom_user.userID && Objects.equals(userName, dom_user.userName) && Objects.equals(passWord, dom_user.passWord) && Objects.equals(isAuthor, dom_user.isAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, userName, passWord, isAuthor);
    }

    @Override
    public String toString() {
        return "Dom_User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", isAuthor=" + isAuthor +
                '}';
    }
}
