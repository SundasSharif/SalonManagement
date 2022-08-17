/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sundas Shareef
 */

public class Customer extends Employee {

    private String name;
    private double serviceCharges;
    private double productCharges;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date date = new Date();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDate() {
        return formatter.format(date);
    }

    public void setServiceCharges(double serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public double getServiceCharges() {
        return serviceCharges;
    }

    public double getTotalExpense() {
        return getServiceCharges();
    }

    @Override
    public String toString() {
        return " Customer Name: " + name
                + "\n MemberShip: Customer " + "\n Date: " + getDate() + "\n Service Charges "
                + getServiceCharges();
    }

    public String printCustomerBill() {
        return toString() + "\n Total = " + getTotalExpense()
                + "\n _____________________________\n";
    }
}

