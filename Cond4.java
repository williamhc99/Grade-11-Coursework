/*
 * Name: William
 * Date: September 28 2015
 * Conditional Loops Exercise 4
 */
import java.util.Scanner;
class Cond4{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    int i = 1;
    int num;
    System.out.println("Please enter values or -1 to exit");
    while (i>=1){
      System.out.println("Enter a positive number that is a multiple of three.");
      num = myScanner.nextInt();
      if (num % 3==0){
        System.out.println(num+" is a multiple of three");
      }else if (num==-1){
        System.out.println("Thank you for using my program! Exiting...");
        break;
      }else 
        System.out.println(num+" is not a multiple of three");
      i++;
      
    }
  }
}