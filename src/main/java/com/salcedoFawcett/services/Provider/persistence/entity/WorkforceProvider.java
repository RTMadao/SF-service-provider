package com.salcedoFawcett.services.Provider.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "provider_workforce")
public class WorkforceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String workPosition;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person personalInfo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "provider_id", referencedColumnName = "id")
    private Provider provider;
    @OneToMany(mappedBy="provider", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ProviderWorkforceFamily> family;
    @OneToMany(mappedBy="provider", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Affiliation> affiliations;

    public WorkforceProvider(){}
    public WorkforceProvider(String workPosition, Person personalInfo, Provider provider, Set<ProviderWorkforceFamily> family, Set<Affiliation> affiliations) {
        this.workPosition = workPosition;
        this.personalInfo = personalInfo;
        this.provider = provider;
        this.family = family;
        this.affiliations = affiliations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(Person personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Set<ProviderWorkforceFamily> getFamily() {
        return family;
    }

    public void setFamily(Set<ProviderWorkforceFamily> family) {
        this.family = family;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public Set<Affiliation> getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(Set<Affiliation> affiliations) {
        this.affiliations = affiliations;
    }

    public WorkforceProvider addProviderWorkforceFamily(){
        this.family.forEach(familyMember -> familyMember.setProvider(this));
        return this;
    }

    public WorkforceProvider addAffiliations(){
        this.affiliations.forEach(affiliation -> affiliation.setProvider(this));
        return this;
    }
}
