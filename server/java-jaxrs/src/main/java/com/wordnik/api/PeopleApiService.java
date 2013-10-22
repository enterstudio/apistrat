package com.wordnik.api;

import com.wordnik.model.*;

public class PeopleApiService {
  public static Person findPersonById(Long personId) {
    Person person = new Person();

    person.setId(8773);
    person.setUsername("fred");
    person.setFirstname("Fred");
    person.setLastname("Meyer");

    return person;
  }
}