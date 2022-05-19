package com.test.amadeus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.amadeus.model.Person;
import com.test.amadeus.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public Person savePerson(Person person) {
        return personRepository.save(person);
    }
	
	public Person editPerson(Person person) {
        return personRepository.save(person);
    }
	
	public void deletePersonById(Long idperson) {
		personRepository.deleteById(idperson);
    }
	
	public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
	
	
	public Optional<Person> getById(Long idperson) {
        return personRepository.findById(idperson);
    }
	
}
