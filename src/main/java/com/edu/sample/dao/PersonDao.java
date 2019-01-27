package com.edu.sample.dao;

import java.util.List;

import com.edu.sample.model.Person;

public interface PersonDao {
	void add(Person person);
	List<Person> listPersons();
}
