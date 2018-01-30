/* 
 * Name: William Chen
 * Date: September 28 2015
 * For Loop Extra Exercise 2
 */
import java.util.Scanner;
class Loop2{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    int num;
    int num2;
    int add=0;
    int sum=0;
    System.out.println("Enter the first number: ");
    num2 = myScanner.nextInt();
    System.out.println("Enter the second number: ");
    num = myScanner.nextInt();
    for (int i=0;i<num;i++){
      add++;
      sum+=add;
    }
    System.out.println("The sum of all whole numbers from "+num2+" to "+num+" is "+(sum-num2));
  }
}