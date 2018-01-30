import java.util.Scanner;
/*
 * For Loop 8.java
 * Date: Sept 17 2015
 * Author: William Chen
 */

class For8 {
  public static void main(String args[]) { 
    Scanner myScanner = new Scanner(System.in);
    int sum = 0;
    for (int i=0; i<5; i++) {
      System.out.println("Please enter a number");
      int num = myScanner.nextInt();
      sum+=num;
    }System.out.println("The sum of the 5 numbers is " + sum);
  }
}