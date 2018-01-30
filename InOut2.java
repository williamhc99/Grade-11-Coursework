/* 
 * Name: William Chen
 * Date; Spetember 27 2015
 * Input Output Extra Exercises 2
 */
import java.util.Scanner;
class InOut2{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    double d_one;
    double d_two;
    double d_three;
    String name;
    System.out.println("What is the runner's name?");
    name = myScanner.nextLine();
    System.out.println("What is the distance of the first leg of the race?");
    d_one = myScanner.nextInt();
    System.out.println("What is the distance of the second leg of the race?");
    d_two = myScanner.nextInt();
    System.out.println("What is the distance of the third leg of the race?");
    d_three = myScanner.nextInt();
    System.out.println("The runner, "+name+" will run "+(d_one+=d_two+=d_three)+"km in total for this race");
  }
}