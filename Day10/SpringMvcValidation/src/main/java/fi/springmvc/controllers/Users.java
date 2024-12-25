package fi.springmvc.controllers;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Users {
	
	
	@NotEmpty(message="Username Cannot be blank")
	@Size(min=3,max=10,message = "Min char 3 and max 10")
	String userName;
	
	@NotEmpty(message = "Password cannot be blank")
	String password;
	
	String name;
	
	@Email(message = "Email is not correct format")
	String email;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
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
	
	

}
