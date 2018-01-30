import java.util.Scanner;

/*
 * Assignemnt 3 Question 6.java
 * Date: Sept 17 2015
 * Author: William Chen
 */

class Assignment_3_Question_6 {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
      
      int mark;
      
      System.out.println("Enter your mark out of 100: ");
      mark = myScanner.nextInt();
        
        System.out.println("You entered: "+ mark);
      if (mark>=0&&mark<=49) {
        System.out.println("It's a fail.");
      }else if (mark>=50&&mark<=74){ 
        System.out.println("It's a pass.");
      }else if (mark>=75&&mark<=100){
        System.out.println("It's great.");
      }else {
        System.out.println("Invalid mark.");
      }
  }
}