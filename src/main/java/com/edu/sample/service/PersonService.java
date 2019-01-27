package com.edu.sample.service;

import java.util.List;

import com.edu.sample.model.Person;

public interface PersonService {
	void add(Person person);

	List<Person> listPersons();
}
