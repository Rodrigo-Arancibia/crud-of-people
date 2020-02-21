package ar.com.rodrigo.peoplecrud.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import ar.com.rodrigo.peoplecrud.domain.Person;

public interface PersonRepository extends Repository<Person, Long>{
	
	List<Person>findAll();
	Person findById(Long id);
	Person save(Person p);
	Person delete(Person p);
}