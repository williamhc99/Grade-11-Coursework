/*
 * Do Loop 6.java
 * Date: Sept 26 2015
 * Author: William Chen
 */
import java.util.Scanner;
class Do6 {
  public static void main(String args[]) {  
    Scanner myScanner = new Scanner(System.in);
    String word;
    int num;
    int counter = 1;
    System.out.println("Enter a word: ");
    word = myScanner.nextLine();
    System.out.println("Enter how many times you want to print this word: ");
    num = myScanner.nextInt();
    do {
      System.out.println(word);
      counter++;
    }while ((counter>0)&&(counter<=num));
  }
}