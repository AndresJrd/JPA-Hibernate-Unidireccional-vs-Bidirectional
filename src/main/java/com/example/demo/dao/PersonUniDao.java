package com.example.demo.dao;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonUni;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andres
 */
@Component
public class PersonUniDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void insert(PersonUni e) {
        em.persist(e);
    }
}
