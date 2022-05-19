package com.test.amadeus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.amadeus.model.Person;

public interface PersonRepository extends JpaRepository <Person,Long> {

}
