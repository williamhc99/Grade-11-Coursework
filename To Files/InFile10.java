/*
 * Name: William Chen
 * Date: November 26 2015
 * Teacher: Mrs. Andrighetti
 * Input from File Exerccise 10
 */
import java.util.Scanner;
import java.io.*;
class InFile10{
  public static void main (String args[])throws Exception{
    File myFile = new java.io.File("file2.txt");
    Scanner input = new Scanner (myFile);
    String strArray[] = new String [10];
    int numArray[] = new int [10];
    int accumulator = 0;
    while (input.hasNext()){
      for (int i=0; i<strArray.length; i++){
        strArray[i] = input.next();
        numArray[i] = Integer.valueOf(strArray[i]);
        accumulator += numArray[i];
      }
    }
    for (int i=0; i<strArray.length; i++){
      System.out.println(numArray[i]);
    }
    System.out.println("The total sum of the values is "+accumulator);
  }
}