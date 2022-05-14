package com.salcedoFawcett.services.Provider.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "provider_payment_means")
public class ProviderPaymentMeans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String payment_means_id;
    private String note;
    @ManyToOne()
    @JoinColumn(name = "provider_id")
    private Provider provider;

    public ProviderPaymentMeans() {}

    public ProviderPaymentMeans(String payment_means_id, String note) {
        this.payment_means_id = payment_means_id;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPayment_means_id() {
        return payment_means_id;
    }

    public void setPayment_means_id(String payment_means_id) {
        this.payment_means_id = payment_means_id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
