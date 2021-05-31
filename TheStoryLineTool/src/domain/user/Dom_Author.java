package domain.user;

import java.util.Objects;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-24-09.39
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Dom_Author {
    private String userName;
    private int authorID; // maybe on the gui is not necessary but database is useful
    private String password;

    public Dom_Author() {
    }

    public Dom_Author(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.authorID = hashCode();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
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
        Dom_Author that = (Dom_Author) o;
        return authorID == that.authorID && Objects.equals(userName, that.userName) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, authorID, password);
    }

    @Override
    public String toString() {
        return "Dom_Author{" +
                "authorName='" + userName + '\'' +
                ", authorID=" + authorID +
                ", password='" + password + '\'' +
                '}';
    }
}
