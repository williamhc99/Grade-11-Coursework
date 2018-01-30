/*
 * Name: William Chen
 * Date: November 6 2015
 * Teacher: Mrs. Andrighetti
 * Return Type (Function) Methods
 */
import java.util.Scanner;
class PartAQuestion1{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    double centimetres;
    double inches;
    System.out.println("Enter the length in centimetres: ");
    centimetres = myScanner.nextDouble();
    inches = convertCToI(centimetres);
    System.out.println("Length in inches: "+inches);
    int answer = 60000/400;
    System.out.println(answer);
  }
  public static double convertCToI(double cm){
    double in;
    in = (cm/2.54);
    return in;
  }
}


