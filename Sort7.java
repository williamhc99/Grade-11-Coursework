/*
 * Name: William Chen
 * Date: November 5 2015
 * Teacher: Mrs. Andrighetti
 * Sorting Exercise 7
 */
import java.util.Scanner;
class Sort7 {
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    String nameArray[] = new String [5];
    String nameSwap;
    int markArray[] = new int [5];
    int markSwap;
    for (int i=0; i<nameArray.length; i++){
      System.out.println("Enter a name: ");
      nameArray[i]=myScanner.nextLine();
      System.out.println("Enter their mark: ");
      markArray[i]=myScanner.nextInt();
      myScanner.nextLine();
    }
    System.out.println("Names and marks in the order entered: ");
    for (int i=0; i<nameArray.length; i++){
      System.out.print("Name: "+nameArray[i]+", Mark: ");
      System.out.print(markArray[i]);
      System.out.println();
    }
    /*
    for (int a=0; a<nameArray.length; a++){
      for (int i=0; i<(nameArray.length-1); i++){
        if ((nameArray[i].compareToIgnoreCase(nameArray[i+1]))>0){
          nameSwap = nameArray[i];
          nameArray[i] = nameArray[i+1];
          nameArray[i+1] = nameSwap;
        }
      }
    }
    */
    for (int a=0; a<markArray.length; a++){
      for (int i=0; i<(markArray.length-1); i++){
        if (markArray[i]>markArray[i+1]){
          markSwap =markArray[i];
          markArray[i] = markArray[i+1];
          markArray[i+1] = markSwap;
          nameSwap = nameArray[i];
          nameArray[i] = nameArray[i+1];
          nameArray[i+1] = nameSwap;
        }
      }
    }
    System.out.println("Marks in ascending order: ");
    for (int i=0; i<markArray.length; i++){
      System.out.println("Name: "+nameArray[i]+", Mark: "+markArray[i]);
    }
  }
}