/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;

import java.util.Scanner;
import java.io.FileWriter;   
import java.io.IOException;  


public class Gym extends Services {

    double Charges = 0;

    double forwomen() {
        Scanner sc = new Scanner(System.in);

        String[] servicesforwomen = {"0.Weighttraining", "1.Aerobic", "2.Cardio", "3.Yoga", "4.Zomba"};
        System.out.println("Our services are:");
        for (String servicesforwomen1 : servicesforwomen) {
            System.out.println(servicesforwomen1);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();
        switch (service) {
            case "0":
                System.out.println("3 days in a week charges == 1000");
                Charges += 1000;
                break;
            case "1":
                System.out.println("2 days in a week charges == 2500");
                Charges += 2500 ;
                break;
            case "2":
                System.out.println("6 days in a week charges == 5000");
                Charges += 5000;
                break;
            case "3":
                System.out.println("5 days in a week charges == 4500");
                Charges += 4500;
                break;
            case "4":
                System.out.println(" zomba 1 day charges == 1000");
                Charges += 1000;
                break;
            default:
                break;
        }
        return Charges;
    }

    double formen() {

        Scanner sc = new Scanner(System.in);
        String[] servicesformen = {"1.Weighttraining", "2.Aerobic", "3.Cardio", "4.Yoga", "5.Zomba"};
        System.out.println("Our services are:");
        for (String servicesformen1 : servicesformen) {
            System.out.println(servicesformen1);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();
        switch (service) {
            case "0":
                System.out.println("3 days in a week charges == 1000");
                Charges += 1000;
                break;
            case "1":
                System.out.println("2 days in a week charges == 2500");
                Charges += 2500;
                break;
            case "2":
                System.out.println("6 days in a week charges == 5000");
                Charges += 5000;
                break;
            case "3":
                System.out.println("5 days in a week charges == 4500");
                Charges += 4500;
                break;
            case "4":
                System.out.println(" zomba 1 day charges == 1000");
                Charges += 1000;
                break;
            default:
                break;
        }
        return Charges;
    }
}
 

