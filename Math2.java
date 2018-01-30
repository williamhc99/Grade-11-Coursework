/*
 * Name:William Chen
 * Date: September 28 2015
 * Mathematical Operations Exercise 2
 */
import java.util.Scanner;
class Math2{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    double num1;
    double num2;
    System.out.println("Enter two numbers: ");
    num1 = myScanner.nextInt();
    num2 = myScanner.nextInt();
    System.out.println("The quotient of the two numbers is "+((double)num1)/num2);
  }
}