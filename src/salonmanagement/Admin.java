/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Admin extends User {

    public boolean adminOption() {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println(" *********************** ");
            System.out.println(" ****** Main Menu ****** ");
            System.out.println(" *********************** ");
            System.out.println(" Press 1.Services");
            System.out.println(" Press 2.Payment Details");
            System.out.println(" Press 3.Exit");
            System.out.println(" *********************** ");
            System.out.println(" *********************** ");
            System.out.print("\n Please select your option:");
            int selectedOption = input.nextInt();

            switch (selectedOption) {
                case 1:
                    Services service = new Services();
                    service.Services();
                    service.ServicesBill();
                    break;
                case 2:
                    File f = new File("Expense.txt");
                    if (f.exists()) {
                        try {
                            File myObj = new File("Expense.txt");
                            Scanner myReader = new Scanner(myObj);
                            while (myReader.hasNextLine()) {
                                String data = myReader.nextLine();
                                System.out.println(data);
                            }
                            myReader.close();
                        } catch (FileNotFoundException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("No Payment Reciept Exists");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
