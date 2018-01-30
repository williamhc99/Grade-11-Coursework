/*
 * While Loop 8.java
 * Date: Sept 24 2015
 * Author: William Chen
 */

class While8 {
  public static void main(String args[]) {     
    int num = 1;
    int sum = 0;
    while ((num>0)&&(num<11)){
     
      System.out.println(num);
      sum+=num;
      num++;
    } 
    System.out.println("The average of the numbers is "+(sum/10));
  }
}