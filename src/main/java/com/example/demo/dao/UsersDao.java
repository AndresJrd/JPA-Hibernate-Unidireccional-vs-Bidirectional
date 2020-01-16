/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Andres
 */
@Component
public class UsersDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void insert(Person e) {
        em.persist(e);
    }

    public Person find(Long id) {
        return this.em.find(Person.class, id);
    }

}
