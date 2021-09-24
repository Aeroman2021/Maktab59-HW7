package com.MaktabSharif.hw7.q2.entities;

public class OnlineNewspaperSubscription extends NewspaperSubscription{

    public OnlineNewspaperSubscription(String name,String address) {
        super(address,name);
        setAddress(address);
    }

    @Override
    public void setAddress(String address) {
        if (addressIsValid(address)){
            setRate(9);
            System.out.println("The subscription rate is " + getRate());
        }
        else {
            System.out.println("You have entered an wrong address");
        }
    }

    @Override
    public boolean addressIsValid(String address) {
        for (char currentChar : address.toCharArray())
            if (currentChar == '@')
                return true;
        return false;
    }
}
