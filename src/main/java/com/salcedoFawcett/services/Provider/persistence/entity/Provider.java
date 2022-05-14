package com.salcedoFawcett.services.Provider.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int providerTypeId;
    @OneToMany(mappedBy="provider", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ProviderPaymentMeans> payment_means;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id", referencedColumnName = "id")
    private ContactData contact;

    public Provider(){}

    public Provider(int providerTypeId, Set<ProviderPaymentMeans> payment_means, ContactData contact) {
        this.providerTypeId = providerTypeId;
        this.payment_means = payment_means;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProviderTypeId() {
        return providerTypeId;
    }

    public void setProviderTypeId(int providerTypeId) {
        this.providerTypeId = providerTypeId;
    }

    public Set<ProviderPaymentMeans> getPayment_means() {
        return payment_means;
    }

    public void setPayment_means(Set<ProviderPaymentMeans> payment_means) {
        this.payment_means = payment_means;
    }

    public ContactData getContact() {
        return contact;
    }

    public void setContact(ContactData contact) {
        this.contact = contact;
    }

    public Provider addPaymentMeans(){
        this.payment_means.forEach(paymentMeans -> paymentMeans.setProvider(this));
        return this;
    }
}
