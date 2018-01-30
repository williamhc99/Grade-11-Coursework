/*
 * Do Loop 5.java
 * Date: Sept 26 2015
 * Author: William Chen
 */
import java.util.Scanner;
class Do5 {
  public static void main(String args[]) { 
    Scanner myScanner = new Scanner(System.in);
    int i;
    int num = 1;
    String word;
    System.out.println("Enter a word: ");
    word = myScanner.nextLine();
    System.out.println("How many times do you want to print this word?");
    i = myScanner.nextInt();
    do {
      System.out.println(word);
      num++;
    }while((num>0)&&(num<=i));
  }
}