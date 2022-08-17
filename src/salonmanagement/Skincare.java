/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;
import java.util.Scanner;

public class Skincare extends Services {

    double Charges = 0;

    double forwomen() {
        Scanner sc = new Scanner(System.in);
        String[] servicesforwomen = {"0.Basic Facial", "1.Herbal Facial", "2. Double Glow Facial",
            "3.Acne Facial", "4. Age Regulate Facial", "5.Gold Facial", "6.Face Polish", "7.Protein Oxygen Facial",
            "8.Lighting Facial", "9.Double Ionization Newlight", "10.Customize Cleansing ",
            "11.Hydra Peeling Treatment", "12.Rejuvenating Facial"};
        System.out.println("Our services are:");
        for (int i = 0; i < servicesforwomen.length; i++) {
            System.out.println(servicesforwomen[i]);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();

        switch (service) {
            case "0":
                System.out.println("Basic Facial==800");
                Charges += 800;
                break;
            case "1":
                System.out.println("Herbal Facial==1000");
                Charges += 1000;
                break;
            case "2":
                System.out.println("Double glow Facial==1500");
                Charges += 1500;
                break;
            case "3":
                System.out.println("Acne Facial==2000");
                Charges += 2000;
                break;
            case "4":
                System.out.println("Age Regulate Facial==3000");
                Charges += 3000;
                break;
            case "5":
                System.out.println("Gold Facial==5000");
                Charges += 5000;
                break;
            case "6":
                System.out.println("Face Polish==300");
                Charges += 300;
                break;
            case "7":
                System.out.println("Protein Oxygen Facial==1000");
                Charges += 1000;
                break;
            case "8":
                System.out.println("Lighting Facial==1000");
                Charges += 1000;
                break;
            case "9":
                System.out.println("Double Ionization Newlight==2000");
                Charges += 2000;
                break;
            case "10":
                System.out.println("Customize Cleansing ==2000");
                Charges += 2000;
                break;
            case "11":
                System.out.println("Hydra Peeling Treatment==7500");
                Charges += 7500;
                break;
            case "12":
                System.out.println("Rejuvenating Facial==5000");
                Charges += 5000;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return Charges;
    }

    double formen() {
        Scanner sc = new Scanner(System.in);
        String[] servicesformen = {"0.Basic Facial", "1.Herbal Facial", "2. Double Glow Facial",
            "3.Acne Facial", "4. Age Regulate Facial", "5.Gold Facial", "6.Face Polish", "7.Protein Oxygen Facial",
            "8.Lighting Facial", "9.Double Ionization Newlight", "10.Customize Cleansing ",
            "11.Hydra Peeling Treatment", "12.Rejuvenating Facial"};
        System.out.println("Our services are:");
        for (int i = 0; i < servicesformen.length; i++) {
            System.out.println(servicesformen[i]);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();

        switch (service) {
            case "0":
                System.out.println("Basic Facial==800");
                Charges += 800;
                break;
            case "1":
                System.out.println("Herbal Facial==1000");
                Charges += 1000;
                break;
            case "2":
                System.out.println("Double glow Facial==1500");
                Charges += 1500;
                break;
            case "3":
                System.out.println("Acne Facial==2000");
                Charges += 2000;
                break;
            case "4":
                System.out.println("Age Regulate Facial==3000");
                Charges += 3000;
                break;
            case "5":
                System.out.println("Gold Facial==5000");
                Charges += 5000;
                break;
            case "6":
                System.out.println("Face Polish==300");
                Charges += 300;
                break;
            case "7":
                System.out.println("Protein Oxygen Facial==1000");
                Charges += 1000;
                break;
            case "8":
                System.out.println("Lighting Facial==1000");
                Charges += 1000;
                break;
            case "9":
                System.out.println("Double Ionization Newlight==2000");
                Charges += 2000;
                break;
            case "10":
                System.out.println("Customize Cleansing ==2000");
                Charges += 2000;
                break;
            case "11":
                System.out.println("Hydra Peeling Treatment==7500");
                Charges += 7500;
                break;
            case "12":
                System.out.println("Rejuvenating Facial==5000");
                Charges += 5000;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return Charges;
    }
}
    
