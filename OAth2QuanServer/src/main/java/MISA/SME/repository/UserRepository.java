package MISA.SME.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import MISA.SME.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{
	
	//UserDetails findByContactEmail(String email);
	
}
