/* 
 * Name: William Chen
 * Date: November 23 2015
 * Teacher: Mrs. Andrighetti
 * String Exercise 4
 */
import java.util.Scanner;
class String4{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    char e = 'e';
    String userInput;
    int accumulator = 0;
    System.out.println("Enter a word a phrase:");
    userInput = myScanner.nextLine();
    char [] charArray = userInput.toCharArray();
    for (int i=0; i<charArray.length; i++){
      if (charArray[i]==e){
        accumulator++;
      }
    }
    System.out.println("The letter 'e' appeared in the word/phrase "+accumulator+" time(s).");
  }
}
    