package com.example.demo.services;

import com.example.demo.dao.PersonUniDao;
import com.example.demo.entity.AddressUni;
import com.example.demo.entity.PersonUni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonUniService {
    @Autowired
    PersonUniDao personUniDao;

    public PersonUni insertPersonUni(String street, String name) {
        try {
            PersonUni person = new PersonUni();
            AddressUni address = new AddressUni();
            person.setName(name);
            address.setStreet(street);
            person.getAddresses().add(address);

            personUniDao.insert(person);

            /**
             *
             Hibernate: insert into person_uni (name) values (?)
             Hibernate: insert into address_uni (city, house_number, person, street, zip_code) values (?, ?, ?, ?, ?)
             Hibernate: update address_uni set person=? where id=?
             */

            return person;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
