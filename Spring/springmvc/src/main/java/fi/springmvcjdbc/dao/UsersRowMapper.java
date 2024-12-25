package fi.springmvcjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import fi.springmvc.beans.Users;

public class UsersRowMapper implements RowMapper<Users> {

    @Override
    public Users  mapRow(ResultSet rs, int rowNum) throws SQLException {
        // Create a new Users object
        Users objUsers = new Users();
        
        // Set values from the ResultSet into the Users object
        objUsers.setUserName(rs.getString("userName"));
        objUsers.setPassword(rs.getString("password"));
        objUsers.setName(rs.getString("name"));
        objUsers.setEmail(rs.getString("email"));
        
        // Return the populated Users object
        return objUsers;
    }
}
