package com.cph.ca1backend.persistance.hobby;

import com.cph.ca1backend.entities.Hobby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbyService {
    @Autowired
    private HobbyRepository hobbyRepository;

    public List<Hobby> getAllHobbies() {
        return hobbyRepository.findAll();
    }

    public Hobby createHobby(Hobby person) {
        return hobbyRepository.save(person);
    }

    public void deleteHobby(Integer id) {
        hobbyRepository.deleteById(id);
    }
    
}