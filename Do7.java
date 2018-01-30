/*
 * Do Loop 7.java
 * Date: Sept 26 2015
 * Author: William Chen
 */
import java.util.Scanner;
class Do7 {
  public static void main(String args[]) {     
    Scanner myScanner = new Scanner(System.in);
    int chips;
    int num = 0;
    String choice;
    do {
      System.out.println("How many bags of chips would you like?");
      chips = Integer.parseInt(myScanner.nextLine());
      System.out.println("Your total cost for "+chips+" bag(s) of chips will be: $"+(1.25*chips));
      System.out.println("Would you like to make another purchase?");
      //choice = myScanner.nextLine();
      choice = myScanner.nextLine();
      if (choice.equals("no")){
        break;
      }
      num++;
    }while((num>=0));
  }
}