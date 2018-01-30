/*
 * Name:William Chen
 * Date: September 28 2015
 * Mathematical Operations Exercise 5
 */
import java.util.Scanner;
class Math5{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    int height;
    int length;
    System.out.println("Enter the height of the rectangle:");
    height = myScanner.nextInt();
    System.out.println("Enter the length of the rectange:");
    length = myScanner.nextInt();
    System.out.println("The area of the rectangle is "+(height*length));
    int perimeter =(height*2)+(2*length);
    System.out.println("The perimeter of the rectangle is "+perimeter);
  }
}