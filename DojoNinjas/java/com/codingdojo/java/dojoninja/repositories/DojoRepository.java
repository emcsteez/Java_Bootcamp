package com.codingdojo.java.dojoninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.java.dojoninja.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {

	@Override
	List<Dojo> findAll();
}
