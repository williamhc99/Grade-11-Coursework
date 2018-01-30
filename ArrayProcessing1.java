/*
 * Name: William Chen
 * Date: October 28 2015
 * Teacher: Mrs. Andrighetti
 * Array Processing Exercise 1
 */
import java.util.Scanner;
class ArrayProcessing1{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    int num[] = new int [10];
    int maxOrder[] = new int [10];

    int maxNumber=-2000000000;
    int minNumber=2000000000;
    int swap=0;
    for (int i=0; i<num.length; i++){
      System.out.println("Enter an integer");
      num[i]=myScanner.nextInt();
      if (num[i]>maxNumber){
        maxNumber=num[i];
      }
    }
    for (int i=0; i<num.length; i++){
      if (num[i]<minNumber){
        minNumber=num[i];
      }
    }
    System.out.println("The numbers, in the order they were inputted in: ");
    for (int i=0; i<num.length; i++){
      System.out.println(num[i]);
    }
    System.out.println("The largest integer is "+maxNumber);
    System.out.println("The smallest integer is "+minNumber);
    swap=num[4];
    num[4]=num[5];
    num[5]=swap;
    System.out.println("If the fourth and fifth numbers were switched: ");
    for (int i=0; i<num.length; i++){
      System.out.println(num[i]);
    }
    for (int a=0; a<maxOrder.length; a++){
      System.out.println(maxOrder);
    }
  }
}