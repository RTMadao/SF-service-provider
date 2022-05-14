package com.salcedoFawcett.services.Provider.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "affiliation")
public class Affiliation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private String company;
    private int affiliationType;
    @ManyToOne()
    @JoinColumn(name = "provider_workforce_id")
    private WorkforceProvider provider;

    public Affiliation(){}

    public Affiliation(String type, String company, int affiliationType) {
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

    public WorkforceProvider getProvider() {
        return provider;
    }

    public void setProvider(WorkforceProvider provider) {
        this.provider = provider;
    }
}
