package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDao {
	
	int insertPerson(UUID id, Person person);
	
	 default int insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}
	 
	 List<Person> selectAllPeople();
	 Optional<Person> selectPersonById(UUID id);
	
	 default int deletePersonById(UUID id) {
		 return 1;
	 }
	 
	 default int updatePersonById(UUID id, Person person) {
		 return 1;
	 }
}
