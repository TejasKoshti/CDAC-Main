package fi.TicketAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fi.TicketAPI.DTO.*;
import fi.TicketAPI.Service.Service;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	Service service;
	
	@GetMapping("/getallticket")
	public List<TicketDTO> getallTickets()
	{
		return service.allTickets();
		
	}
}
