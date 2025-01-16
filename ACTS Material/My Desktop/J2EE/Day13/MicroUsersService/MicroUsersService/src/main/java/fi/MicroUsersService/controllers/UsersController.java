package fi.MicroUsersService.controllers;

import fi.MicroUsersService.dto.UsersDTO;
import fi.MicroUsersService.services.UsersService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UsersService userService;

	@GetMapping("/allUsers")
	public List<UsersDTO> allUsers() {
		return userService.allUsers();
	}

	@GetMapping("/getUserDetails")
	public UsersDTO getUserDetails(@RequestParam("uName") String uName) {
		return userService.getUserDetails(uName);
	}

}
