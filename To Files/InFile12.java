/*
 * Name: William Chen
 * Date: November 27 2015
 * Teacher: Mrs. Andrighetti
 * Input from File Exercise 12
 */
import java.io.*;
import java.util.Scanner;
class InFile12{
  public static void main (String args[])throws Exception{
    File myFile = new java.io.File("file12.txt");
    Scanner input = new Scanner (myFile);
    String strArray[] = new String [5];
    while (input.hasNext()){
      for (int i=0; i<strArray.length; i++){
        strArray[i] = input.next();
      }
    }
    System.out.println(strArray[strArray.length-1]);
  }
}