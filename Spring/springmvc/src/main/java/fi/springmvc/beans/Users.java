package fi.springmvc.beans;

import org.springframework.stereotype.Component;
@Component
public class Users {

    private String userName;
    private String password;
    private String name;
    private String email;

    // Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName; // Fixed assignment
    }

    public String getPassword() {
        return password; // Fixed return statement
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Default constructor
    public Users() {
        // Default constructor for Spring to create an instance
    }

    // Parameterized constructor
    public Users(String userName, String password, String name, String email) {
        super();
        this.userName = userName;
        this.password = password; // Fixed assignment
        this.name = name;
        this.email = email;
    }

    // Override toString() method for better debugging
    @Override
    public String toString() {
        return "Users [userName=" + userName + ", password=" + password + ", name=" + name + ", email=" + email + "]";
    }
}
