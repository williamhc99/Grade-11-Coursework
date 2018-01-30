import java.util.Scanner;

/*
 * Assignemnt 3 Question 3.java
 * Date: Sept 17 2015
 * Author: William Chen
 */

class Assignment_3_Question_3 {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
      
      int temperature;
      
      System.out.println("Enter the temperature: ");
      temperature = myScanner.nextInt();
        
        System.out.println("You entered: "+ temperature);
      if (temperature>30) {
        System.out.println("It is hot.");
      }else if (20<=temperature&&temperature<=30){ 
        System.out.println("It is comfortable.");
      }else if (temperature>=10&&temperature<=19){
        System.out.println("It is cool");
      }else if (temperature<=9){
        System.out.println("It is cold");
      }
  }
}