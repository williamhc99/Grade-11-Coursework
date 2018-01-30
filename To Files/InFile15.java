/*
 * Name: William Chen
 * Date: November 27 2015
 * Teacher: Mrs. Andrighetti
 * Input from File Exercise 15
 */
import java.io.*;
import java.util.Scanner;
class InFile15{
  public static void main (String args[])throws Exception{
    File myFile = new java.io.File("file11.txt");
    Scanner input = new Scanner(myFile);
    Scanner myScanner = new Scanner(System.in);
    String nameArray[] = new String [5];
    int markArray[] = new int [5];
    int accumulator = 0;
    int counter = 0;
    int average;
    while (input.hasNext()){
      for (int i=0; i<nameArray.length; i++){
        nameArray[i] = input.next();
        System.out.println("Enter "+nameArray[i]+"'s mark: ");
        markArray[i] = myScanner.nextInt();
        myScanner.nextLine();
        accumulator += markArray[i];
        counter++;
      }
    }
    System.out.println("All names and marks: ");
    for (int i=0; i<nameArray.length; i++){
      System.out.println("Name: "+nameArray[i]+", Mark: "+markArray[i]);
    }
    average = accumulator/counter;
    System.out.println("The average mark is :"+average);
  }
}
    