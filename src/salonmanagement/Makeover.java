/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;
import java.util.Scanner;

public class Makeover extends Services {

    double Charges = 0;

    double forwomen() {
        Scanner sc = new Scanner(System.in);
        String[] servicesforwomen = {"0.Bridal makeup", "1.engagement", "2.Mayo Makeup", "3.Glamour Expert Party Makeup",
            "4.Expert Party Makeup", "5.Soft Party Makeup", "6.Glamour Eye Makeup", "7.Eyelashes+Eyeliner",
            "8.Dupatta Setting", "9.Jewellery Setting", "10.Bridal Half Services", "11.Bridal Casual Services",
            "12.Bridal Full Services", "13.Bridal exclusive Services", "14.Bridal special Services"};
        System.out.println("Our services are:");
        for (int i = 0; i < servicesforwomen.length; i++) {
            System.out.println(servicesforwomen[i]);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();
        switch (service) {
            case "0":
                System.out.println("Bridal makeup==25000");
                Charges += 25000;
                break;
            case "1":
                System.out.println("Engagement==15000");
                Charges += 15000;
                break;
            case "2":
                System.out.println("Mayo Makeup==12000");
                Charges += 12000;
                break;
            case "3":
                System.out.println("Glamour Expert Party Makeup==10000");
                Charges += 10000;
                break;
            case "4":
                System.out.println("Expert Party Makeup==8000");
                Charges += 8000;
                break;
            case "5":
                System.out.println("Soft Party Makeup==5000");
                Charges += 5000;
                break;
            case "6":
                System.out.println("Glamour Eye Makeup==4000");
                Charges += 4000;
                break;
            case "7":
                System.out.println("Eyelashes+Eyeliner==1000");
                Charges += 1000;
                break;
            case "8":
                System.out.println("Dupatta Setting==1000");
                Charges += 1000;
                break;
            case "9":
                System.out.println("Jewellery Setting==1000");
                Charges += 1000;
                break;
            case "10":
                System.out.println("Bridal Half Services==3500");
                Charges += 3500;
                break;
            case "11":
                System.out.println("Bridal full Services==7500");
                Charges += 7500;
                break;
            case "12":
                System.out.println("Bridal Casual Services==5000");
                Charges += 5000;
                break;
            case "13":
                System.out.println("Bridal exclusive Services==13000");
                Charges += 13000;
                break;
            case "14":
                System.out.println("Bridal special Services==10000");
                Charges += 10000;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return Charges;
    }

    double formen() {
        Scanner sc = new Scanner(System.in);
        String[] servicesformen = {"0.Groom makeup", "1.Turban's Setting", "2.Groom Services"};
        System.out.println("Our services are:");
        for (int i = 0; i < servicesformen.length; i++) {
            System.out.println(servicesformen[i]);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();
        switch (service) {
            case "0":
                System.out.println("Groom makeup==25000");
                Charges += 25000;
                break;
            case "1":
                System.out.println("Turban's Setting==1000");
                Charges += 1000;
                break;
            case "2":
                System.out.println("Groom Sevices==12000");
                Charges += 12000;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return Charges;
    }
}


