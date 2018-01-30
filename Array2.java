/*
 * Name: William Chen
 * Date: October 20 2015
 * Teacher: Mrs. Andrighetti
 * Array Exercise 2
 */
import java.util.Scanner;
class Array2{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    int[] numArray = new int[10];
    for (int i =0; i<numArray.length; i++){
      System.out.println("input an integer");
      numArray[i]=myScanner.nextInt();
    }
    for(int i=0; i<numArray.length; i++){
     System.out.println(numArray[i]);
    }
    for (int i=9; (i<numArray.length)&&(i>=0); i--){
     System.out.println(numArray[i]);
    }
    for(int i=0; i<numArray.length; i++){
      if (numArray[i]>=0){
       System.out.println(numArray[i]);
      }
    }
    for(int i=0; i<numArray.length; i++){
      if (numArray[i]<0){
       System.out.println(numArray[i]);
      }
    }
  }
}
