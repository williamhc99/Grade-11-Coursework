import java.util.Scanner;

/*
 * Name:William Chen
 * Date:Sept 18 2015
 * Variable Exercies 8
 */

class Var8 {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
    
    int money;
    int interest;
    int years;
    
    System.out.println("In $, how much money are you investing?");
    money = myScanner.nextInt();
    System.out.println("In %, what is the interest rate?");
    interest = myScanner.nextInt();
    System.out.println("In years, how long is your investment going to last?");
    years = myScanner.nextInt();
    
    int earned = money*interest/100*years;

    System.out.println("You will earn $" +earned+" in interest.");
    
    int total = money+earned;
    
    System.out.println("Your total investment after "+years+" years will be $"+total);
      
    
      }
  }