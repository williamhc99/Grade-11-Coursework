/* 
 * Name: William Chen
 * Date: October 20 2015
 * Teacher: Mrs. Andrighetti
 * Array Exercise 3
 */
import java.util.Scanner;
class Array3{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    int[] numArray = new int[10];
    int limit;
    for (int i=0; i<numArray.length;i++){
      System.out.println("Enter an integer value.");
      numArray[i]=myScanner.nextInt();
    }
    System.out.println("Enter a limit.");
    limit = myScanner.nextInt();
    System.out.print("All integers that are greater than or equal to "+limit+" are: ");
    for (int i=0; i<numArray.length;i++){
      if (numArray[i]>limit){
        System.out.print(" "+numArray[i]);
      }
    }
  }
}
