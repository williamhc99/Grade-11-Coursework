/*
 * Name: William Chen
 * Date: November 11 2015
 * Teacher: Mrs. Andrighetti
 * Function Type Exercise Part B
 */
import java.util.Scanner;
class PartBQuestion4{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    int x1Coordinate;
    int x2Coordinate;
    int y1Coordinate;
    int y2Coordinate;
    double finalDistance;
    double xMidpoint;
    double yMidpoint;
    double slope;
    System.out.println("Enter the first x coordinate:");
    x1Coordinate = myScanner.nextInt();
    System.out.println("Enter the first y coordinate:");
    y1Coordinate = myScanner.nextInt();
    System.out.println("Enter the second x coordinate:");
    x2Coordinate = myScanner.nextInt();
    System.out.println("Enter the second y coordinate:");
    y2Coordinate = myScanner.nextInt();
    finalDistance = distanceCalculator(x1Coordinate, y1Coordinate, x2Coordinate, y2Coordinate);
    System.out.println("The distance between the two points is: "+finalDistance);
    xMidpoint = xMidpointCalculator(x1Coordinate, x2Coordinate);
    yMidpoint = yMidpointCalculator(y1Coordinate, y2Coordinate);
    System.out.println("The midpoint is ("+xMidpoint+", "+yMidpoint+")");
    slope = slopeCalculator(x1Coordinate, y1Coordinate, x2Coordinate, y2Coordinate);
    System.out.println("The slope is "+slope);
  }
  public static double distanceCalculator(double x1, double y1, double x2, double y2){
    double xValueDistance = (x2-x1)*(x2-x1);
    double yValueDistance = (y2-y1)*(y2-y1);
    double finalDistance;
    finalDistance = Math.sqrt(xValueDistance+yValueDistance);
    return finalDistance;
  }
  public static double xMidpointCalculator(double x1, double x2){
    double xValueMidpoint = (x1+x2)/2;
    return xValueMidpoint;
  }
  public static double yMidpointCalculator(double y1, double y2){
    double yValueMidpoint = (y1+y2)/2;
    return yValueMidpoint;
  }
  public static double slopeCalculator(double x1, double y1, double x2, double y2){
    double slope;
    slope = (y2-y1)/(x2-x1);
    return slope;
  }
}
