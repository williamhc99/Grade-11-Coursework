/*
 * Name: William Chen
 * Date: November 23 2015
 * Teacher: Mrs. Andrighetti
 * String Exercise 5
 */
import java.util.Scanner;
class String5{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    String userInput;
    System.out.println("Enter a word or a phrase:");
    userInput = myScanner.nextLine();
    char character[] = userInput.toCharArray();
    System.out.println("That word downwards is: ");
    for (int i=0; i<character.length; i++){
      System.out.println(character[i]);
    }
  }
}