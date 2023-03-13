package com.cph.ca1backend.controllers;

import com.cph.ca1backend.constants.RestConstants;
import com.cph.ca1backend.entities.Hobby;
import com.cph.ca1backend.persistance.hobby.HobbyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hobbies")
@Tag(name = "Hobbies", description = "Hobbies API")
public class HobbiesController {
    @Autowired
    private HobbyService hobbyService;

    @Operation(summary = "Get all hobbies")
    @RequestMapping(
            value = "/",
            method = RequestMethod.GET,
            produces = RestConstants.MEDIA_TYPE_APPLICATION_JSON
    )
    public List<Hobby> getAllHobbies() {
        return hobbyService.getAllHobbies();
    }

    @Operation(summary = "Create a Hobby")
    @RequestMapping(
            value = "/",
            method = RequestMethod.POST,
            consumes = RestConstants.MEDIA_TYPE_APPLICATION_JSON,
            produces = RestConstants.MEDIA_TYPE_APPLICATION_JSON
    )
    public void createHobby(@RequestBody Hobby hobby) {
        System.out.println("Hello");
    }

//    @GetMapping
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Hobby getHobbyById(@PathParam("id") int id) {
//        return personMapper.getById(id);
//    }
//
//    @PUT
//    @Path("/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public HobbyDTO updateHobby(@PathParam("id") int id, HobbyDTO person) {
//        return hobbiesFacade.updateHobby(id, person);
//    }
}
