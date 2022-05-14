package com.salcedoFawcett.services.Provider.domain.model;

import com.salcedoFawcett.services.Provider.persistence.entity.Address;
import com.salcedoFawcett.services.Provider.persistence.entity.ContactData;
import com.salcedoFawcett.services.Provider.persistence.entity.PartyIdentification;

import java.util.Date;
import java.util.Set;

public class WorkForceProvider {
    private int id;
    private int providerType;
    private PartyIdentification partyIdentification;
    private Address phisicalAddress;
    private String addressZoneType;
    private String registrationName;
    private Date birthday;
    private String sex;
    private String workPosition;
    private ContactData contactData;
    private Set<PaymentMean> paymentMeans;
    private Set<Affiliation> affiliations;
    private Set<WorkforceFamily> familyMembers;
}
