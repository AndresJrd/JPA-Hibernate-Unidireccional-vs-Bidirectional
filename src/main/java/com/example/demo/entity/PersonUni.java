package com.example.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person_uni")
public class PersonUni {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPersona;
    private String name;
    @OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "person")
    private List<AddressUni> addresses;

    public PersonUni(){
        this.addresses = new ArrayList<>();
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long id) {
        this.idPersona = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AddressUni> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressUni> addresses) {
        this.addresses = addresses;
    }
}
