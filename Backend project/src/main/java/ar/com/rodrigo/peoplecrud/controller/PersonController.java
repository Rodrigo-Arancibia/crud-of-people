package ar.com.rodrigo.peoplecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.rodrigo.peoplecrud.domain.Person;
import ar.com.rodrigo.peoplecrud.service.PersonService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/persons"})
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@GetMapping
	public List<Person>list(){
		return service.list();
	}
	
	@PostMapping
	public Person add(@RequestBody Person p) {
		return service.add(p);
	}
	
    @GetMapping(path = {"/{id}"})
    public Person listById(@PathVariable("id") Long id){
        return service.listById(id);
    }
    @PutMapping(path = {"/{id}"})
    public Person edit(@RequestBody Person p, @PathVariable("id") Long id){
        p.setId(id);
        return service.edit(p);
    }
    @DeleteMapping(path = {"/{id}"})
    public Person delete(@PathVariable("id") Long id){
        return service.delete(id);
    }
	
}