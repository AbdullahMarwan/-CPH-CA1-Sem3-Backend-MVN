package com.cph.ca1backend.persistance.person;

import com.cph.ca1backend.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public void deletePerson(Integer id) {
        personRepository.deleteById(id);
    }

    public Optional<Person> getPersonById(Integer id) {
        Person examplePerson = new Person();
        examplePerson.setId(id);

        Example<Person> example = Example.of(examplePerson);
        Optional<Person> person = personRepository.findOne(example);

        return person;
    }
}