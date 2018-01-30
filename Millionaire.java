/* 
 * Name: William
 * Date: Octover 11 2015
 * Teacher: Mrs. Andrighetti
 * Who Wants to be a Millionaire Program
 */
import java.util.Scanner;
import java.util.Random;
class Millionaire{
  public static void main (String args[]){
    Scanner myScanner = new Scanner (System.in);
    Random myRandom = new Random();
    String name;
    String answer;
    String input;
    String playagain;
    int counter1 = 0;
    int counter2 = 0;
    int counter3 = 0;
    int accumulator = 0;
    int i =0;
    System.out.println("What is your name?");
    name = myScanner.nextLine();
    System.out.println("Welcome to Who Wants to be a Millionaire, "+name+".");
    System.out.println("You will be answering a total of 15 questions. If you answer all 15 correctly, you will win 1 million dollars! If you answer a question incorrectly, you will be given the total prize money from your last checkpoint. The checkpoint questions are questions 5 and 10. Therefore, if you answer question 5 correctly, you will be guaranteed $5,000, and if you answer question 10 correctly, you will be guaranteed $50,000.");
    System.out.println("The questions will all be mulitple choice. To choose an answer, enter A, B, C, or D in capital letters.");
    System.out.println("There are also three 'lifelines' you can use to help you in answering the questions. You may only use each lifeline once.");
    System.out.println("The first lifeline is the 50/50 lifeline. Two incorrect options from the question are taken out, giving you a 50/50 chance to get the right answer.");
    System.out.println("The second lifeline is the phone a friend lifeline. Your friend will help you answer the question.");
    System.out.println("The third lifeline is the ask the audience lifeline. The audience will all chose which option is right, and the winning majority will be your answer.");
    System.out.println("To use the first lifeline, enter E instead of choosing one of the answers.");
    System.out.println("To use the second lifeline, enter F instead of choosing one of the answers.");
    System.out.println("To use the third lifeline, enter G instead of choosing one of the answers.");
    do{
    do{
      do{
        System.out.println("Are you ready to start? (yes/no)");
        input = myScanner.nextLine();
      }while (!(input.equals("yes")));
      System.out.println("The first question, worth $500:");//FIRST QUESTION STARTS HERE********************************1
      do{
        System.out.println("How long does it take for earth to orbit the sun once");
        System.out.println("A. 24 hours, B. 1 week, C. 4 weeks, D. 365 days,");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");//This line confirms the user input
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("D")){
              accumulator += 500;// Int accumulator is used to accumulate the total prize money of the user
              i+=1;//Int i is used to make sure that the program only runs each question once, and that the program will exit once the user answers a question wrong
              System.out.println("Your answer is correct!");
              System.out.println("You have won $500");  
            }else if (answer.equals("C")||answer.equals("A")||answer.equals("B")){
              System.out.println("Your answer is incorrect.");
              i-=20;//This tells the program that i is less than zero, so the program will know the user lost
              accumulator=0; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){//This is to check if this specific lifeline has been used already or not
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers A. 24 hours, and B. 1 week, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;//This is a counter to make sure the lifeline is used only once
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;//This is to generate a random number to determine the answer of the question
              if (num>3){
                System.out.println("Your friend chose D, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $500");
                accumulator+=500;
                i+=1;
              }else if (num==1){
                System.out.println("Your friend chose A, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose B, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audience lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose D, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $500");
                accumulator+=500;
                i+=1;
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose A, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose B, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }
      }while (i<1);
      if (i<0){
        break;
      }
      System.out.println("The second question, worth $500:");//SECOND QUESTION STARTS HERE*******************************2
      do{
        System.out.println("According to old sayings, how many lives can a cat live?");
        System.out.println("A. 8 lives, B. 9 lives, C. 10 lives , D. 11 lives");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("B")){
              accumulator += 500;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $500");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("A")||answer.equals("D")){
              System.out.println("Your answer is incorrect.");
              i-=20;
              accumulator=0; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers A. 8 lives, and D. 11 lives, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose B, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $500");
                accumulator+=500;
                i+=1;
              }else if (num==1){
                System.out.println("Your friend chose A, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose D, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose B, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $500");
                accumulator+=500;
                i+=1;  
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose A, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose D, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }
      }while (i<2);
      if (i<0){
        break;
      }
      System.out.println("The third question, worth $1000:");//THIRD QUESTION STARTS HERE*******************************3
      do{
        System.out.println("Which of these is the largest woodwind instrument?");
        System.out.println("A. Bassoon, B. Oboe, C. Clarinet, D. Flute");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("A")){
              accumulator += 1000;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $1000");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("B")||answer.equals("D")){
              System.out.println("Your answer is incorrect.");
              i-=20;
              accumulator=0; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers B. Oboe, and D. Flute, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose A, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $1000");
                accumulator+=1000;
                i+=1;  
              }else if (num==1){
                System.out.println("Your friend chose B, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose D, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
              break;
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose A, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $1000");
                i+=1; 
                accumulator+=1000;
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose B, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose D, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }
      }while (i<3);
      if (i<0){
        break;
      }
      System.out.println("The fourth question, worth $1000:");//FOURTH QUESTION STARTS HERE*******************************3
      do{
        System.out.println("Which of these is a dessert based on ice cream?");
        System.out.println("A. Thursdae, B. Fridae, C. Saturdae, D. Sundae");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("D")){
              accumulator += 1000;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $1000");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("B")||answer.equals("A")){
              System.out.println("Your answer is incorrect.");
              i-=20;
              accumulator=0; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers B. Fridae, and C. Saturdae, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose D, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $1000");
                accumulator+=1000;
                i+=1;  
              }else if (num==1){
                System.out.println("Your friend chose B, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose A, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
              break;
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose D, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $1000");
                i+=1; 
                accumulator+=1000;
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose B, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose A, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }
      }while (i<4);
      if (i<0){
        break;
      }
      System.out.println("The next question is a checkpoint question, meaning that if you answer it correctly, you will be guaranteed $5000.");
      System.out.println("The fifth question, worth $2000:");//FIFTH QUESTION STARTS HERE*******************************5
      do{
        System.out.println("Which part of the body do bronchial infections mainly affect");
        System.out.println("A. Heart, B. Limbs, C. Stomach, D. Lungs");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("D")){
              accumulator += 2000;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $2000");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("B")||answer.equals("A")){
              System.out.println("Your answer is incorrect.");
              i-=20;
              accumulator=0; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers A. Heart, and C. Stomach, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose D, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $2000");
                accumulator+=2000;
                i+=1;  
              }else if (num==1){
                System.out.println("Your friend chose B, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose A, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
              break;
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose D, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $2000");
                i+=1; 
                accumulator+=2000;
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose B, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20; 
                accumulator=0; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose A, which is the incorrect answer.");
                i-=20;
                accumulator=0; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }
      }while (i<5);
       if (i<0){
          break;
       }
       System.out.println("The sixth question, worth $2500:");//SIXTH QUESTION STARTS HERE*******************************6
       do{
        System.out.println("If a pilot gets 5 credited enemy kills in wartime, he is given the title:");
        System.out.println("A. Ace, B. King, C. Queen, D. Jack");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("A")){
              accumulator += 2500;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $2500");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("B")||answer.equals("D")){
              System.out.println("Your answer is incorrect.");
              i-=20;
              accumulator=5000; // The accumulator is reset to 5000 if the user gets an answer wrong because question 5 is a checkpoint question
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers B. King, and D. Jack, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose A, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $2500");
                accumulator+=2500;
                i+=1;  
              }else if (num==1){
                System.out.println("Your friend chose B, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose D, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
              break;
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose A, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $2500");
                i+=1; 
                accumulator+=2500;
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose B, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose D, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }
      }while (i<6);
      if (i<0){
        break;
      }
      System.out.println("The seventh question, worth $2500:");//SEVENTH QUESTION STARTS HERE*******************************7
      do{
        System.out.println("What was the name of the famous english rock band formed in 1960?");
        System.out.println("A. The Crickets, B. The Beatles, C. The Ladybugs , D. The Spiders");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("B")){
              accumulator += 2500;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $2500");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("A")||answer.equals("D")){
              System.out.println("Your answer is incorrect.");
              i-=20;
              accumulator=5000; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers A. The Crickets, and D. The Spiders, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose B, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $2500");
                accumulator+=2500;
                i+=1;
              }else if (num==1){
                System.out.println("Your friend chose A, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose D, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose B, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $2500");
                accumulator+=2500;
                i+=1;  
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose A, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose D, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }
      }while (i<7);
      if (i<0){
        break;
      }
      System.out.println("The eighth question, worth $5000:");//EIGHTH QUESTION STARTS HERE*******************************8
      do{
        System.out.println("What are the gaming counters used in casinos to represent money?");
        System.out.println("A. Fries, B. Chips, C. Rings, D. Wedges");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("B")){
              accumulator += 5000;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $5000");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("A")||answer.equals("D")){
              System.out.println("Your answer is incorrect.");
              i+=(-20);
              accumulator=5000; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers A. Fries, and D. Wedges, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose B, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $5000");
                accumulator+=5000;
                i+=1;
              }else if (num==1){
                System.out.println("Your friend chose A, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose D, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose B, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $5000");
                accumulator+=5000;
                i+=1;  
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose A, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose D, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }
      }while (i<8);
      if (i<0){
        break;
      }
       System.out.println("The ninth question, worth $10000:");//NINTH QUESTION STARTS HERE*******************************6
       do{
        System.out.println("How many keys does a piano have?");
        System.out.println("A. 88, B. 89, C. 90, D. 91");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("A")){
              accumulator += 10000;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $10000");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("B")||answer.equals("D")){
              System.out.println("Your answer is incorrect.");
              i-=20;
              accumulator=5000; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers B. King, and D. Jack, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose A, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $10000");
                accumulator+=10000;
                i+=1;  
              }else if (num==1){
                System.out.println("Your friend chose B, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose D, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
              break;
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose A, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $10000");
                i+=1; 
                accumulator+=10000;
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose B, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose D, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }
      }while (i<9);
      if (i<0){
        break;
      }
        System.out.println("The next question is a checkpoint question, meaning that if you answer it correctly, you will be guaranteed $50000.");
      System.out.println("The tenth question, worth $25000:");//TENTH QUESTION STARTS HERE*******************************10
      do{
        System.out.println("According to the proverb, what keeps the doctor away?");
        System.out.println("A. An orange a day, B. A tomato a day, C. An apple a day, D. A potato a day");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("C")){
              accumulator += 25000;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $25000");
              i+=1;  
            }else if (answer.equals("D")||answer.equals("B")||answer.equals("A")){
              System.out.println("Your answer is incorrect.");
              i-=20;
              accumulator=5000; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers A. An orange a day, and B. A tomato a day, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose C, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $25000");
                accumulator+=25000;
                i+=1;  
              }else if (num==1){
                System.out.println("Your friend chose B, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose D, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose A, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
              break;
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose C, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $25000");
                i+=1; 
                accumulator+=25000;
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose B, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose D, which is the incorrect answer.");
                i-=20; 
                accumulator=5000; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose A, which is the incorrect answer.");
                i-=20;
                accumulator=5000; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
          }
        }
      }while (i<10);
      if (i<0){
        break;
      }
      System.out.println("The eleventh question, worth $25000:");//ELEVENTH QUESTION STARTS HERE*******************************8
      do{
        System.out.println("Which animal is not part of the Zodiac?");
        System.out.println("A. Mouse, B. Lion, C. Rabbit, D. Dragon");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("B")){
              accumulator += 25000;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $25000");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("A")||answer.equals("D")){
              System.out.println("Your answer is incorrect.");
              i+=(-20);
              accumulator=50000; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers A. Mouse, and D. Dragon, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose B, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $25000");
                accumulator+=25000;
                i+=1;
              }else if (num==1){
                System.out.println("Your friend chose A, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose D, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose B, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $25000");
                accumulator+=25000;
                i+=1;  
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose A, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose D, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }
      }while (i<11);
      if (i<0){
        break;
      }
      System.out.println("The twelfth question, worth $75000:");//TWELFTH QUESTION STARTS HERE*******************************8
      do{
        System.out.println("What name is given to someone who makes, transports or sells something illicit?");
        System.out.println("A. Footpadder, B. Bootlegger, C. Blacksletter, D. Trickster");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("B")){
              accumulator += 75000;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $75000");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("A")||answer.equals("D")){
              System.out.println("Your answer is incorrect.");
              i+=(-20);
              accumulator=50000; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers A. Footpadder, and D. Trickster, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose B, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $75000");
                accumulator+=75000;
                i+=1;
              }else if (num==1){
                System.out.println("Your friend chose A, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose D, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose B, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $75000");
                accumulator+=75000;
                i+=1;  
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose A, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose D, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }
      }while (i<12);
      if (i<0){
        break;
      }
      System.out.println("The thirteenth question, worth $100000:");//THIRTEENTH QUESTION STARTS HERE*******************************8
      do{
        System.out.println("What was the third country to put a man into space?");
        System.out.println("A. Japan, B. Australia, C. Germany, D. China");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("D")){
              accumulator += 100000;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $100000");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("A")||answer.equals("B")){
              System.out.println("Your answer is incorrect.");
              i+=(-20);
              accumulator=50000; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers B. Australia, and C. Germany, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose D, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $100000");
                accumulator+=100000;
                i+=1;
              }else if (num==1){
                System.out.println("Your friend chose A, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose B, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose D, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $100000");
                accumulator+=100000;
                i+=1;  
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose A, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose B, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }
      }while (i<13);
      if (i<0){
        break;
      }
      System.out.println("The fourteenth question, worth $250000:");//FOURTEENTH QUESTION STARTS HERE*******************************8
      do{
        System.out.println("In which city does the protagonists of Spongebob Squarepants live?");
        System.out.println("A. Bikini Bottom, B. Under Wear, C. Atomic Atoll, D. Coral Canyon");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("A")){
              accumulator += 250000;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $250000");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("D")||answer.equals("B")){
              System.out.println("Your answer is incorrect.");
              i+=(-20);
              accumulator=50000; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers B. Under Wear, and C. Atomic Atoll, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose A, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $250000");
                accumulator+=250000;
                i+=1;
              }else if (num==1){
                System.out.println("Your friend chose D, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose B, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose A, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $250000");
                accumulator+=250000;
                i+=1;  
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose D, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose B, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }
      }while (i<14);
      if (i<0){
        break;
      }
      System.out.println("The last question, worth $500000:");//FIFTEENTH QUESTION STARTS HERE*******************************8
      do{
        System.out.println("What is the word “QWERTY” associated with?");
        System.out.println("A. Modern feminism, B. Computer keyboard, C. NASA space program, D. Special operations forces team");
        answer = myScanner.nextLine();
        if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")){
          System.out.println("Do you finalize your answer?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("Your final answer will be "+answer+".");
            if (answer.equals("B")){
              accumulator += 500000;
              System.out.println("Your answer is correct!");
              System.out.println("You have won $500000");
              i+=1;  
            }else if (answer.equals("C")||answer.equals("A")||answer.equals("D")){
              System.out.println("Your answer is incorrect.");
              i+=(-20);
              accumulator=50000; 
              break;
            }
          }else if (input.equals("no")){
            System.out.println("Please select your answer");
          }
        }else if (answer.equals("E")){
          System.out.println("Do you wish to use the 50/50 lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the 50/50 lifeline");
            if (counter1>=1){
              System.out.println("You can only use each lifeline once. Please select another answer");
            }else {
              System.out.println("The answers A. Modern feminism, and C. NASA space program, are incorrect.");
              System.out.println("Please select your answer");
              counter1+=1;
            }
          }
        }else if (answer.equals("F")){
          System.out.println("Do you wish to use the ask a friend lifeline?(yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask a friend lifeline");
            if (counter2>=1){
              System.out.println("You can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(7)+1;
              if (num>3){
                System.out.println("Your friend chose B, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $500000");
                accumulator+=500000;
                i+=1;
              }else if (num==1){
                System.out.println("Your friend chose A, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if (num==2){
                System.out.println("Your friend chose C, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if (num==3){
                System.out.println("Your friend chose D, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }
              counter2+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }else if (answer.equals("G")){
          System.out.println("Do you wish to use the ask the audience lifeline? (yes/no)");
          input = myScanner.nextLine();
          if (input.equals("yes")){
            System.out.println("You have chosen the ask the audeince lifeline");
            if (counter3>=1){
              System.out.println("you can only use each lifeline once. Please select another answer.");
            }else {
              int num = myRandom.nextInt(100)+1;
              if (num<=49){
                System.out.println("The audience chose B, which is the correct answer!");
                System.out.println("Your answer is correct!");
                System.out.println("You have won $500000");
                accumulator+=500000;
                i+=1;  
              }else if ((num>=50)&&(num<=66)){
                System.out.println("The audience chose A, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if ((num>=67)&&(num<=83)){
                System.out.println("The audience chose C, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }else if ((num>=84)&&(num<=100)){
                System.out.println("The audience chose D, which is the incorrect answer.");
                i-=20;
                accumulator=50000; 
                break;
              }
              counter3+=1;
            }
          }else if (input.equals("no")){
            System.out.println("Please select another answer.");
            break;
          }
        }
      }while (i<15);
      if (i<0){
        break;
      }
    }while ((i<15)&&(i>=1));//This line makes sure the user can only play once
    if (accumulator<1000000){
      System.out.println("Thank you for playing Who Wants to be a Millionaire! Good luck next time!");//This line is for those who did not win the game
    }else if (accumulator==1000000){
      System.out.println("Thank you for playing Who Wants to be a Millionaire! Congratulations for winning!!!");//This line is for those for won the game
    }
    System.out.println("Your total prize money is $"+accumulator);//This line outputs the users prize money
    System.out.println("Would you like to play again? (yes/no)");//This line asks the user if they would like to play again
    playagain = myScanner.nextLine();
    counter1 = 0;//These lines reset the different counters so the user can start from scratch
    counter2 = 0;
    counter3 = 0;
    accumulator = 0;
    i =0;
   }while (playagain.equals("yes"));//This loop makes sure that the user can play again if they want
  
   System.out.println("Have a good day!");
  }
}


