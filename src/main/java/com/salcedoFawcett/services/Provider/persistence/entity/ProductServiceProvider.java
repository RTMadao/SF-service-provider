package com.salcedoFawcett.services.Provider.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "provider_service")
public class ProductServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "identification_id", referencedColumnName = "id")
    private PartyIdentification partyIdentification;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "phisical_address_id", referencedColumnName = "id")
    private Address address;
    private String registrationName;
    private String catalogueLink;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "provider_id", referencedColumnName = "id")
    private Provider provider;

    public ProductServiceProvider() {
    }

    public ProductServiceProvider(PartyIdentification partyIdentification, Address address, String registrationName, String catalogueLink, Provider provider) {
        this.partyIdentification = partyIdentification;
        this.address = address;
        this.registrationName = registrationName;
        this.catalogueLink = catalogueLink;
        this.provider = provider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public PartyIdentification getPartyIdentification() {
        return partyIdentification;
    }

    public void setPartyIdentification(PartyIdentification partyIdentification) {
        this.partyIdentification = partyIdentification;
    }
}
