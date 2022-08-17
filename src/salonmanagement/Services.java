/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Services extends Customer {

    double price = 0;

    void Services() {
        int check2;
        String service;
        String check;
        System.out.println(" Is customer men or women? ");
        check = input.nextLine();

        if (check.equals("men")) {

            System.out.println("Our Services are:");
            System.out.println("1.Makeover");
            System.out.println("2.Hair");
            System.out.println("3.Wax");
            System.out.println("4.Mani_pedi");
            System.out.println("5.Skincare");
            System.out.println("6.Gym");
            System.out.print("How many services you want: ");
            check2 = input.nextInt();
            for (int j = 1; j <= check2; j++) {
                System.out.print("Enter your service: ");
                int input_service = input.nextInt();

                switch (input_service) {
                    case 1:
                        Makeover m = new Makeover();
                        price += m.formen();
                        break;
                    case 2:
                        Hair h = new Hair();
                        price += h.formen();
                        break;
                    case 3:
                        Wax w = new Wax();
                        price += w.formen();
                        break;
                    case 4:
                        Mani_pedi mp = new Mani_pedi();
                        price += mp.formen();
                        break;
                    case 5:
                        Skincare s = new Skincare();
                        price += s.formen();
                        break;
                    case 6:
                        Gym g = new Gym();
                        price += g.formen();
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            }
        } else if (check.equals("women")) {

            System.out.println("1.Makeover");
            System.out.println("2.Hair");
            System.out.println("3.Wax");
            System.out.println("4.Mani_pedi");
            System.out.println("5.Skincare");
            System.out.println("6.Gym");
            System.out.println("7.Mehndi");
            System.out.print("How many services you want: ");
            int check3 = input.nextInt();
            for (int j = 1; j <= check3; j++) {
                System.out.print("Enter your service: ");
                int services = input.nextInt();

                switch (services) {
                    case 1:
                        Makeover m = new Makeover();
                        price += m.forwomen();
                        break;
                    case 2:
                        Hair h = new Hair();
                        price += h.forwomen();
                        break;
                    case 3:
                        Wax w = new Wax();
                        price += w.forwomen();
                        break;
                    case 4:
                        Mani_pedi mp = new Mani_pedi();
                        price += mp.forwomen();
                        break;
                    case 5:
                        Skincare s = new Skincare();
                        price += s.forwomen();
                        break;
                    case 6:
                        Gym g = new Gym();
                        price += g.forwomen();
                        break;
                    case 7:
                        Mehndi md = new Mehndi();
                        price += md.forwomen();
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
        }
    }

    void ServicesBill() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        String Name = input.nextLine();
        setName(Name);
        setServiceCharges(price);
        try {
            try (Writer my = new PrintWriter("Expense.txt")) {
                my.flush();
                my.write(printCustomerBill());
                my.flush();
            }
            Path filePath = Paths.get("Expense.txt");
            System.out.println(" Receipt generated successfully at Location: " + filePath.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

    
