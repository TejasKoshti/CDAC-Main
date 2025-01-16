package fi.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.springmvcjdbc.dao.UsersDAO;
import fi.springmvc.beans.Users;
import jakarta.servlet.http.HttpSession;

@Controller
public class UsersController {

    @Autowired
    private UsersDAO userDAO;

    @Autowired
    private HttpSession session;

    // Prepare the user object for login
    @RequestMapping("/login")
    public void prepareUser(Model data) {
        Users objUser = new Users(); // Create a new user object
        data.addAttribute("objUser", objUser); // Add to model
    }

    // Prepare the user object for registration
    @RequestMapping("/newUser")
    public void prepareNewUser(Model data) {
        Users objUser = new Users(); // Create a new user object
        data.addAttribute("objUser", objUser); // Add to model
    }

    // Register a new user
    @RequestMapping("/register")
    public String registerUser(@ModelAttribute("objUser") Users objUser) {
        // Register the user via the DAO
        userDAO.registerUser(objUser.getUserName(), objUser.getPassword(), objUser.getName(), objUser.getEmail());
        return "success"; // Return success view after registration
    }

    // Authenticate the user
    @RequestMapping("/authenticate")
    public ModelAndView validateUser(@ModelAttribute("objUser") Users objUser) {
        // Get user details from the database using the provided username
        Users dbUser = userDAO.getUserDetails(objUser.getUserName());

        if (dbUser != null && objUser.getUserName().equals(dbUser.getUserName()) && objUser.getPassword().equals(dbUser.getPassword())) {
            // If credentials are valid, return welcome page with a custom message
            return new ModelAndView("welcome", "data", "Welcome " + objUser.getUserName() + " to the online shopping site");
        } else {
            // If authentication fails, return failure page with an error message
            return new ModelAndView("failure", "message", "Invalid authentication");
        }
    }
}
