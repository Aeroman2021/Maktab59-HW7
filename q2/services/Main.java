package com.MaktabSharif.hw7.q2.services;

import com.MaktabSharif.hw7.q2.entities.PhysicalNewspaperSubscription;
import com.MaktabSharif.hw7.q2.entities.OnlineNewspaperSubscription;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Please choose a number");
            System.out.println("1) Subscribe for Physical Newspaper");
            System.out.println("2) Subscribe for Online NewsPaper");
            System.out.println("3) Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter address");
                    String address = scanner.next();
                    PhysicalNewspaperSubscription physicalNewspaperSubscription;
                    physicalNewspaperSubscription = new PhysicalNewspaperSubscription(name, address);
                    System.out.println("=======================================================");
                    System.out.println(physicalNewspaperSubscription);
                    System.out.println("=======================================================");
                }
                case 2 -> {
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter address");
                    String address = scanner.next();
                    OnlineNewspaperSubscription onlineNewspaperSubscription;
                    onlineNewspaperSubscription = new OnlineNewspaperSubscription(name, address);
                    System.out.println("=======================================================");
                    System.out.println(onlineNewspaperSubscription);
                    System.out.println("=======================================================");
                }
                case 3 -> {
                    System.out.println("=======================================================");
                    System.out.println("Exiting the application");
                    System.exit(0);
                    System.out.println("=======================================================");
                }
            }
        }

    }
}
