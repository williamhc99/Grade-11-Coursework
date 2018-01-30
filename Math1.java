/*
 * Name:William Chen
 * Date: September 28 2015
 * Mathematical Operations Exercise 1
 */
import java.util.Scanner;
class Math1{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    int num1;
    int num2;
    System.out.println("Enter two numbers: ");
    num1 = myScanner.nextInt();
    num2 = myScanner.nextInt();
    System.out.println("The sum of the two numbers is "+(num1+num2));
    System.out.println("The product of the two numers is "+(num1*num2));
  }
}