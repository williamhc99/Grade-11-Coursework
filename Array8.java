/* 
 * Name: William Chen
 * Date: October 22 2015
 * Teacher: Mrs. Andrighetti
 * Array Exercise 8
 */
import java.util.Scanner;
class Array8{
  public static void main (String args[]){
    Scanner myScanner = new Scanner(System.in);
    int[] mark = new int[10];
    String[] firstname = new String[10];
    String[] lastname = new String[10];
    String input;
    int accumulator = 0;
    int counter = 0;
    int average=0;
    for (int i=0; (i<mark.length)&&(mark[i]>=0);i++){
      System.out.println("Enter your first name: ");
      firstname[i]=myScanner.nextLine();
      System.out.println("Enter your last name: ");
      lastname[i]=myScanner.nextLine();
      System.out.println("Enter your mark: ");
      mark[i]=myScanner.nextInt();
      myScanner.nextLine();
      if (mark[i]<=0){
        break;
      }
    }
    for (int i=0; i<mark.length;i++){
      counter+=1;
      accumulator+=mark[i];
      System.out.println(lastname[i]+", "+firstname[i]+" Mark is : "+mark[i]);
    }
    average = (accumulator/counter);
    System.out.println("The average mark for the students are: "+average);
  }
}
        
      