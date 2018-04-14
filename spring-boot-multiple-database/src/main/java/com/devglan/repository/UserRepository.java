package com.devglan.repository;

import org.springframework.data.repository.CrudRepository;

import com.devglan.model.UserDetails;

public interface UserRepository extends CrudRepository<UserDetails, Long> {
	
	UserDetails findByEmail(String email);
	
}
