import java.util.Scanner;
/*
 * For Loop 5.java
 * Date: Sept 17 2015
 * Author: William Chen
 */

class For5 {
  public static void main(String args[]) { 
    Scanner myScanner = new Scanner(System.in);
    String word;
    int number;
    
    System.out.println("Enter a word: ");
    word = myScanner.nextLine();
    
    System.out.println("How many times do you want to print this word: ");
    number = myScanner.nextInt();
    for (int i = 1; i<=number;i++){
      System.out.println(word);
    }
  }
}
