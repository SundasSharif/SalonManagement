/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;

import java.util.Scanner;

public class Hair extends Services {

    double Charges = 0;

    double forwomen() {
        Scanner sc = new Scanner(System.in);
        String[] servicesforwomen = {"0.Shampoo+conditionar", "1.baby hair cut", "2.U-shape", "3.Blunt(straight)",
            "4.Layer cut", "5.Treatment wash", "6.Textured hair", "7.Bob cut", "8.Split end", "9.Front layer cut",
            "10.Blow dry/straighting", "11.Tong curls", "12.Ringlets", "13.Swiss roll", "14.Hairo", "15.French braid",
            "16.Front styling", "17.hair mehndi", "18.Root-touch up(natural/fashion", "19.Root-touch up(non chemical/fashion/loreal)",
            "20.Hair colour(natural)", "21.Fashion hair colour", "22.Highlights", "23.Lowlights", "24.Rexlaing",
            "25.Extenso", "26.Rebonding", "27.Hair karatin", "288.Perming", "29.Enviro", "30.Colour extensions",
            "31.Front extensions", "32.Extension (volumelength)", "33.Hot oil massage", "34.Protien treatment",
            "35.Anti anruff", "36.Hair fall treatment"};
        System.out.println("Our services are:");
        for (int i = 0; i < servicesforwomen.length; i++) {
            System.out.println(servicesforwomen[i]);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();

        switch (service) {
            case "0":
                System.out.println("shampoo+conditioner ==300");
                Charges += 300;
                break;
            case "1":
                System.out.println(" baby hair cut==700");
                Charges += 700;
                break;
            case "2":
                System.out.println(" U-shape==800");
                Charges += 800;
                break;
            case "3":
                System.out.println(" blunt(straight)==500");
                Charges += 500;
                break;
            case "4":
                System.out.println(" layer cut==1500");
                Charges += 1500;
                break;
            case "5":
                System.out.println(" treatment was==700");
                Charges += 700;
                break;
            case "6":
                System.out.println("textured hair==2000");
                Charges += 2000;
                break;
            case "7":
                System.out.println(" bob cut==1000");
                Charges += 1000;
                break;
            case "8":
                System.out.println(" split ends==1000");
                Charges += 1000;
                break;
            case "9":
                System.out.println(" front layer cut==1000");
                Charges += 1000;
                break;
            case "10":
                System.out.println(" blow dry/straightning==1000");
                Charges += 1000;
                break;
            case "11":
                System.out.println(" tong curls==1200");
                Charges += 1200;
                break;
            case "12":
                System.out.println("ringlets==1000");
                Charges += 1000;
                break;
            case "13":
                System.out.println("swiss roll==1000");
                Charges += 1000;
                break;
            case "14":
                System.out.println("hairdo ==1500");
                Charges += 1500;
                break;
            case "15":
                System.out.println("french braid==800");
                Charges += 800;
                break;
            case "16":
                System.out.println("front styling==800");
                Charges += 800;
                break;
            case "17":
                System.out.println("hair mehndi==800");
                Charges += 800;
                break;
            case "18":
                System.out.println("root-touch up(natural/fashion==2000");
                Charges += 2000;
                break;
            case "19":
                System.out.println("root-touch up(non chemical/fashion/loreal)==2500");
                Charges += 2500;
                break;
            case "20":
                System.out.println("hair colour(natural)==2500");
                Charges += 2500;
                break;
            case "21":
                System.out.println("fashion hair colour==5000");
                Charges += 5000;
                break;
            case "22":
                System.out.println("highlights==7000");
                Charges += 7000;
                break;
            case "23":
                System.out.println("lowlights==7000");
                Charges += 7000;
                break;
            case "24":
                System.out.println("relxaing==7000");
                Charges += 7000;
                break;
            case "25":
                System.out.println("extenso==10000");
                Charges += 10000;
                break;
            case "26":
                System.out.println("rebonding==9000");
                Charges += 9000;
                break;
            case "27":
                System.out.println("hair keratin==7000");
                Charges += 7000;
                break;
            case "28":
                System.out.println("perming==6000");
                Charges += 6000;
                break;
            case "29":
                System.out.println("enviro==6000");
                Charges += 6000;
                break;
            case "30":
                System.out.println("colour extensions==1000-3000");
                Charges += 3000;
                break;
            case "31":
                System.out.println("front extensions==5000-15000");
                Charges += 15000;
                break;
            case "32":
                System.out.println("extension (volumelength)==20000-40000");
                Charges += 40000;
                break;
            case "33":
                System.out.println("hot oil massage==800");
                Charges += 800;
                break;
            case "34":
                System.out.println("potien treatment==1500");
                Charges += 1500;
                break;
            case "35":
                System.out.println("Anti danruff==2500");
                Charges += 2500;
                break;
            case "36":
                System.out.println("Hair fall treatment==2500");
                Charges += 2500;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return Charges;
    }

    double formen() {
        Scanner sc = new Scanner(System.in);
        String[] servicesformen = {"0. hair cut for adults", "1.hair cut for kids", "2.beard trim", "3.cleanshave",
            "4.beard design", "5.moustache colour", "6.hair colour", "7.beard colour", "8.hot oil massage",
            "9.protien treatment", "10.anti anruff", "11.hair fall treatment", "12.shampoo+conditioner"};
        System.out.println("Our services are:");
        for (int i = 0; i < servicesformen.length; i++) {
            System.out.println(servicesformen[i]);
        }
        System.out.println("Enter service you want");
        String service = sc.nextLine();

        switch (service) {
            case "0":
                System.out.println(" hair cut for adults==1500");
                Charges += 1500;
                break;
            case "1":
                System.out.println("hair cut for kids==700");
                Charges += 700;
                break;
            case "2":
                System.out.println("beard trim=300");
                Charges += 300;
                break;
            case "3":
                System.out.println("cleanshave==400");
                Charges += 400;
                break;
            case "4":
                System.out.println("beard design==500");
                Charges += 500;
                break;
            case "5":
                System.out.println("moustache colour==600");
                Charges += 600;
                break;
            case "6":
                System.out.println("hair colour==2000");
                Charges += 2000;
                break;
            case "7":
                System.out.println("beard colour==1500");
                Charges += 1500;
                break;
            case "8":
                System.out.println("hot oil massage==800");
                Charges += 800;
                break;
            case "9":
                System.out.println("protien treatment==1500");
                Charges += 1500;
                break;
            case "10":
                System.out.println("anti dandruff==2500");
                Charges += 2500;
                break;
            case "11":
                System.out.println("hair fall treatment==26500");
                Charges += 26500;
                break;
            case "12":
                System.out.println("shampoo+conditioner==300");
                Charges += 300;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return Charges;
    }
}


