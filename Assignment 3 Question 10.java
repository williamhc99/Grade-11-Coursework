import java.util.Scanner;

/*
 * Assignemnt 3 Question 10.java
 * Date: Sept 17 2015
 * Author: William Chen
 */

class Assignment_3_Question_10 {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
      
      int number;
      
      System.out.println("Enter a number between 1 and 5: ");
      number = myScanner.nextInt();
        
        System.out.println("You entered: "+ number);
      if (number==1) {
        System.out.println("Hello");
      }else if (number==2){
        System.out.println("Hello");
        System.out.println("Hello");
      }else if (number==3){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
      }else if (number==4){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
      }else if (number==5){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
      }else
        System.out.println("Number is not between 1 and 5.");
      }
  }



