import java.util.Scanner;
/*
 * For Loop 10.java
 * Date: Sept 17 2015
 * Author: William Chen
 */

class For10 {
  public static void main(String args[]) { 
    Scanner myScanner = new Scanner(System.in);
    int high = 0;
    for (int i=0; i<5; i++) {
      System.out.println("Please enter your mark");
      int num = myScanner.nextInt();
      if (num>high){
        high = num;
      }
  }System.out.println("Your highest mark is "+ high);
  }
}