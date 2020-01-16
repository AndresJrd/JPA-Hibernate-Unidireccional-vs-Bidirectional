/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonUni;
import com.example.demo.services.PersonUniService;
import com.example.demo.services.UsersSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private UsersSerivice usersSerivice;

    @Autowired
    private PersonUniService personUniService;

    @RequestMapping("/greeting")
    public Person greeting() {
        try {
            Person user = usersSerivice.insertUser("admin@gmail", "Administrador");
            return user;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/greeting_uni")
    public PersonUni greetingUni() {
        try {
            PersonUni user = personUniService.insertPersonUni("admin@gmail", "Administrador");
            return user;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
