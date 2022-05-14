package com.salcedoFawcett.services.Provider.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String registration_name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "party_identification_id", referencedColumnName = "id")
    private PartyIdentification party_identification;
    private String sex;
    private Date birthday;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    private String addressZoneType;

    public Person(String registration_name, PartyIdentification party_identification, String sex, Date birthday, Address address, String addressZoneType) {
        this.registration_name = registration_name;
        this.party_identification = party_identification;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.addressZoneType = addressZoneType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistration_name() {
        return registration_name;
    }

    public void setRegistration_name(String registration_name) {
        this.registration_name = registration_name;
    }

    public PartyIdentification getParty_identification() {
        return party_identification;
    }

    public void setParty_identification(PartyIdentification party_identification) {
        this.party_identification = party_identification;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAddressZoneType() {
        return addressZoneType;
    }

    public void setAddressZoneType(String addressZoneType) {
        this.addressZoneType = addressZoneType;
    }
}
