package com.example.exercise2spring;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonService {
    private List<Person> persons = new ArrayList<>();

    public void savePerson(Person person) {
        persons.add(person);
    }

    public List<Person> getPersons() {
        return persons;
    }
}
