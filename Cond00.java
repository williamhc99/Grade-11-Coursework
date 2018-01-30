/* 
 * Name: William Chen
 * Date: September 28 2015
 * Conditional Loops Exercsie 1
 */
import java.util.Scanner;
class Cond00{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    int num;
    int i=0;
    while (i>=0){
    System.out.print("Enter a number between 1 and 100.");
      System.out.print(i);
    num = myScanner.nextInt();
    if (num>=1&&num<=100){
      break;
    }System.out.println("Number wasn't between 1 and 100.");
    }
  }
}