/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonmanagement;
import java.util.Scanner;

public class Login {
    Scanner input = new Scanner(System.in);

    public boolean onLogin(String user, String pass) {

         String[] usersname = {"admin","Admin","Employee", "employee"};
         String[] password = {"123", "1234"};
        User User = new User();

        if (user.isEmpty() || pass.isEmpty()) {
            System.out.println("  Please enter the user name or password");
        } else if ((user.equals(usersname[0]) || user.equals(usersname[1]) || user.equals(usersname[2]) || user.equals(usersname[3])) == false) {
            System.out.println("  Please enter the correct username");
        }else if ((pass.equals(password[0]) || pass.equals(password[1])) == false) {
            System.out.println("  Please enter the correct password");
        }else{  
            User.checkUser(user);
            return true;
        }

        return false;
    }
}

    


    

