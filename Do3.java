/*
 * Do Loop 3.java
 * Date: Sept 26 2015
 * Author: William Chen
 */

class Do3 {
  public static void main(String args[]) {     
    int num = 0;
    do {
      System.out.println(num);
      num+=1;
    }while((num>=0)&&(num<100));
    do {
      System.out.println(num);
      num-=1;
    }while((num>=0)||(num==100));
  }
}