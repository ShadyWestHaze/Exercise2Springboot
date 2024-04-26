package com.example.exercise2spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@CrossOrigin()
@RestController
public class ApiController {

    @Autowired
    private TextStorage textStorage;

    @Autowired
    private PersonService personService;

    @GetMapping("/getTime")
    public String getTime() {
        Date date = new Date();
        return date.toString();
    }

    @PostMapping("/saveText")
    public void saveText(@RequestBody String text) {
        textStorage.saveText(text);
    }

    @GetMapping("/getSavedTexts")
    public String getSavedTexts() {
        return textStorage.getSavedTexts();
    }

    @GetMapping("/getPersons")
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @PostMapping("/savePerson")
    public void savePerson(@RequestBody Person person) {
        personService.savePerson(person);
    }
}
