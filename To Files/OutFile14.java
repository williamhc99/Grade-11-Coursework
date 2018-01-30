/*
 * Name: William Chen
 * Date: November 25 2015
 * Teacher: Mrs. Andrighetti
 * Output to File Exercise 14
 */
import java.util.Scanner;
import java.io.*;
class OutFile14{
  public static void main (String args[])throws Exception{
    Scanner myScanner = new Scanner (System.in);
    int triangleHeight;
    System.out.println("Enter the height of the triangle: ");
    triangleHeight = myScanner.nextInt();
    printTree(triangleHeight);
    myScanner.close();
  }
  public static void printTree (int h)throws Exception{
    File myFile = new java.io.File("file14.txt");
    PrintWriter output = new PrintWriter (myFile);
    for (int i=0; i<h; i++){
      for (int a=0; a<i+1; a++){
        output.print("*");
      }
      output.println();
    }
    output.close();
  }
}