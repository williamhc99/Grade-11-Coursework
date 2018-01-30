/*
 * Name: William Chen
 * Date: October 22 2015
 * Teacher: Mrs. Andrighetti
 * Array Exercise 7
 */
import java.util.Scanner;
class Array7{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    int[] numArray = new int[10];
    for (int i=0;i<numArray.length; i++){
      System.out.println("Enter a integer value, Enter 0 to exit");
      numArray[i] = myScanner.nextInt();
      if (numArray[i]==0){
        break;
      }
    }
   System.out.println("Positive numbers are: ");
   for (int i=0;(i<numArray.length); i++){
     if (numArray[i]>0){
       System.out.print(numArray[i]);
     }
   }
   System.out.println();
   System.out.println("Negative numbers are: ");
   for (int i=0;(i<numArray.length); i++){
     if (numArray[i]<0){
       System.out.print(numArray[i]);
     }
   }
  }
}