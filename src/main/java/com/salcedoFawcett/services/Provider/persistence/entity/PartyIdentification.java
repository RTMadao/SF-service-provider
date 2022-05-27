package com.salcedoFawcett.services.Provider.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "party_identification")
public class PartyIdentification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long partyIdentificationId;
    private int partyIdentificationSchemeId;
    private int partyIdentificationSchemeName;

    public PartyIdentification() {}

    public PartyIdentification(long partyIdentificationId, int partyIdentificationSchemeId, int partyIdentificationSchemeName) {
        this.partyIdentificationId = partyIdentificationId;
        this.partyIdentificationSchemeId = partyIdentificationSchemeId;
        this.partyIdentificationSchemeName = partyIdentificationSchemeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPartyIdentificationId() {
        return partyIdentificationId;
    }

    public void setPartyIdentificationId(long partyIdentificationId) {
        this.partyIdentificationId = partyIdentificationId;
    }

    public int getPartyIdentificationSchemeId() {
        return partyIdentificationSchemeId;
    }

    public void setPartyIdentificationSchemeId(int partyIdentificationSchemeId) {
        this.partyIdentificationSchemeId = partyIdentificationSchemeId;
    }

    public int getPartyIdentificationSchemeName() {
        return partyIdentificationSchemeName;
    }

    public void setPartyIdentificationSchemeName(int partyIdentificationSchemeName) {
        this.partyIdentificationSchemeName = partyIdentificationSchemeName;
    }
}
