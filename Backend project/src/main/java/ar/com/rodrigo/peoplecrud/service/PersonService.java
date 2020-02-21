package ar.com.rodrigo.peoplecrud.service;

import java.util.List;

import ar.com.rodrigo.peoplecrud.domain.Person;

public interface PersonService {
	
	List<Person>list();
	Person listById(Long id);
	Person add(Person p);
	Person edit(Person p);
	Person delete(Long id);
}