/*
 * Name: William Chen
 * Date: October 22 2015
 * Teacher: Mrs. Andrighetti
 * Array Exercise 4
 */
import java.util.Scanner;
class Array4{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    String[] wordArray = new String[10];
    for (int i=0;i<wordArray.length;i++){
      System.out.println("Enter a word");
      wordArray[i]=myScanner.nextLine();
    }
    for (int i=9;(i<wordArray.length)&&(i>=0);i--){
      System.out.println(wordArray[i]);
    }
  }
}