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
    private Set<WorkforceFamily> family;

    public WorkForceProvider(){}
    public WorkForceProvider(int id, int providerType, PartyIdentification partyIdentification, Address phisicalAddress, String addressZoneType, String registrationName, Date birthday, String sex, String workPosition, ContactData contactData, Set<PaymentMean> paymentMeans, Set<Affiliation> affiliations, Set<WorkforceFamily> family) {
        this.id = id;
        this.providerType = providerType;
        this.partyIdentification = partyIdentification;
        this.phisicalAddress = phisicalAddress;
        this.addressZoneType = addressZoneType;
        this.registrationName = registrationName;
        this.birthday = birthday;
        this.sex = sex;
        this.workPosition = workPosition;
        this.contactData = contactData;
        this.paymentMeans = paymentMeans;
        this.affiliations = affiliations;
        this.family = family;
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

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
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

    public Set<Affiliation> getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(Set<Affiliation> affiliations) {
        this.affiliations = affiliations;
    }

    public Set<WorkforceFamily> getFamily() {
        return family;
    }

    public void setFamily(Set<WorkforceFamily> family) {
        this.family = family;
    }
}
