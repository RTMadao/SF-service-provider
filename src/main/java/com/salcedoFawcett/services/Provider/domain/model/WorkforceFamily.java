package com.salcedoFawcett.services.Provider.domain.model;

import com.salcedoFawcett.services.Provider.persistence.entity.Address;
import com.salcedoFawcett.services.Provider.persistence.entity.PartyIdentification;

import java.util.Date;

public class WorkforceFamily {
    private int id;
    private PartyIdentification partyIdentification;
    private Address phisicalAddress;
    private String addressZoneType;
    private String registrationName;
    private Date birthday;
    private String sex;
    private String relationship;
}
