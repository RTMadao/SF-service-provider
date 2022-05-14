package com.salcedoFawcett.services.Provider.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "address_id")
    private String municipeId;
    @Column(name = "country_subentity_code")
    private String departamentId;
    private String postalZone;
    private String addressLine;
    @Column(name = "country_identification_code")
    private String countryId;
    private String countryName;
    @Column(name = "country_language_id")
    private String countryLanguage;

    public Address() {
    }

    public Address(String municipeId, String departamentId, String postalZone, String addressLine, String countryId, String countryName, String countryLanguage) {
        this.municipeId = municipeId;
        this.departamentId = departamentId;
        this.postalZone = postalZone;
        this.addressLine = addressLine;
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryLanguage = countryLanguage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMunicipeId() {
        return municipeId;
    }

    public void setMunicipeId(String municipeId) {
        this.municipeId = municipeId;
    }

    public String getDepartamentId() {
        return departamentId;
    }

    public void setDepartamentId(String departamentId) {
        this.departamentId = departamentId;
    }

    public String getPostalZone() {
        return postalZone;
    }

    public void setPostalZone(String postalZone) {
        this.postalZone = postalZone;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryLanguage() {
        return countryLanguage;
    }

    public void setCountryLanguage(String countryLanguage) {
        this.countryLanguage = countryLanguage;
    }
}
