package com.cph.CA1BackendMVN.persistance;

import com.cph.CA1BackendMVN.entities.Person;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonMapper {
    PersistenceManager persistenceManager;

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
}
