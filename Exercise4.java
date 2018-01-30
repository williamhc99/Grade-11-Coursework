/* 
 * Name: William Chen
 * Date: October 31 2015
 * Teacher: Mrs. Andrighetti
 * Challenge Exercise 4
 */
import java.util.Scanner;
class Exercise4{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);

    int numArray[]=new int [50];
    int accumulator=0;
    int average;
    int maxNumber=0;
    int minNumber=2000000000;
    int MAX = 50;
    for (int i=0; i<numArray.length; i++){
      System.out.println("Enter a number.");
      numArray[i]=myScanner.nextInt();
      accumulator += numArray[i];
    }
    average = accumulator/MAX;
    System.out.println("The average of the numbders is "+average);
    for (int i=0; i<numArray.length; i++){
      if (numArray[i]>maxNumber){
        maxNumber=numArray[i];
      }
    }
    for (int i=0; i<numArray.length; i++){
      if (numArray[i]<minNumber){
        minNumber=numArray[i];
      }
    }
    System.out.println("The range of the numbers is from "+minNumber+" to "+maxNumber);
  }
}
      