/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;
import java.util.Scanner;

public class Mehndi extends Services {

    double Charges = 0;

    double forwomen() {
        Scanner sc = new Scanner(System.in);
        String[] servicesforwomen = {"0.Mehndi Per Side", "1.Black Henna Per Side",
            "2.Feet Mehndi", "3.Stone+Glitter", "4.Enagagement Mehndi", "5.Bridal Mehndi", "6.Arm Band"};
        System.out.println("Our services are:");
        for (int i = 0; i < servicesforwomen.length; i++) {
            System.out.println(servicesforwomen[i]);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();

        switch (service) {
            case "0":
                System.out.println("Mehndi Per Side==250");
                Charges += 250;
                break;
            case "1":
                System.out.println("Black Henna Per Side==500");
                Charges += 500;
                break;
            case "2":
                System.out.println("Feet Mehndi==800");
                Charges += 800;
                break;
            case "3":
                System.out.println("Stone+Glitter==1500");
                Charges += 1500;
                break;
            case "4":
                System.out.println("Enagagement Mehndi==4000");
                Charges += 4000;
                break;
            case "5":
                System.out.println("Bridal Mehndi==5000");
                Charges += 5000;
                break;
            case "6":
                System.out.println("Arm Band==10000");
                Charges += 10000;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return Charges;
    }
}

    

