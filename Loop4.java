/*
 * Name: William Chen
 * Date: September 28 2015
 * For Loop Exercise 4
 */
import java.util.Scanner;
class Loop4{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    int num;
    char symbol;
    System.out.println("Enter a symbol/character: ");
    symbol = myScanner.next().charAt(0);
    System.out.println("Enter how many times to print the symbol/character: ");
    num = myScanner.nextInt();
    for (int i = 0;i<num;i++){
    System.out.println(symbol);
    }
  }
}
