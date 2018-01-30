/* 
 * Name: William Chen
 * Date: November 25 2015
 * Teacheer: Mrs. Andrighetti
 * Output to File Exercise 10
 */
import java.util.Scanner;
import java.io.*;
class OutFile10{
  public static void main (String args[])throws Exception{
    Scanner myScanner = new Scanner (System.in);
    File myFile = new java.io.File("file10.txt");
    PrintWriter output = new PrintWriter(myFile);
    String username;
    String password;
    boolean contLoop = true;
    System.out.println("Enter quit in the password box to exit the program");
    while (contLoop==true){
      System.out.println("Enter your username: ");
      username = myScanner.nextLine();
      System.out.println("Enter your password: ");
      password = myScanner.nextLine();
      if (password.equals("happy")){
        output.println(username);
      }else if ((password.equals("quit"))){
        contLoop=false;
      }
    }
    output.close();
  }
}
          
                