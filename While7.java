/*
 * While Loop 7.java
 * Date: Sept 24 2015
 * Author: William Chen
 */

class While7 {
  public static void main(String args[]) {     
    int num = 1;
    int sum = 0;
    while ((num>0)&&(num<11)){
     
      System.out.println(num);
      sum+=num;
      num++;
    } 
    System.out.println("The total sum of the numbers is "+sum);
  }
}