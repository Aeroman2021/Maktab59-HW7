package com.MaktabSharif.hw7.q2.entities;

public abstract class NewspaperSubscription {

    private String name;
    private String address;
    private int rate;

    public NewspaperSubscription(String address,String name) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    public int getRate() {
        return rate;
    }

    public String getAddress() {
        return address;
    }

    public abstract  void setAddress(String address);
    public abstract boolean addressIsValid(String address);

    @Override
    public String toString() {
        return "Subscription Information{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rate=" + rate +
                '}';
    }
}
