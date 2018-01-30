/*
 * Name: William Chen
 * Date: November 25 2015
 * Teacher: Mrs. Andrighetti
 * Output to File Exercise 13
 */
import java.util.Scanner;
import java.io.*;
class OutFile13{
  public static void main (String args[])throws Exception{
    Scanner myScanner = new Scanner (System.in);
    File myFile = new java.io.File("file13.txt");
    PrintWriter output = new PrintWriter(myFile);
    int markArray[] = new int[5];
    String nameArray[] = new String[5];
    for (int i=0; i<markArray.length; i++){
      System.out.println("Enter student name: ");
      nameArray[i] = myScanner.nextLine();
      System.out.println("Enter student mark: ");
      markArray[i] = myScanner.nextInt();
      myScanner.nextLine();
    }
    for (int i=0; i<markArray.length; i++){
      output.println(nameArray[i]+" "+markArray[i]+"%");
    }
    output.close();
    myScanner.close();
  }
}