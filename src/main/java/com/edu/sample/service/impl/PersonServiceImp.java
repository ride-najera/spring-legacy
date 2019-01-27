package com.edu.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.sample.dao.PersonDao;
import com.edu.sample.model.Person;
import com.edu.sample.service.PersonService;

@Service
public class PersonServiceImp implements PersonService {

   @Autowired
   private PersonDao userDao;

   @Transactional
   public void add(Person person) {
      userDao.add(person);
   }

   @Transactional(readOnly = true)
   public List<Person> listPersons() {
      return userDao.listPersons();
   }

}