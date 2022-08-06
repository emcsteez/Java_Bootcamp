package com.codingdojo.java.dojoninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.java.dojoninja.models.Dojo;
import com.codingdojo.java.dojoninja.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {

	@Override
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}