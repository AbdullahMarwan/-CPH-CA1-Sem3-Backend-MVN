package com.cph.ca1backend.persistance;

//import com.mysql.cj.jdbc.MysqlDataSource;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.HashMap;
import java.util.Map;

public class PersistenceManager {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public PersistenceManager(String entityUnit) {
        Map overridenProperties = new HashMap<>();

        /*

        overridenProperties.put("javax.persistence.jdbc.url", System.getenv("JDBC_DRIVER_PREFIX") + System.getenv("JDBC_HOST") + System.getenv("JDBC_DB") + System.getenv("JDBC_PARAMS"));
        overridenProperties.put("javax.persistence.jdbc.user", System.getenv("JDBC_USER"));
        overridenProperties.put("javax.persistence.jdbc.password", System.getenv("JDBC_PASSWORD"));

         */

        this.entityManagerFactory = Persistence.createEntityManagerFactory(entityUnit, overridenProperties);
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }

    public EntityTransaction entityTransaction() {
        return this.entityManager.getTransaction();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
