package com.codingdojo.java.authentication.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.java.authentication.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
 
	Optional<User> findByEmail(String email);
 
}
