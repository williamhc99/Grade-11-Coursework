/*
 * Name: William Chen
 * Date: November 23 2015
 * Teacher: Mrs. Andrighetti
 * Procedure Type Part B Question 4
 */
import java.util.Scanner;
class ProcedurePartBQ4{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    int triangleHeight;
    System.out.println("Enter the height of the triangle: ");
    triangleHeight = myScanner.nextInt();
    triangleDrawer(triangleHeight);
  }
  public static void triangleDrawer (int h){
    for (int i=0; i<h; i++){
      for (int a=0; a<i+1; a++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}