import java.util.Scanner;
/*
 * Name:William Chen
 * Date:Sept 18 2015
 * Variable Exercies 5
 */
class Var5{
 public static void main(String args[]) {
   Scanner myScanner = new Scanner(System.in);
   int num1;
   int num2 = 2;
   System.out.println("Enter a number: ");
   num1=myScanner.nextInt();
   System.out.println(num1*=num2);
 }
}