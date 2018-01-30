/*
 * Name: William Chen
 * Date: November 26 2015
 * Teacher: Mrs. Andrighetti
 * Input from File Exerccise 11
 */
import java.util.Scanner;
import java.io.*;
class InFile11{
  public static void main (String args[])throws Exception{
    File myFile = new java.io.File("file8.txt");
    Scanner input = new Scanner (myFile);
    int numArray[] = new int [20];
    int swap;
    int accumulator = 0;
    int counter = 0;
    int average;
    while (input.hasNext()){
      for (int i=0; i<numArray.length; i++){
        numArray[i] = input.nextInt();
        accumulator += numArray[i];
        counter++;
      }
    }
    for (int a=0; a<numArray.length-1; a++){
      for (int i=0; i<numArray.length-1; i++){
        if (numArray[i]<numArray[i+1]){
          swap = numArray[i];
          numArray[i] = numArray[i+1];
          numArray[i+1] = swap;
        }
      }
    }
    for (int i=0; i<numArray.length; i++){
      System.out.println(numArray[i]);
    }
    average = accumulator/counter;
    System.out.println("The average is "+average);
    
  }
}