package com.salcedoFawcett.services.Provider.domain.model;

public class PaymentMean {
    private int id;
    private String paymentMeansId;
    private String note;

    public PaymentMean() {}

    public PaymentMean(String payment_means_id, String note) {
        this.paymentMeansId = payment_means_id;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymentMeansId() {
        return paymentMeansId;
    }

    public void setPaymentMeansId(String paymentMeansId) {
        this.paymentMeansId = paymentMeansId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
