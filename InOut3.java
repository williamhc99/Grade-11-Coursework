/*
 * Name:William Chen
 * Date: Spetember 28 2015
 * Input Output Extra Exercises 3
 */
import java.util.Scanner;
class InOut3{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    int number;
    
   
    System.out.println("Enter a two digit number.");
    number = myScanner.nextInt();
    int digit1 = number/10;
    int digit2 = number-=(digit1*10);
    System.out.println("The first digit is "+digit1+", and the second digit is "+digit2);
  }
}
