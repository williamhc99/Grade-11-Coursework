/* 
 * Name: William Chen
 * Date: November 23 2015
 * Teacher: Mrs. Andrighetti
 * String Exercise 1
 */
import java.util.Scanner;
class String1{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    boolean result;
    String userInput;
    System.out.println("Enter true or false. ");
    userInput = myScanner.nextLine();
    result = Boolean.valueOf(userInput);
    System.out.println("The boolean is "+result);
  }
}