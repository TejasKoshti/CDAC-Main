package fi.MicroUsersService.services;

import java.util.List;

import fi.MicroUsersService.dto.UsersDTO;

public interface UsersService {
	public UsersDTO getUserDetails(String userName);
	
	public List<UsersDTO> allUsers();

}
