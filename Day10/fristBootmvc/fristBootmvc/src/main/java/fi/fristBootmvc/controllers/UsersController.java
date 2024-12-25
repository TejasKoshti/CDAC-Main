package fi.fristBootmvc.controllers;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.fristBootmvc.entity.Users;
import org.hibernate.Session;

@Controller
public class UsersController {

	@Autowired
	SessionFactory hibernateFactory;

	// Method to initialize the Users object for the login form
	@RequestMapping("/login")
	public String prepareUsers(Model data) {
		Users objUser = new Users();
		data.addAttribute("objuser", objUser); // Make sure variable names match case
		return "login"; // return the login view
	}

	// Method to handle the authentication process
	@RequestMapping("/authenticate")
	public ModelAndView authenticate(@ModelAttribute("objuser") Users objUser) {
		try (Session hibernateSession = hibernateFactory.openSession()) {
			// Fetch user from the database
			Users dbUser = (Users) hibernateSession.get(Users.class, objUser.getUserName());

			// Check if the user exists and the password matches
			if (dbUser != null && dbUser.getPassword().equals(objUser.getPassword())) {
				return new ModelAndView("welcome", "data", "Welcome to the online Boot MVC app");
			} else {
				return new ModelAndView("failure", "data", "Please login again");
			}
		} catch (Exception e) {
			// Handle exception if any (could log or show error message)
			return new ModelAndView("failure", "data", "An error occurred, please try again");
		}
	}
}
