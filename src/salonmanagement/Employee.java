/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;

import java.util.Scanner;

public class Employee extends User {

    Scanner input = new Scanner(System.in);

    void customer() {
        Customer c = new Customer();
        System.out.println("Enter customer name");
        String Name = input.nextLine();
        c.setName(Name);
        System.out.println("Enter service charges");
        double ServiceCharges = input.nextDouble();
        c.setServiceCharges(ServiceCharges);
        c.toString();
        c.printCustomerBill();
    }
}
