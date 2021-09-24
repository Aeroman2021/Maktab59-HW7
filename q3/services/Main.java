package com.MaktabSharif.hw7.q3.services;

import com.MaktabSharif.hw7.q3.entities.Element;
import com.MaktabSharif.hw7.q3.entities.MetalElement;
import com.MaktabSharif.hw7.q3.entities.NonMetalElement;

public class Main {
    public static void main(String[] args) {

        Element[] elements = new Element[4];
        elements[0] = new MetalElement("Fe" , 26,55.85 );
        elements[1] = new MetalElement("Cu" , 29,63.55 );
        elements[2] = new NonMetalElement("N" , 7,14.00728 );
        elements[3] = new NonMetalElement("S" , 16,32.66 );

        for (Element element : elements) {
            System.out.println(element);
            element.describeElement();
        }

    }
}
