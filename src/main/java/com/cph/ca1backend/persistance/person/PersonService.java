package com.cph.ca1backend.persistance.person;

import com.cph.ca1backend.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /*
     public PersonMapper(PersistenceManager persistenceManager) {
        this.persistenceManager = persistenceManager;
    }

    public Person getSpecificPerson(int personId) {
        Logger.getLogger("web").log(Level.INFO, "");

        return persistenceManager.getEntityManager().find(Person.class, personId);
    }

    public List<Person> getAllPeople() {
        TypedQuery<Person> query = persistenceManager.getEntityManager().createNamedQuery("getAllPeople", Person.class);

        return query.getResultList();
    }

    public void create(Person person) {
        Logger.getLogger("web").log(Level.INFO, "");

        persistenceManager.entityTransaction().begin();
        persistenceManager.getEntityManager().persist((person));
        persistenceManager.entityTransaction().commit();
    }
     */
}