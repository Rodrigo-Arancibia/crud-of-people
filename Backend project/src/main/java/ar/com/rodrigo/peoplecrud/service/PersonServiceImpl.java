package ar.com.rodrigo.peoplecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.rodrigo.peoplecrud.domain.Person;
import ar.com.rodrigo.peoplecrud.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	@Override
	public List<Person> list() {
		return repository.findAll();
	}

	@Override
	public Person listById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Person add(Person p) {
		return repository.save(p);
	}

	@Override
    public Person edit(Person p) {
        return repository.save(p);
    }

    @Override
    public Person delete(Long id) {
        Person p = repository.findById(id);
        if(p!=null){
        	repository.delete(p);
        }
       return p;
    }

}