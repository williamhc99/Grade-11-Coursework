/*
 * Name: William Chen
 * Date: September 28 2015
 * Input Output Extra Exercises 4
 */
import java.util.Scanner;
class InOut4{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    int grade1;
    int grade2;
    int grade3;
    int grade4;
    int grade5;
    System.out.println("Enter your mark: ");
    grade1 = myScanner.nextInt();
    System.out.println("Enter your second mark: ");
    grade2 = myScanner.nextInt();
    System.out.println("Enter your third mark: ");
    grade3 = myScanner.nextInt();
    System.out.println("Enter your fourth mark: ");
    grade4 = myScanner.nextInt();
    System.out.println("Enter your fifth mark: ");
    grade5 = myScanner.nextInt();
    int avg = (grade1+grade2+grade3+grade4+grade5)/5;
    System.out.println("Your average is " +avg);
  }
}