/*
 * Name: William Chen
 * Date: November 23 2015
 * Teacher: Mrs. Andrighetti
 * Procedure Type Questions Part B Question 3
 */
import java.util.Scanner;
class ProcedurePartBQ3{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    int lengthA;
    int lengthB;
    int lengthC;
    System.out.println("Enter the lenght of a stick:");
    lengthA = myScanner.nextInt();
    System.out.println("Enter the lenght of a stick:");
    lengthB = myScanner.nextInt();
    System.out.println("Enter the lenght of a stick:");
    lengthC = myScanner.nextInt();
    triangleMethod(lengthA, lengthB, lengthC);
  }
  public static void triangleMethod (int a, int b, int c){
    int [] stickLength = new int []{a, b, c};
    int swap = 0;
    int max;
    for (int i=0; i<stickLength.length-1; i++){
      for (int x=0; x<stickLength.length-1; x++){
        if (stickLength[x]>stickLength[i+1]){
          swap = stickLength[x];
          stickLength[x] = stickLength[x+1];
          stickLength[x+1] = swap;
        }
      }
    }
    max = stickLength[2];
    if ((stickLength[0]+stickLength[1])>max){
      System.out.println("A triangle can be formed.");
    }else{
      System.out.println("A triangle cannot be formed.");
    }
  }
}
  