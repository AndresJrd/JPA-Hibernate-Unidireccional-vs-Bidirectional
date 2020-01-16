# JPA-Hibernate-Unidireccional-vs-Bidirectional

This Example shows how hibernate works mapping OneToMany ManyToOne example


## One direction
http://localhost:8080/greeting


Hibernate: insert into person (name) values (?)
Hibernate: insert into address (city, house_number, id_persona, street, zip_code) values (?, ?, ?, ?, ?)

## Bidirectional 
http://localhost:8080/greeting


Hibernate: insert into person_uni (name) values (?)
Hibernate: insert into address_uni (city, house_number, person, street, zip_code) values (?, ?, ?, ?, ?)
Hibernate: update address_uni set person=? where id=?

