package fi.RESTClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

//import javax.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;

import java.net.URI;
import java.net.URISyntaxException;

@Controller
public class UsersMVCController {

	RestTemplate restTemplate = new RestTemplate();

	@Autowired
	HttpServletRequest request;

//    @PostConstruct
//    public void initializeRestClient() {
//        restTemplate = new RestTemplate();
//    }

	@RequestMapping("/showusers")
	public void showAllUsers(Model data) {
		try {
			int pageNo = Integer.parseInt(request.getParameter("pageNo"));
			URI uri = new URI("http://localhost:9092/users/allUsers/" + pageNo + "/10");
			ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
			data.addAttribute("users", response.getBody());
		} catch (NumberFormatException e) {
			e.printStackTrace(); // Handle the case where pageNo is not a valid integer
		} catch (RestClientException e) {
			e.printStackTrace(); // Handle errors while calling the REST API
		} catch (URISyntaxException e) {
			e.printStackTrace(); // Handle URI syntax errors
		}
//        return "users"; // Return the name of the JSP/HTML page to display
	}
}
