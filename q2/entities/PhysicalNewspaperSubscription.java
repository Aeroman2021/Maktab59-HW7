package com.MaktabSharif.hw7.q2.entities;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    private final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public PhysicalNewspaperSubscription(String name,String address) {
        super(address,name);
        setAddress(address);
    }

    @Override
    public void setAddress(String address) {
        if (addressIsValid(address)) {
            setRate(15);
            System.out.println("The subscription rate is " + getRate());
        } else {
            setRate(0);
            System.out.println("You have entered an wrong address");
        }
    }

    @Override
    public boolean addressIsValid(String address) {
        char[] charAddress = address.toCharArray();
        for (char digit : digits) {
            for (char ch : charAddress)
                if (ch == digit)
                    return true;
        }
        return false;
    }


}
