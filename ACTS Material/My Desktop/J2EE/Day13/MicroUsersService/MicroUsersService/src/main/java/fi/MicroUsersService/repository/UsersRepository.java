package fi.MicroUsersService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fi.MicroUsersService.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String>{

}
