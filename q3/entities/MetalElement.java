package com.MaktabSharif.hw7.q3.entities;

public class MetalElement extends Element {


    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("======================================");
        System.out.println("Some properties of this element is : ");
        System.out.println(" a) Good conductors of electricity");
        System.out.println(" b) Good conductors of heat");
        System.out.println(" c) High density");
        System.out.println(" d) Malleable and ductile");
        System.out.println("======================================");

    }
}
