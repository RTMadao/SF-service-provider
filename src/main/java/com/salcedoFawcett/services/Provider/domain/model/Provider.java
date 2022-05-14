package com.salcedoFawcett.services.Provider.domain.model;

import com.salcedoFawcett.services.Provider.persistence.entity.Address;
import com.salcedoFawcett.services.Provider.persistence.entity.ContactData;
import com.salcedoFawcett.services.Provider.persistence.entity.PartyIdentification;

import java.util.Set;

public class Provider {
    private int id;
    private int providerType;
    private PartyIdentification partyIdentification;
    private Address phisicalAddress;
    private String registrationName;
    private String catalogueLink;
    private ContactData contactData;
    private Set<PaymentMean> paymentMeans;

    public Provider(int providerType, PartyIdentification partyIdentification, Address phisicalAddress, String registrationName, String catalogueLink, ContactData contactData, Set<PaymentMean> paymentMeans) {
        this.providerType = providerType;
        this.partyIdentification = partyIdentification;
        this.phisicalAddress = phisicalAddress;
        this.registrationName = registrationName;
        this.catalogueLink = catalogueLink;
        this.contactData = contactData;
        this.paymentMeans = paymentMeans;
    }

    public Provider() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProviderType() {
        return providerType;
    }

    public void setProviderType(int providerType) {
        this.providerType = providerType;
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

    public String getRegistrationName() {
        return registrationName;
    }

    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    public String getCatalogueLink() {
        return catalogueLink;
    }

    public void setCatalogueLink(String catalogueLink) {
        this.catalogueLink = catalogueLink;
    }

    public ContactData getContactData() {
        return contactData;
    }

    public void setContactData(ContactData contactData) {
        this.contactData = contactData;
    }

    public Set<PaymentMean> getPaymentMeans() {
        return paymentMeans;
    }

    public void setPaymentMeans(Set<PaymentMean> paymentMeans) {
        this.paymentMeans = paymentMeans;
    }
}
