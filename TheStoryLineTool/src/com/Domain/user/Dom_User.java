package com.Domain.user;

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
    int authorID;
    String userName;
    String passWord;

    public Dom_User() {
    }

    public Dom_User(String userName, String passWord) {
        this.authorID = new Random().nextInt(999999);
        this.userName = userName;
        this.passWord = passWord;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dom_User dom_user = (Dom_User) o;
        return authorID == dom_user.authorID && Objects.equals(userName, dom_user.userName) && Objects.equals(passWord, dom_user.passWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorID, userName, passWord);
    }

    @Override
    public String toString() {
        return "Dom_User{" +
                "userID=" + authorID +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
