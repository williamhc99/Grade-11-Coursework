/* 
 * Name: William Chen
 * Date: November 25 2015
 * Teacher: Mrs. Andrighetti
 * Output to File Exercise 12
 */
import java.util.Scanner;
import java.io.*;
class OutFile12{
  public static void main (String args[])throws Exception{
    Scanner myScanner = new Scanner (System.in);
    File myFile = new java.io.File("file12.txt");
    PrintWriter output = new PrintWriter(myFile);
    String nameArray[] = new String [5];
    String swap;
    for (int i=0; i<nameArray.length; i++){
      System.out.println("Enter a name: ");
      nameArray[i] = myScanner.nextLine();
    }
    for (int a=0; a<nameArray.length-1; a++){
      for (int i=0; i<nameArray.length-1; i++){
        if (nameArray[i].compareToIgnoreCase(nameArray[i+1])>0){
          swap = nameArray[i];
          nameArray[i] = nameArray[i+1];
          nameArray[i+1] = swap;
        }
      }
    }
    for (int i=0; i<nameArray.length; i++){
      output.println(nameArray[i]);
    }
    output.close();
  }
}