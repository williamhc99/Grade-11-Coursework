/* 
 * Name: William Chen
 * Date: November 25 2015
 * Teacher: Mrs. Andrighetti
 * Output to File Exercise 11
 */
import java.util.Scanner;
import java.io.*;
class OutFile11{
  public static void main (String args[])throws Exception{
    Scanner myScanner = new Scanner (System.in);
    File myFile = new java.io.File("file11.txt");
    PrintWriter output = new PrintWriter(myFile);
    String nameArray[] = new String [5];
    for (int i=0; i<nameArray.length; i++){
      System.out.println("Enter a name: ");
      nameArray[i] = myScanner.nextLine();
    }
    for (int i=0; i<nameArray.length; i++){
      output.println(nameArray[i]);
    }
    output.close();
  }
}