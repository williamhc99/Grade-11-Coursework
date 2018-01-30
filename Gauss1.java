import java.util.Scanner;
public class Gauss1
{
 public static void main( String args [ ] )
 {
 // build scanner, prompt user and get input
 Scanner scanner = new Scanner( System.in );
 System.out.print( "Enter n: " );
 int n = scanner.nextInt( );
 // calculate sum
 int sum = 0; // start sum at 0
 for ( int k = 1; k <= n; k++ )
 {
 sum += k; // add k onto sum
 System.out.print( "+" + k ); // nice output
 }
 // output final answer
 System.out.println( " = " + sum );  
 }
}