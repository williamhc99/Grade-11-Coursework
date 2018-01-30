/* 
 * Name: William Chen
 * Date: October 22 2015
 * Teacher: Mrs. Andrighetti
 * Array Exercise 6
 */
import java.util.Scanner;
class Array6{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    int[] mark = new int[10];
    String[] firstname = new String[10];
    String[] lastname = new String[10];
    String input;
    int accumulator = 0;
    int counter = 0;
    int average=0;
    for (int i=0; i<mark.length;i++){
      System.out.println("Enter your first name: ");
      firstname[i]=myScanner.nextLine();
      System.out.println("Enter your last name: ");
      lastname[i]=myScanner.nextLine();
      System.out.println("Enter your mark: ");
      mark[i]=myScanner.nextInt();
      myScanner.nextLine();
    }
    System.out.println("Do you want to view the results of those who passed or those who failed? (pass/fail)");
    input = myScanner.nextLine();
    for (int i=0; i<mark.length;i++){
      if (input.equals("pass")){
        if (mark[i]>=50){
          counter+=1;
          accumulator+=mark[i];
          average = (accumulator/counter);
          System.out.println(lastname[i]+", "+firstname[i]+" Mark is : "+mark[i]);
        }
      }else if (input.equals("fail")){
        if (mark[i]<50){
          counter+=1;
          accumulator+=mark[i];
          average = accumulator/counter;
          System.out.println(lastname[i]+", "+firstname[i]+" Mark is : "+mark[i]);
        }
      }
    } System.out.println("The average mark for "+input+"ing students is: "+average);
  }
}