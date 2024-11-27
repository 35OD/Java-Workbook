package encapInheritance.model;

import java.util.Objects;


// this class defines a username and the user's email
public class User {

    // encapsulated fields for user details
    private String userName;
    private String email;

    // need empty constructor for extending
    public User() {
    }


    // constructor to init the user details
    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    // display user details
    public void displayDetails() {
        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
    }


    // getters and setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
