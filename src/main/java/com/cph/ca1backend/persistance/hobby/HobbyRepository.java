package com.cph.ca1backend.persistance.hobby;

import com.cph.ca1backend.entities.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Integer> {
}