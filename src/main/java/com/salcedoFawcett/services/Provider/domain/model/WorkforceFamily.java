package com.salcedoFawcett.services.Provider.domain.model;

import com.salcedoFawcett.services.Provider.persistence.entity.Address;
import com.salcedoFawcett.services.Provider.persistence.entity.PartyIdentification;

import java.util.Date;

public class WorkforceFamily {
    private int id;
    private  int personId;
    private PartyIdentification partyIdentification;
    private Address phisicalAddress;
    private String addressZoneType;
    private String registrationName;
    private Date birthday;
    private String sex;
    private String relationship;

    public WorkforceFamily(){}

    public WorkforceFamily(int id, int personId, PartyIdentification partyIdentification, Address phisicalAddress, String addressZoneType, String registrationName, Date birthday, String sex, String relationship) {
        this.id = id;
        this.personId = personId;
        this.partyIdentification = partyIdentification;
        this.phisicalAddress = phisicalAddress;
        this.addressZoneType = addressZoneType;
        this.registrationName = registrationName;
        this.birthday = birthday;
        this.sex = sex;
        this.relationship = relationship;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PartyIdentification getPartyIdentification() {
        return partyIdentification;
    }

    public void setPartyIdentification(PartyIdentification partyIdentification) {
        this.partyIdentification = partyIdentification;
    }

    public Address getPhisicalAddress() {
        return phisicalAddress;
    }

    public void setPhisicalAddress(Address phisicalAddress) {
        this.phisicalAddress = phisicalAddress;
    }

    public String getAddressZoneType() {
        return addressZoneType;
    }

    public void setAddressZoneType(String addressZoneType) {
        this.addressZoneType = addressZoneType;
    }

    public String getRegistrationName() {
        return registrationName;
    }

    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
