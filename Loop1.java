/* 
 * Name: William Chen
 * Date: September 28 2015
 * For Loop Extra Exercise 1
 */
import java.util.Scanner;
class Loop1{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    int num;
    int add=0;
    int sum=0;
    System.out.println("Enter a number: ");
    num = myScanner.nextInt();
    for (int i=0;i<num;i++){
      add++;
      sum+=add;
    }
    System.out.println("The sum of all whole numbers up to "+num+" is "+sum);
  }
}