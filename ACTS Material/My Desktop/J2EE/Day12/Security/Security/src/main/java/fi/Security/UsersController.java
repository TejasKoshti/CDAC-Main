package fi.Security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController 
{
	@GetMapping("/accountpage")
	
	public String accountInfo() {
		return "This is your Profile page for your account";
	}

}
