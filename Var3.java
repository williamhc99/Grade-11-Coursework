import java.util.Scanner;

/*
 * Name:William Chen
 * Date:Sept 18 2015
 * Variable Exercies 3
 */

class Var3 {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
      
      String name;
      int age;
      
      System.out.println("Enter your name: ");
      name = myScanner.nextLine();
      System.out.println("Enter your age: ");
      age = myScanner.nextInt();
      
      System.out.println("You are " + name); 
      System.out.println("You are " + age);
      }
  }