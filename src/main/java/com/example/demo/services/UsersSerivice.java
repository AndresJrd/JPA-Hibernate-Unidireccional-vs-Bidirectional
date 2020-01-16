/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.dao.UsersDao;
import com.example.demo.entity.Address;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres
 */
@Service
public class UsersSerivice {

    @Autowired
    private UsersDao usersDao;

    public Person insertUser(String street, String name) {
        try {
            Person person = new Person();
            Address address = new Address();
            person.setName(name);
            address.setStreet(street);
            address.setPerson(person);
            person.getAddresses().add(address);


            usersDao.insert(person);


            return person;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
