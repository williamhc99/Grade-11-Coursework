import java.util.Scanner;

/*
 * Assignemnt 3 Question 2.java
 * Date: Sept 17 2015
 * Author: William Chen
 */

class Assignment_3_Question_2 {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
      
      int number;
      
      System.out.println("Enter your mark: ");
      number = myScanner.nextInt();
        
        System.out.println("You entered: "+ number);
      if (number>=50) {
        System.out.println("You pass!");
      }else 
        System.out.println("You fail.");
      }
  }

