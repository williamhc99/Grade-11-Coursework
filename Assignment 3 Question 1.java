import java.util.Scanner;

/*
 * Assignemnt 3 Question 10.java
 * Date: Sept 17 2015
 * Author: William Chen
 */

class Assignment_3_Question_1 {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
      
      int number;
      
      System.out.println("Enter a number between 1-10: ");
      number = myScanner.nextInt();
        
        System.out.println("You entered: "+ number);
      if (number>=5) {
        System.out.println("You win!");
      }else 
        System.out.println("You lose.");
      }
  }




















