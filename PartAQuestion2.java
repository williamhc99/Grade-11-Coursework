/*
 * Name: William Chen
 * Date: November 6 2015
 * Teacher: Mrs. Andrighetti
 * Return Type (Function) Methods
 */
import java.util.Scanner;
class PartAQuestion2{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    double pounds;
    double kilograms;
    System.out.println("Enter the weight in pounds: ");
    pounds = myScanner.nextDouble();
    kilograms = convertPToK(pounds);
    System.out.println("Weight in kilograms: "+kilograms);
  }
  public static double convertPToK(double lb){
    double kg;
    kg = (lb/2.2);
    return kg;
  }
}
