package com.test.amadeus.controller;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.amadeus.model.Person;
import com.test.amadeus.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/person")
@Api(tags = "person")
@CrossOrigin
public class PersonController {
	
	
	@Autowired
	private PersonService personService;
	
	
	static Logger log = Logger.getLogger(PersonController.class);
	
	@PostMapping(path = "/insert")
	@ApiOperation(value = "Persona agregada.", response = Person.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied") })
	public Person insertPerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	@PutMapping(path = "/update")
	@ApiOperation(value = "Persona Actualizada.", response = Person.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied") })
	public Person editPerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	 @DeleteMapping(path = "/delete")
	 @ApiOperation(value = "Persona Eliminada", response = Person.class)
	 @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Person doesn't exist")})
	    public void removePerson(@RequestParam Long idperson) {
		 personService.deletePersonById(idperson);
	    }
	 
	 @GetMapping(path = "/all")
	 @ApiOperation(value = "Get All Personas", response = Person.class)
	 @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Person doesn't exist")})
	    public List<Person> getAllPerson() {
	        return personService.getAllPerson();
	    }
	 
	 @GetMapping(path = "/getByID")
	 @ApiOperation(value = "Get ByID Detalle Personas", response = Person.class)
	 @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Person doesn't exist")})
	    public Optional<Person> getPersonByID(@RequestParam Long idperson) {
	        return personService.getById(idperson);
	    }


}
