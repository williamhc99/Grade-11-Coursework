/* 
 * Name: William
 * Date: September 28 2015
 * Input Output Extra Exercsies 5
 */
import java.util.Scanner;
class InOut5{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    int f;
    double c;
    System.out.println("Enter the temperature in farenheit: ");
    f = myScanner.nextInt();
    c = (((double)5)/9)*(f-32);
    System.out.println("The temperature in celsius will be "+c+" degrees");
  }
}