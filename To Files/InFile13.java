/* 
 * Name: William Chen
 * Date: November 27 2015
 * Teacher: Mrs. Andrighetti
 * Input from File Exercise 13
 */
import java.io.*;
import java.util.Scanner;
class InFile13{
  public static void main (String args[])throws Exception{
    File myFile = new java.io.File ("file10.txt");
    Scanner input = new Scanner (myFile);
    Scanner myScanner = new Scanner (System.in);
    String userInput;
    String username = "";
    System.out.println("Enter your username: ");
    userInput = myScanner.nextLine();
    while (input.hasNext()){
      username = input.next();
    }
    if (username.equals(userInput)){
      System.out.println("You are logged on.");
    } else {
      System.out.println("You do not have a valid account.");
    }
  }
}
      