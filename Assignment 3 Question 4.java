import java.util.Scanner;

/*
 * Assignemnt 3 Question 4.java
 * Date: Sept 17 2015
 * Author: William Chen
 */

class Assignment_3_Question_4 {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
      
      int number;
      
      System.out.println("Enter a number: ");
      number = myScanner.nextInt();
        
        System.out.println("You entered: "+ number);
      if (number==66) {
        System.out.println("You got it!");
      }else 
        System.out.println("Guess again.");
      }
  }