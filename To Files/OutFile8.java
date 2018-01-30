/*
 * Name: William Chen
 * Date: November 25 2015
 * Teacher: Mrs. Andrighetti
 * Output to File Exercise 8
 */
import java.util.Scanner;
import java.io.*;
class OutFile8{
  public static void main (String args[])throws Exception{
    Scanner myScanner = new Scanner (System.in);
    File myFile = new java.io.File("file8.txt");
    PrintWriter output = new PrintWriter(myFile);
    int counter =0;
    int mark;
    int highest=0;
    while (counter<=20){
      System.out.println("Enter a mark:");
      mark = myScanner.nextInt();
      if ((mark>=0)&&(mark<=100)){
        output.println(mark);
        counter++;
      }
      else{
        System.out.println("Invalid mark.");
        counter++;
      }
    }
    output.close();
  }
}