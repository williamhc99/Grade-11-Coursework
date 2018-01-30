/* 
 * Name: William Chen
 * Date: October 2 2015
 * Teacher: Mrs. Andrighetti
 * Recommender Program
 */
import java.util.Scanner;
class Recommender {
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    int i = 0;
    String name;
    String ui;
    String ui1;
    String ui2;
    String ui3;
    System.out.println("Please enter your name: ");
    name = myScanner.nextLine();
    System.out.println(name+", welcome to the music recommender program. This programm will give you a music recommendation by asking you a series of questions.");
    System.out.println("To exit program, enter exit.");
    while (i>=0){//This creates a loop, so that the program can be ended at any specific time with 'break;'
      System.out.println("Do you prefer Classical or Popular music?");//This is the first question
      System.out.println("Enter 'a' for Classical music and 'b' for Popular music.");
      ui = myScanner.nextLine();
      if (ui.equals("a")){
        System.out.println("What size of ensemble to you prefer?");//This is the second question
        System.out.println("Enter 'a' for large groups");
        System.out.println("Enter 'b' for small groups");
        ui3 = myScanner.nextLine();
        if (ui3.equals("a")){
          System.out.println("What era of classical music do you prefer?");//This is the third question
          System.out.println("Enter 'a' for baroque era");
          System.out.println("Enter 'b' for classical era");
          System.out.println("Enter 'c' for romantic era");
          ui1 = myScanner.nextLine();
          System.out.println("What kind of instrumentation do you prefer?");//This is the fourth question
          System.out.println("Enter 'a' for orchestra");
          System.out.println("Enter 'b' for symphony");
          ui2 = myScanner.nextLine();
          if ((ui1.equals("a"))&&(ui2.equals("a"))){
            System.out.println("We recommend: Johann Sebastian Bach - Orchestral Suite No.3 in D");
            break;
          }else if ((ui1.equals("b"))&&(ui2.equals("a"))){
            System.out.println("We recommend: Wolfgang A. Mozart - Eine Kleine Nachtmusik");
            break;
          }else if ((ui1.equals("c"))&&(ui2.equals("a"))){
            System.out.println("We recommend: Franz Schubert - Erlkong");
            break;
          }else if ((ui1.equals("a"))&&(ui2.equals("b"))){
            System.out.println("We recommend: Johann Pachelbel - Canon in D Major");
            break;
          }else if ((ui1.equals("b"))&&(ui2.equals("b"))){
            System.out.println("We recommend: Ludwig van Beethover - Symphony No.9");
            break;
          }else if ((ui1.equals("c"))&&(ui2.equals("b"))){
            System.out.println("We recommend: Pyotr Ilich Tchaikovsky - Symphony No.6 'Pathetique'");
            break;
          }else if (ui1.equals("exit")||(ui2.equals("eixt"))) {//This is so that the program stops if the user inputs 'exit'
            System.out.println("Exiting program");
            break;
          }
        }else if (ui3.equals("b")){
          System.out.println("What era of classical music do you prefer?");
          System.out.println("Enter 'a' for baroque era");
          System.out.println("Enter 'b' for classical era");
          System.out.println("Enter 'c' for romantic era");
          ui1 = myScanner.nextLine();
          System.out.println("What kind of instrumentation do you prefer?");
          System.out.println("Enter 'a' for piano concerto");
          System.out.println("Enter 'b' for string quartet");
          ui2 = myScanner.nextLine();
          if ((ui1.equals("a"))&&(ui2.equals("a"))){
            System.out.println("We recommend: Johann Sebastain Bach - Piano Concerto No.1");
            break;
          }else if ((ui1.equals("b"))&&(ui2.equals("a"))){
            System.out.println("We recommend: Wolfgang Amadeus Mozart - Piano Concerto No.20");
            break;
          }else if (ui1.equals("c")&&(ui2.equals("a"))){
            System.out.println("We recommend: Peter Ilyich Tchaikovsky - Piano Concerto No.1 in B-Flat Minor");
            break;
          }else if ((ui1.equals("a"))&&(ui2.equals("b"))){
            System.out.println("We recommend: Antonio Vivaldi - Four Seasons");
            break;
          }else if ((ui1.equals("b"))&&(ui2.equals("b"))){
            System.out.println("We recommend: Ludwig van Beethoven - Razumovsky String Quartet ");
            break;
          }else if ((ui1.equals("c"))&&(ui2.equals("b"))){
            System.out.println("We recommend: Franz Schubert - Death and the Maiden");
            break;
          }else if (ui1.equals("exit")||(ui2.equals("eixt"))){
            System.out.println("Exiting program");
            break;
          }
        }else if (ui3.equals("exit")){
          System.out.println("Exiting program");
          break;
      }
      }else if (ui.equals("b")){
        System.out.println("How do you like to listen to your music?");
        System.out.println("Enter 'a' for listening to a live recording");
        System.out.println("Enter 'b' for listening to a recording");
        ui3 = myScanner.nextLine();
        if (ui3.equals("a")){
          System.out.println("What genre of popular music do you prefer?");
          System.out.println("Enter 'a' for pop");
          System.out.println("Enter 'b' for rap");
          System.out.println("Enter 'c' for country");
          System.out.println("Enter 'd' for electronic");
          ui1 = myScanner.nextLine();
          System.out.println("What time period of popular music do you prefer?");
          System.out.println("Enter 'a' for early 2000s");
          System.out.println("Enter 'b' for modern");
          ui2 = myScanner.nextLine();
          if (ui1.equals("a")&&ui2.equals("a")){
            System.out.println("We reccomend: Christina Aguilera - What a Girl Wants(Live)");
            break;
          }else if (ui1.equals("b")&&ui2.equals("a")){
            System.out.println("We reccomend: Tupac - Changes(Live)");
            break;
          }else if (ui1.equals("c")&&ui2.equals("a")){
            System.out.println("We reccomend: Sarah Mclachlan - Fallen(Live)");
            break;
          }else if (ui1.equals("d")&&ui2.equals("a")){
            System.out.println("We reccomend: Daft Punk - One More Time(Live)");
            break;
          }else if (ui1.equals("a")&&ui2.equals("b")){
            System.out.println("We reccomend: Taylor Swift - Style(Live)");
            break;
          }else if (ui1.equals("b")&&ui2.equals("b")){
            System.out.println("We reccomend: Eminem - Not Afriad(Live)");
            break;
          }else if (ui1.equals("c")&&ui2.equals("b")){
            System.out.println("We reccomend: Luke Bryon - Strip it Down(Live)");
            break;
          }else if (ui1.equals("d")&&ui2.equals("b")){
            System.out.println("We reccomend: Teebs - E S T A R A(Live)");
            break;
          }else if (ui1.equals("exit")||ui2.equals("exit")){
            System.out.println("Exiting program");
            break;
          }
        }else if (ui3.equals("b")){
          System.out.println("What genre of popular music do you prefer?");
          System.out.println("Enter 'a' for pop");
          System.out.println("Enter 'b' for rap");
          System.out.println("Enter 'c' for country");
          System.out.println("Enter 'd' for electronic");
          ui1 = myScanner.nextLine();
          System.out.println("What time period of popular music do you prefer?");
          System.out.println("Enter 'a' for early 2000s");
          System.out.println("Enter 'b' for modern");
          ui2 = myScanner.nextLine();
          if (ui1.equals("a")&&ui2.equals("a")){
            System.out.println("We reccomend: Christina Aguilera - What a Girl Wants");
            break;
          }else if (ui1.equals("b")&&ui2.equals("a")){
            System.out.println("We reccomend: Tupac - Changes");
            break;
          }else if (ui1.equals("c")&&ui2.equals("a")){
            System.out.println("We reccomend: Sarah Mclachlan - Fallen");
            break;
          }else if (ui1.equals("d")&&ui2.equals("a")){
            System.out.println("We reccomend: Daft Punk - One More Time");
            break;
          }else if (ui1.equals("a")&&ui2.equals("b")){
            System.out.println("We reccomend: Taylor Swift - Style");
            break;
          }else if (ui1.equals("b")&&ui2.equals("b")){
            System.out.println("We reccomend: Eminem - Not Afriad");
            break;
          }else if (ui1.equals("c")&&ui2.equals("b")){
            System.out.println("We reccomend: Luke Bryon - Strip it Down");
            break;
          }else if (ui1.equals("d")&&ui2.equals("b")){
            System.out.println("We reccomend: Teebs - E S T A R A");
            break;
          }else if (ui1.equals("exit")||ui2.equals("exit")){
            System.out.println("Exiting program");
            break;
          }
        }
      }else if (ui.equals("exit")){
        System.out.println("Exiting program");
        break;
      }
    }System.out.println("Thank you for using this program.");//This is for thanking the user for using the program
  }
}
