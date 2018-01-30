import java.util.Scanner;
/*
 * While Loop 9.java
 * Date: Sept 24 2015
 * Author: William Chen
 */

class While9 {
  public static void main(String args[]) {  
    Scanner myScanner = new Scanner(System.in);
    String word;
    String guess;
    int num = 0;
    System.out.println("Enter a word: ");
    word = myScanner.nextLine();
    while (num>=0){
    System.out.println("Guess the word: ");
    guess = myScanner.nextLine();
    num++;
    if (guess.equals(word)){
    break; 
    }
    }
    System.out.println("The word was: "+word);
    System.out.println("You got it in "+num+" guess(es).");
  }
}