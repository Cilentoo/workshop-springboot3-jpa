package com.educandoweb.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.WebServices.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
