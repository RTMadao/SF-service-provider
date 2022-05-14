package com.salcedoFawcett.services.Provider.domain.model;

public class Affiliation {
    private int id;
    private String type;
    private String company;
    private int affiliationType;

    public Affiliation(){}

    public Affiliation(int id, String type, String company, int affiliationType) {
        this.id = id;
        this.type = type;
        this.company = company;
        this.affiliationType = affiliationType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAffiliationType() {
        return affiliationType;
    }

    public void setAffiliationType(int affiliationType) {
        this.affiliationType = affiliationType;
    }
}
