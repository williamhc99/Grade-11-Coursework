import java.util.Scanner;

/*
 * Assignemnt 3 Question 7.java
 * Date: Sept 17 2015
 * Author: William Chen
 */

class Assignment_3_Question_7 {
 public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        String password;
        System.out.println("What is the password?");
        password = scan.nextLine();
        if (password.equals("happy"))
        System.out.println("You are logged in");
        else
        System.out.println("incorrect password");
 }
}


