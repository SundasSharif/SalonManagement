/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;

import java.util.Scanner;

/**
 *
 * @author Sundas Shareef
 */
public class Wax extends Services {

    double Charges = 0;

    double forwomen() {
        Scanner sc = new Scanner(System.in);
        String[] servicesforwomen = {"0.Upper Lip", "1.Lower Lip", "2. Chin",
            "3.Cheeks", "4. Forehead", "5.Nose", "6.Side Wax", "7.Full Face",
            "8.Neck Wax", "9.Arms Half", "10.Arms Full ", "11.Full Body Wax"};
        System.out.println("Our services are:");
        for (int i = 0; i < servicesforwomen.length; i++) {
            System.out.println(servicesforwomen[i]);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();

        switch (service) {
            case "0":
                System.out.println("Upper Lip ==60");
                Charges += 60;
                break;
            case "1":
                System.out.println("Lower Lip==60");
                Charges += 60;
                break;
            case "2":
                System.out.println("Chin==200");
                Charges += 200;
                break;
            case "3":
                System.out.println("Cheeks==250");
                Charges += 250;
                break;
            case "4":
                System.out.println("Forehead==200");
                Charges += 200;
                break;
            case "5":
                System.out.println("Nose==150");
                Charges += 150;
                break;
            case "6":
                System.out.println("Side Wax==300");
                Charges += 300;
                break;
            case "7":
                System.out.println("Full Face==900");
                Charges += 900;
                break;
            case "8":
                System.out.println("Neck Wax==300");
                Charges += 300;
                break;
            case "9":
                System.out.println("Arms Half==400");
                Charges += 400;
                break;
            case "10":
                System.out.println("Arms Full==700");
                Charges += 700;
                break;
            case "11":
                System.out.println("Full Body Wax==4000");
                Charges += 4000;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return Charges;
    }

    double formen() {
        Scanner sc = new Scanner(System.in);
        String[] servicesformen = {"0.Full body wax", "1.Chest waxing", "2.Back waxing", "3.Legs wAxing", "4.Armpit waxing",
            "5.Face threading"};
        System.out.println("Our services are:");
        for (int i = 0; i < servicesformen.length; i++) {
            System.out.println(servicesformen[i]);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();

        switch (service) {
            case "0":
                System.out.println("full body wax==4000");
                Charges += 4000;
                break;
            case "1":
                System.out.println("chest waxing==1000");
                Charges += 1000;
                break;
            case "2":
                System.out.println("back waxing==1200");
                Charges += 1200;
                break;
            case "3":
                System.out.println("legs waxing==800");
                Charges += 800;
                break;
            case "4":
                System.out.println("armpit waxing==600");
                Charges += 600;
                break;
            case "5":
                System.out.println("face threading==800");
                Charges += 800;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return Charges;
    }
}
