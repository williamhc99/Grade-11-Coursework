import java.util.Scanner;
/*
 * For Loop 9.java
 * Date: Sept 17 2015
 * Author: William Chen
 */

class For9 {
  public static void main(String args[]) { 
    Scanner myScanner = new Scanner(System.in);
    int sum = 0;
    for (int i=0; i<3; i++) {
      System.out.println("Please enter your mark");
      int num = myScanner.nextInt();
      sum+=num; 
    } System.out.println("Your average is "+ sum/3);
  }
}