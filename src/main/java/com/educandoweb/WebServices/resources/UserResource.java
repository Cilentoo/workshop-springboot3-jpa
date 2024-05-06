package com.educandoweb.WebServices.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.WebServices.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	/* implementation of basic application features user class (rest controllers)*/
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Lucas", "lucas@gmail.com", "9999999","12345");
		return ResponseEntity.ok().body(u);
	}
	
}
