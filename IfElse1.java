/* 
 * Name: William Chen
 * Date: September 27 2015
 * If Else Extra Exercise 1
 */
import java.util.Scanner;
class IfElse1{
  public static void main(String args[]){
    Scanner myScanner = new Scanner (System.in);
    int temp;
    System.out.println("What is the temperature outside?");
    temp = myScanner.nextInt();
    if (temp<(-60)||temp>(50)){
      System.out.println("Invalid temperature.");
    }else if (temp<-20){
      System.out.println("It is very cold outside.");
    }else if (temp>=(-20)&&temp<=10){
      System.out.println("It is cold outside.");
    }else if (temp>10&&temp<25){
      System.out.println("It is warm outside.");
    }else if (temp>24&&temp<50){
      System.out.println("It is hot outside.");
    }else if (temp<(-60)&&temp>(50)){
      System.out.println("Invalid temperature.");
    }
  }
}