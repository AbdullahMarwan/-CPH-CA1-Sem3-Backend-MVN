package com.cph.ca1backend.controllers;

import com.cph.ca1backend.constants.RestConstants;
import com.cph.ca1backend.entities.Person;
import com.cph.ca1backend.persistance.PersistenceManager;
import com.cph.ca1backend.persistance.PersonMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonsController {
    private final PersistenceManager persistenceManager = new PersistenceManager("persistenceunit");
    private final PersonMapper personMapper = new PersonMapper(persistenceManager);

    @GetMapping(value = "test")
    public String testEndpoint() {
        return "Hello test endpoint!";
    }

    @RequestMapping(
            value = "/",
            method = RequestMethod.GET,
            produces = RestConstants.MEDIA_TYPE_APPLICATION_JSON
    )
    public List<Person> getAllPersons() {
        return personMapper.getAllPeople();
    }

    @RequestMapping(
            value = "/",
            method = RequestMethod.POST,
            consumes = RestConstants.MEDIA_TYPE_APPLICATION_JSON,
            produces = RestConstants.MEDIA_TYPE_APPLICATION_JSON
    )
    public void createPerson(@RequestBody Person person) {
        System.out.println("Hello");
    }

//    @GetMapping
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Person getPersonById(@PathParam("id") int id) {
//        return personMapper.getById(id);
//    }
//
//    @PUT
//    @Path("/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public PersonDTO updatePerson(@PathParam("id") int id, PersonDTO person) {
//        return personsFacade.updatePerson(id, person);
//    }
}
