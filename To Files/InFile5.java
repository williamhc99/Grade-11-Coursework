/*
 * Name: William Chen
 * Date: November 26 2015
 * Teacher: Mrs. Andrighetti
 * Input from File Exerccise 5
 */
import java.util.Scanner;
import java.io.*;
class InFile5{
  public static void main (String args[])throws Exception{
    File myFile = new java.io.File("file2.txt");
    Scanner input = new Scanner (myFile);
    String strArray[] = new String [10];
    while (input.hasNext()){
      for (int i=0; i<strArray.length; i++){
        strArray[i] = input.next();
      }
    }
    for (int i=0; i<strArray.length; i++){
      System.out.println(strArray[i]);
    }
  }
}