/*
 * Name: William
 * Date: September 28 2015
 * Conditional Loops Exercise 3
 */
import java.util.Scanner;
class Cond3{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    int i = 1;
    int num;
    System.out.println("Enter a number");
    num = myScanner.nextInt();
    while (i>=1&&i<=num){
      System.out.println(i);
      i++;
    }
  }
}