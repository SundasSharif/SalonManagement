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
public class SalonManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println(" *********************************************** ");
        System.out.println(" ***** Welcome To Salon Management System ***** ");
        System.out.println(" *********************************************** ");
        System.out.println(" *\t\tPress 1. For Login\t       * ");
        System.out.println(" *\t\tPress 2. For Exit\t       * ");
        System.out.println(" *********************************************** ");
        System.out.println(" *********************************************** ");
        System.out.print("\n Please select your option:");
        String selectedOption = input.next();
        if (selectedOption.equals("1")) {
            Login l = new Login();
            System.out.println(" *********************************************** ");
            System.out.println(" ***** \t\tUser Login\t\t   *****");
            System.out.println(" *********************************************** ");

            loop:while(true) {

                System.out.print("  Enter User name: ");
                String username = input.next();
                System.out.print("  Enter Password : ");
                String password = input.next();
                if (l.onLogin(username, password) == true) {
                    break ;
                }   
            }

        } else {
            System.exit(0);
        }
        input.close();

    }

}



    
    

