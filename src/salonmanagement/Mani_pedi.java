/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;
import java.util.Scanner;


public class Mani_pedi extends Services {

    double Charges = 0;

    double forwomen() {
        Scanner sc = new Scanner(System.in);
        String[] servicesforwomen = {"0.Causal Manicure", "1.Casual Pedicure",
            "2.Paraffin", "3.Manicure with bleach", "4.Pedicure with bleach",
            "5.Guinot Manicure with bleach", "6.Guinot Pedicure with bleach",
            "7. O.P.I Manicure", "8.O.P.I Pedicure", "9.Nail Art", "10.French Tip"};
        System.out.println("Our services are:");
        for (int i = 0; i < servicesforwomen.length; i++) {
            System.out.println(servicesforwomen[i]);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();

        switch (service) {
            case "0":
                System.out.println("Casual Manicure==800");
                Charges += 800;
                break;
            case "1":
                System.out.println("Casual Pedicure==800");
                Charges += 800;

                break;
            case "2":
                System.out.println("Paraffin==600");
                Charges += 600;
                break;
            case "3":
                System.out.println("Manicure with bleach==1500");
                Charges += 1500;
                break;
            case "4":
                System.out.println("Pedicure with bleach==1600");
                Charges += 1600;
                break;
            case "5":
                System.out.println("Guinot Manicure with bleach==2000");
                Charges += 2000;
                break;
            case "6":
                System.out.println("Guinot pedicure with bleach ==2200");
                Charges += 2200;
                break;
            case "7":
                System.out.println("O.P.I Manicure==2500");
                Charges += 2500;
                break;
            case "8":
                System.out.println("O.P.I Pedicure ==2500");
                Charges += 2500;
                break;
            case "9":
                System.out.println("Nail Art==1000");
                Charges += 1000;
                break;
            case "10":
                System.out.println(" French Tip==500");
                Charges += 500;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return Charges;
    }

    double formen() {
        Scanner sc = new Scanner(System.in);
        String[] servicesforwomen = {"0.Causal Manicure", "1.Casual Pedicure",
            "2.Paraffin", "3.Manicure with bleach", "4.Pedicure with bleach",
            "5.Guinot Manicure with bleach", "6.Guinot Pedicure with bleach",
            "7. O.P.I Manicure", "8.O.P.I Pedicure"};
        System.out.println("Our services are:");
        for (int i = 0; i < servicesforwomen.length; i++) {
            System.out.println(servicesforwomen[i]);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();

        switch (service) {
            case "0":
                System.out.println("Casual Manicure==800");
                Charges += 800;
                break;
            case "1":
                System.out.println("Casual Pedicure==800");
                Charges += 800;
                break;
            case "2":
                System.out.println("Paraffin==600");
                Charges += 600;
                break;
            case "3":
                System.out.println("Manicure with bleach==1500");
                Charges += 1500;
                break;
            case "4":
                System.out.println("Pedicure with bleach==1600");
                Charges += 1600;
                break;
            case "5":
                System.out.println("Guinot Manicure with bleach==2000");
                Charges += 2000;
                break;
            case "6":
                System.out.println("Guinot pedicure with bleach ==2200");
                Charges += 2200;
                break;
            case "7":
                System.out.println("O.P.I Manicure==2500");
                Charges += 2500;
                break;
            case "8":
                System.out.println("O.P.I Pedicure ==2500");
                Charges += 2500;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return Charges;
    }
}

    

