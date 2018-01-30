/*
 * Name: William Chen
 * Date: October 28 2015
 * Teacher: Mrs. Andrighetti
 * Array Processing Exercise 3
 */
import java.util.Scanner;
class ArrayProcessing3{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    String [] phoneNumberArray = new String [10];
    String [] nameArray = new String [10];
    for (int i=0; i<nameArray.length; i++){
      System.out.println("Enter your name:");
      nameArray[i]=myScanner.nextLine();
      System.out.println("Enter your phone number, including area code: ");
      phoneNumberArray[i]=myScanner.nextLine();
    }
    System.out.println("Names and Numbers of users with 905 area code:");
    for (int i=0; i<nameArray.length; i++){
       if (phoneNumberArray[i].substring(0,3).equals ("905")) {
        System.out.print(nameArray[i]);
        System.out.println(phoneNumberArray[i]);
      }
    }
  }
}


  
        
    
    
      