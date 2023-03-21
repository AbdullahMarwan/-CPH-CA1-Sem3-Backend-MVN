package com.cph.ca1backend.controllers;

import com.cph.ca1backend.entities.Person;
import com.cph.ca1backend.constants.RestConstants;
import com.cph.ca1backend.persistance.person.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("persons")
@Tag(name = "Persons", description = "Persons API")
public class PersonsController {
    @Autowired
    private PersonService personService;

    @Operation(summary = "Get all persons")
    @RequestMapping(
            value = "/",
            method = RequestMethod.GET,
            produces = RestConstants.MEDIA_TYPE_APPLICATION_JSON
    )
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @Operation(summary = "Creates a person")
    @RequestMapping(
            value = "/",
            method = RequestMethod.POST,
            consumes = RestConstants.MEDIA_TYPE_APPLICATION_JSON,
            produces = RestConstants.MEDIA_TYPE_APPLICATION_JSON
    )
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    @Operation(summary = "Get Person by id")
    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = RestConstants.MEDIA_TYPE_APPLICATION_JSON
    )
    public Optional<Person> getPersonById(@PathVariable Integer id) {
        return personService.getPersonById(id);
    }

//TODO
//    @PUT
//    @Path("/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public PersonDTO updatePerson(@PathParam("id") int id, PersonDTO person) {
//        return personsFacade.updatePerson(id, person);
//    }
}
