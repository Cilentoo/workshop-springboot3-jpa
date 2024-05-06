package com.educandoweb.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.WebServices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
