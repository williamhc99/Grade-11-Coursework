/*
 * Name: William Chen
 * Date: November 5 2015
 * Teacher: Mrs. Andrighetti
 * Sorting Exercise 6
 */
import java.util.Scanner;
class Sort6 {
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    int num=0;
    System.out.println("How many names do you want to enter?");
    num = myScanner.nextInt();
    myScanner.nextLine();
    String nameArray[] = new String [num];
    String swap;
    for (int i=0; i<nameArray.length; i++){
      System.out.println("Enter a name: ");
      nameArray[i]=myScanner.nextLine();
    }
    System.out.println("Names in the order entered: ");
    for (int i=0; i<nameArray.length; i++){
      System.out.println(nameArray[i]);
    }
    for (int a=0; a<nameArray.length; a++){
      for (int i=0; i<(nameArray.length-1); i++){
        if ((nameArray[i].compareToIgnoreCase(nameArray[i+1]))>0){
          swap = nameArray[i];
          nameArray[i] = nameArray[i+1];
          nameArray[i+1] = swap;
        }
      }
    }
    System.out.println("Names in alphabetical order: ");
    for (int i=0; i<nameArray.length; i++){
      System.out.println(nameArray[i]);
    }
  }
}