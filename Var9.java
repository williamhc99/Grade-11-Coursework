import java.util.Scanner;

/*
 * Name:William Chen
 * Date:Sept 18 2015
 * Variable Exercies 9
 */

class Var9 {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
      
      String firstname;
      String lastname;
      
      System.out.println("Enter your first name: ");
      firstname = myScanner.nextLine();
      System.out.println("Enter your last name: ");
      lastname = myScanner.nextLine();
      
      System.out.println("Hello "+firstname+" "+lastname+"! How are you?"); 

      }
  }