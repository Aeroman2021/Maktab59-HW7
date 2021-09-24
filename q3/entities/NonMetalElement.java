package com.MaktabSharif.hw7.q3.entities;

public class NonMetalElement extends Element {

    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("======================================");
        System.out.println("Some properties of this element is : ");
        System.out.println(" a) Poor conductors of electricity");
        System.out.println(" b) Poor conductors of heat");
        System.out.println(" c) Low density");
        System.out.println(" d) brittle");
        System.out.println("======================================");

    }
}
