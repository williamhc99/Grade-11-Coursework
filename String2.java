/* 
 * Name: William Chen
 * Date: November 23 2015
 * Teacher: Mrs. Andrighetti
 * String Exercise 2
 */
import java.util.Scanner;
class String2{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    String userInput;
    int numberOfCharacters;
    System.out.println("Enter a word or a phrase: ");
    userInput = myScanner.nextLine();
    numberOfCharacters = userInput.length();
    System.out.println("There are "+numberOfCharacters+" characters in your word/phrase.");
  }
}