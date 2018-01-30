/*
 * Name: William Chen
 * Date: November 6 2015
 * Teacher: Mrs. Andrighetti
 * Return Type (Function) Methods
 */
import java.util.Scanner;
class PartAQuestion3{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    double kilometres;
    double miles;
    System.out.println("Enter distance in kilometres: ");
    kilometres = myScanner.nextDouble();
    miles = convertKToM(kilometres);
    System.out.println("Distance in miles: "+miles);
  }
  public static double convertKToM(double km){
    double m;
    m = (km/1.60934);
    return m;
  }
}

  
