/*
 * Name: William Chen
 * Date: September 28 2015
 * Input Output Extra Exercises 6
 */
import java.util.Scanner;
class InOut6{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    int grade1;
    int grade2;
    int grade3;
    int grade4;
    int grade5;
    int sum = 0;
    System.out.println("Enter your mark: ");
    grade1 = myScanner.nextInt();
    sum+=grade1;
    System.out.println("Enter your second mark: ");
    grade2 = myScanner.nextInt();
    sum+=grade2;
    System.out.println("Enter your third mark: ");
    grade3 = myScanner.nextInt();
    sum+=grade3;
    System.out.println("Enter your fourth mark: ");
    grade4 = myScanner.nextInt();
    sum+=grade4;
    System.out.println("Enter your fifth mark: ");
    grade5 = myScanner.nextInt();
    sum+=grade5;
    int avg = sum/5;
    System.out.println("Your average is " +avg);
  }
}