import java.util.Scanner;
/*
 * Name:William Chen
 * Date:Sept 18 2015
 * Variable Exercies 7
 */
class Var7{
 public static void main(String args[]) {
   Scanner myScanner = new Scanner(System.in);
   int num1;
   int num2;
   System.out.println("Enter the length of the rectangle");
   num1=myScanner.nextInt();
   System.out.println("Enter the width of the rectangle");
   num2=myScanner.nextInt();
   System.out.println("the area is " + num1*num2);
   System.out.println("the perimeter is " + (2*num1+2*num2));
 }
}