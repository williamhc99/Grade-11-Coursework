import java.util.Scanner;
/*
 * For Loop 7.java
 * Date: Sept 17 2015
 * Author: William Chen
 */

class For7 {
  public static void main(String args[]) { 
    Scanner myScanner = new Scanner(System.in);
    int a;
    int b;
    
    System.out.println("Start counting at what number?");
    a = myScanner.nextInt();
    
    System.out.println("Stop counting at what number?");
    b = myScanner.nextInt();
    for (int i = a; i<=b;i++){
      System.out.println(i);
    }
  }
}
