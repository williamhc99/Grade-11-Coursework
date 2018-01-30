/* 
 * Name: William Chen
 * Date: October 30 2015
 * Teacher: Mrs. Andrighetti
 * Array Processing Exercise 4
 */
import java.util.Scanner;
class ArrayProcessing4{
  public static void main (String args[]){
   Scanner myScanner = new Scanner (System.in);
   String [] listArray = {"one","two","five","four","six","three"};
   String swap;
   int i;
   int j;
   swap = listArray[2];
   listArray[2] = listArray[5];
   listArray[5] = swap;
   for (int a=0; a<listArray.length; a++){
     System.out.println(listArray[a]);
   }
   System.out.println("Enter two values between 0 and 5:");
   i = myScanner.nextInt();
   j = myScanner.nextInt();
   System.out.println(listArray[i]);
   System.out.println(listArray[j]);
  }
}