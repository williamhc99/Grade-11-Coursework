/*
 * Name: William Chen
 * Date: October 28 2015
 * Teacher: Mrs. Andrighetti
 * Array Processing Exercise 2
 */
import java.util.Scanner;
class ArrayProcessing2{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    String [] nameArray = new String [10];
    double[] mathMarkArray = new double[10];
    double[] scienceMarkArray = new double[10];
    double[] averageMarkArray = new double[10];
    for (int i=0; i<nameArray.length; i++){
      System.out.println("Enter your name: ");
      nameArray[i]=myScanner.nextLine();
      System.out.println("Enter your math mark: ");
      mathMarkArray[i]=myScanner.nextDouble();
      System.out.println("Enter your science mark: ");
      scienceMarkArray[i]=myScanner.nextDouble();
      myScanner.nextLine();
      averageMarkArray[i]=((scienceMarkArray[i]+mathMarkArray[i])/2);
    }
    for (int i=0; i<nameArray.length; i++){
    System.out.println(nameArray[i]+", your average mark is "+averageMarkArray[i]);
  }
  }
}
    