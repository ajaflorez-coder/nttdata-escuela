package com.nttdata.repository;

import com.nttdata.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

  public List<Person> getAll() {
    List<Person> people = new ArrayList<>();
    people.add(new Person(1, "Chura Lopez", "Jorge", "74589632", "10745896321"));
    people.add(new Person(2, "Mendes Quilcavilca", "maria", "01236547", "10012365471"));
    people.add(new Person(3, "Arias Lo", "Jesus", "74589612", "10745896121"));
    people.add(new Person(4, "Zavaleta Condemaita", "Martin", "41258976", "10412589761"));
    return people;
  }
}
