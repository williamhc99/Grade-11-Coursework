import java.util.Scanner;
class test3{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    int i=0;
    while (i<10){
      System.out.println("Enter a number");
      i = myScanner.nextInt();
      System.out.println("test");
    }
  }
}