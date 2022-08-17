/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;

/**
 *
 * @author Sundas Shareef
 */
public class User extends Login{
    public boolean checkUser(String user){

        Admin admin = new Admin();
        Employee employee = new Employee();

        System.out.println("\n  Welcome " +user.toUpperCase());
        if(user.equals("admin") || user.equals("employee")){
            admin.adminOption();
        }
        else{
        }
        return false;
    
    }
}
