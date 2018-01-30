/*
 * Name: William Chen
 * Date: November 9 2015
 * Teacher: Mrs. Andrighetti
 * Formative ProgramarkArraying Task
 */
import java.util.Scanner;
class FormativeProgramarkArrayingTask{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    final int MAX = 100;
    String [] nameArray = new String [MAX];
    int [] markArray = new int [MAX];
    String userInput;
    int lastInput=0;
    int highestMark=0;
    int intSwap;
    int accumulator=0;
    int counter=0;
    int average;
    String stringSwap;
    boolean exitProgram;
    System.out.println("Enter all names and marks of the students. Once there are no more students, enter finish to show furthur options.");
    for (int i=0; i<MAX; i++){
      System.out.println("Enter the name of the student: ");
      nameArray[i]=myScanner.nextLine();
      if (nameArray[i].equals("finish")){
        lastInput+=i;
        break;
      }
      System.out.println("Enter their mark: ");
      markArray[i]=myScanner.nextInt();
      myScanner.nextLine();
    }
    do{
      System.out.println("Enter A to display all name and marks");
      System.out.println("Enter B to display highest mark");
      System.out.println("Enter C to display average mark");
      System.out.println("Enter D to display names in alphabetical order");
      System.out.println("Enter E to display marks in ascending order");
      System.out.println("Enter F to exit");
      userInput=myScanner.nextLine();
      if (userInput.equals("A")){
        for (int i=0; i<lastInput; i++){
          System.out.println("Name: "+nameArray[i]+" Mark: "+markArray[i]);
        }
      }else if (userInput.equals("B")){
        for (int i=0; i<(nameArray.length); i++){
          if (markArray[i]>highestMark){
            highestMark=markArray[i];
          }
        }
        System.out.println("The highest mark is: "+highestMark);
      }else if (userInput.equals("C")){
        for (int i=0; i<lastInput; i++){
          accumulator+=markArray[i];
          counter++;
        }
        average = accumulator/counter;
        System.out.println("The average mark is: "+average);
      }else if (userInput.equals("D")){
        for (int a=0; a<lastInput; a++){
          for (int i=0; i<lastInput-1; i++){
            if (nameArray[i].compareToIgnoreCase(nameArray[i+1])>0){
              stringSwap=nameArray[i];
              nameArray[i]=nameArray[i+1];
              nameArray[i+1]=stringSwap;
              intSwap=markArray[i];
              markArray[i]=markArray[i+1];
              markArray[i+1]=intSwap;
            }
          }
        }
        for (int i=0; i<lastInput; i++){
          System.out.println(nameArray[i]);
          System.out.println(markArray[i]);
        }
      }else if (userInput.equals("E")){
        for (int a=0; a<lastInput; a++){
          for (int i=0; i<lastInput-1; a++){
            if ((markArray[i]-markArray[i+1])>0){
              intSwap=markArray[i];
              markArray[i]=markArray[i+1];
              markArray[i+1]=intSwap;
              stringSwap=nameArray[i];
              nameArray[i]=nameArray[i+1];
              nameArray[i+1]=stringSwap;
            }
          }
        }
        for (int i=0; i<lastInput; i++){
          System.out.println(nameArray[i]);
          System.out.println(markArray[i]);
        }
      }else if (userInput.equals("F")){
        exitProgram=true;
      }
    }while(exitProgram=false);       
    System.out.println("Thank you for using the program");
  }
}

