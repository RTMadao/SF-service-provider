package com.salcedoFawcett.services.Provider.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "provider_workforce_family")
public class ProviderWorkforceFamily {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne()
    @JoinColumn(name = "provider_workforce_id")
    private WorkforceProvider provider;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person familyMember;
    private String relationship;

    public ProviderWorkforceFamily(Person familyMember, String relationship) {
        this.familyMember = familyMember;
        this.relationship = relationship;
    }

    public WorkforceProvider getProvider() {
        return provider;
    }

    public void setProvider(WorkforceProvider provider) {
        this.provider = provider;
    }

    public Person getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(Person familyMember) {
        this.familyMember = familyMember;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

}
