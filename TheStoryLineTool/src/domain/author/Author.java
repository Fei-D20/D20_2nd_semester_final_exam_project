package domain.author;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Objects;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-24-09.39
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Author implements IF_User {
    private String name;
    private String userID;
    private String password;

    public Author() {
    }

    public Author(String name, String userID, String password) {
        this.name = name;
        this.userID = userID;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(userID, author.userID) && Objects.equals(password, author.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, userID, password);
    }


    @Override
    public java.lang.String toString() {
        return "Author{" +
                "name=" + name +
                ", userID=" + userID +
                ", password=" + password +
                '}';
    }
}
