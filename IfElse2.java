/* 
 * Name: William Chen
 * Date: September 27 2015
 * If Else Extra Exercise 2
 */
import java.util.Scanner;
class IfElse2{
  public static void main(String args[]){
    Scanner myScanner = new Scanner(System.in);
    int answer;
    int points = 0;
    System.out.println("What colour is an orange?");
    System.out.println("Enter 1 for orange");
    System.out.println("Enter 2 for red");
    System.out.println("Enter 3 for green");
    System.out.println("Enter 4 for purple");
    answer = myScanner.nextInt();
    if (answer==1){
      points+=1;
      System.out.println("Correct answer, +1 points");
    }else if (answer==0){
      System.out.println("You chose to skip the question.");
    }else if (answer>1&&answer<5){
      points-=1;
      System.out.println("Wrong answer, -1 points");
    }
    System.out.println("What colour is snow?");
    System.out.println("Enter 1 for green");
    System.out.println("Enter 2 for grey");
    System.out.println("Enter 3 for white");
    System.out.println("Enter 4 for purple");
    answer = myScanner.nextInt();
    if (answer==3){
      points+=1;
      System.out.println("Correct answer, +1 points");
     }else if (answer==0){
      System.out.println("You chose to skip the question.");
    }else if (answer==1||answer==2||answer==4){
      points-=1;
      System.out.println("Wrong answer, -1 points");
    } 
    System.out.println("What colour is water?");
    System.out.println("Enter 1 for black");
    System.out.println("Enter 2 for red");
    System.out.println("Enter 3 for purple");
    System.out.println("Enter 4 for blue");
    answer = myScanner.nextInt();
    if (answer==4){
      points+=1;
      System.out.println("Correct answer, +1 points");
    }else if (answer==0){
      System.out.println("You chose to skip the question.");
    }else if (answer==1||answer==2||answer==3){
      points-=1;
      System.out.println("Wrong answer, -1 points");
    }
      System.out.println("What colour is grass?");
    System.out.println("Enter 1 for black");
    System.out.println("Enter 2 for green");
    System.out.println("Enter 3 for purple");
    System.out.println("Enter 4 for blue");
    answer = myScanner.nextInt();
    if (answer==2){
      points+=1;
      System.out.println("Correct answer, +1 points");
    }else if (answer==0){
      System.out.println("You chose to skip the question.");
    }else if (answer==1||answer==3||answer==4){
      points-=1;
      System.out.println("Wrong answer, -1 points");
    }System.out.println("Your total score is: "+points);
  }
}


