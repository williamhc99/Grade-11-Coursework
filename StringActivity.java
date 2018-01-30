/*
 * Name: William Chen
 * Date: November 20 2015
 * Teacher: Mrs. Andrighetti
 * String Activity November 20
 */
import java.util.Scanner;
class StringActivity{
  static Scanner myScanner = new Scanner (System.in);
  public static void main (String args[]){
    int userInput;
    boolean repeatProgram=true;
    String userChoice;
    while (repeatProgram==true){
      System.out.println("Enter the number of method you want to use (1-17)");
      userInput = myScanner.nextInt();
      myScanner.nextLine();
      if (userInput==1){
        firstnameLastname();
      }else if (userInput==2){
        wordLength();
      }else if (userInput==3){
        letterPosition();
      }else if (userInput==4){
        lastCharacter();
      }else if (userInput==5){
        wordCombiner();
      }else if (userInput==6){
        lastThree();
      }else if (userInput==7){
        lastThreeModified();
      }else if (userInput==8){
        catFinder();
      }else if (userInput==9){
        letterReplacer();
      }else if (userInput==10){
        reverseOrder();
      }else if (userInput==11){
        letterFinder();
      }else if (userInput==12){
        vowelCounter();
      }else if (userInput==13){
        vowelRemover();
      }else if (userInput==14){
        vowelRemoverModified();
      }else if (userInput==15){
        vowelPercentage();
      }else if (userInput==16){
        vowelPercentageModified();
      }else if (userInput==17){
        totalVowelPercentage();
      }
      System.out.println("Do you want to use another method? (yes/no)");//Option to allow user to either continue the program or not
      userChoice = myScanner.nextLine();
      if (userChoice.equals("no")){
        repeatProgram=false;
      }
    }System.out.println("Thank you for using the program");
  }
  public static void firstnameLastname(){
    String firstName;
    String lastName;
    String finalOutput;
    System.out.println("Enter your first name: ");
    firstName = myScanner.nextLine();
    System.out.println("Enter your last name: ");
    lastName = myScanner.nextLine();
    finalOutput = (lastName+", "+firstName);// Combining two strings
    System.out.println(finalOutput);
  }
  public static void wordLength(){
    String word;
    int wordLength;
    System.out.println("Enter a word: ");
    word = myScanner.nextLine();
    wordLength = word.length();//Using the string.length() method to find the number of letters in a word
    System.out.println(word+" has "+wordLength+" letters.");
  }
  public static void letterPosition(){
    String word;
    String letterInput;
    char letter;
    int position=0;
    System.out.println("Enter a word");
    word = myScanner.nextLine();
    System.out.println("Enter a letter");
    letterInput = myScanner.nextLine();
    letter = letterInput.charAt(0);
    for (int i=0; i<word.length(); i++){//Using a for loop and string.charAt method to compare each letter of the word to the letter the user entered
      if (letter == word.charAt(i)){
        position=(i+1);
      }
    }
    System.out.println("The letter "+letter+" is in position "+position+" in the word "+word);
  }
  public static void lastCharacter(){
    String word;
    char lastLetter;
    System.out.println("Enter a word");
    word = myScanner.nextLine();
    lastLetter = word.charAt(word.length()-1);//Using the string.length and string.charAt to find the last letter of the word the user entered
    System.out.println("The last character of "+word+" is "+lastLetter);
  }
  public static void wordCombiner(){
    String word1;
    String word2;
    String finalWord;
    System.out.println("Enter a word");
    word1=myScanner.nextLine();
    System.out.println("Enter another word");
    word2=myScanner.nextLine();
    finalWord = word1.concat(word2);//Using the concat method to combine two strings
    System.out.println("The two words combined will be: "+finalWord);
  }
  public static void lastThree(){
    String word;
    char character;
    int counter=0;
    System.out.println("Enter a word");
    word = myScanner.nextLine();
    System.out.println("The word is "+(word.length()-1)+" characters long");
    for (int i=(word.length()-1); i>0; i--){//Using a for loop to ouput the word backwards, and then limiting it so that it can only output three letters
      character = word.charAt(i);
      System.out.println("The letter in the "+i+" position of the word is "+character);
      counter++;
      if (counter>=3){
        break;
      }
    }
  }
  public static void lastThreeModified(){
    String word;
    char character;
    int counter = 0;
    do{
      System.out.println("Enter a word");
      word = myScanner.nextLine();
      if (word.length()<3){//Using a if statment to make sure the word is longer than 3 letters
        System.out.println("Please enter another word that is longer than three letters.");
      }
    }while (word.length()<3);
    System.out.println("The word is "+(word.length()-1)+" characters long");
    for (int i=(word.length()-1); i>0; i--){
      character = word.charAt(i);
      System.out.println("The letter in the "+i+" position of the word is "+character);
      counter++;
      if (counter>=3){
        break;
      }
    }
  }
  public static void catFinder(){
    String word;
    String cat = "cat";
    int result;
    System.out.println("Enter a word");
    word = myScanner.nextLine();
    result = word.indexOf(cat);//Using the String.indexOf method to find the position of the word cat in the word the user entered
    if (result>=0){
      System.out.println("The word you entered contains the word cat.");
      System.out.println("It is in the "+result+" position of the word you entered.");
    }   
  }
  public static void letterReplacer(){
    String word;
    String result;
    System.out.println("Enter a word:");
    word = myScanner.nextLine();
    result = (word.replace('a','e'));//Using the String.replace method to replace characters in a string
    System.out.println("The word with all a's replaced with e's is: "+result);
  }
  public static void reverseOrder(){
    String word;
    char letter;
    System.out.println("Enter a word");
    word = myScanner.nextLine();
    System.out.println("The word backwards is: ");
    for (int i=word.length()-1; i>=0; i--){//Using a for loop and String.charAt method to output a word backwards
      letter=word.charAt(i);
      System.out.print(letter);
    }
    System.out.println();
  }
  public static void letterFinder(){
    String word;
    String character;
    char letter;
    int position=0;
    System.out.println("Enter a word");
    word = myScanner.nextLine();
    System.out.println("Enter a letter");
    character = myScanner.nextLine();
    letter = character.charAt(0);
    for (int i=0; i<word.length(); i++){//Using a for loop and String.charAt method to find if the letter the user entered is in the word the user entered
      if (letter==word.charAt(i)){
       position=(i+1);
      }
    }
    if (position==0){
      System.out.println("The letter "+letter+" is not in the word "+word);
    }else{
      System.out.println(letter+" is in the "+position+" position in the word "+word);
    }
  }
  public static void vowelCounter(){
    String word;
    char[] vowel = new char[]{'a','e','i','o','u'};
    int accumulator=0;
    System.out.println("Enter a word");
    word = myScanner.nextLine();
    for (int a=0; a<word.length(); a++){//Using a sequence of for loops and String.charAt method to count the number of vowels in the word the user entered
      for (int i=0; i<vowel.length; i++){
        if (word.charAt(a)==vowel[i]){
          accumulator+=1;
        }
      }
    }
    System.out.println("The word "+word+" has "+accumulator+" vowels in it");
  }
  public static void vowelRemover(){
    String word;
    System.out.println("Enter a word");
    word = myScanner.nextLine();
    word = word.replaceAll("[AaEeIiOoUu]", "");//Using the String.replaceAll method to remove all vowels
    System.out.println("The word you entered without any vowels is: "+word);
  }
  public static void vowelRemoverModified(){
    String word;
    String userInput;
    boolean continueLoop=true;
    while (continueLoop==true){//Using a while loop and if statments to remove vowels for multiple words
      System.out.println("Enter a word");
      word = myScanner.nextLine();
      word = word.replaceAll("[AaEeIiOoUu]", "");
      System.out.println("The word you entered without any vowels is: "+word);
      System.out.println("Do you want to enter another word? (yes/no)");
      userInput = myScanner.nextLine();
      if (userInput.equals("yes")){
        continueLoop=true;
      }else if (userInput.equals("no")){
        continueLoop=false;
      }
    }
  }
  public static void vowelPercentage(){
    String word;
    char[] vowel = new char[]{'a','e','i','o','u'};
    double accumulator=0;
    double percentage;
    System.out.println("Enter a word");
    word = myScanner.nextLine();
    for (int a=0; a<word.length(); a++){//Using the accumulator method to find the number of vowels, then dividing by the length of the word to find the perecentage
      for (int i=0; i<vowel.length; i++){
        if (word.charAt(a)==vowel[i]){
          accumulator+=1;
        }
      }
    }
    percentage = (accumulator/(word.length())*100);
    System.out.println(percentage+" percent of the word "+word+" are vowels");
  }
  public static void vowelPercentageModified(){
    String [] word = new String [1000];
    char[] vowel = new char[]{'a','e','i','o','u'};
    double accumulator=0;
    double [] percentage = new double[1000];
    int userPercentage;
    int counter=0;
    for (int i=0; i<word.length; i++){
      System.out.println("Enter a word");
      word[i] = myScanner.nextLine();
      counter+=1;
      if (word[i].equals("quit")){
        break;
      }
    }
    System.out.println("Enter a percentage (an integer value out of 100)");//Using 3 for loops to accumulate a percentage of vowels for each word, then outputting the words that have a higher vowel percentage than the percentage the user entered
    userPercentage = myScanner.nextInt();
    myScanner.nextLine();
    for (int x=0; x<counter-1; x++){
      for (int a=0; a<word[x].length(); a++){
        for (int i=0; i<vowel.length; i++){
          if (word[x].charAt(a)==vowel[i]){
            accumulator+=1;
          }
        }
      }
      percentage[x] = (accumulator/word[x].length())*100;
    }
    System.out.println("All words with a higher vowel percentage than "+userPercentage+"%: ");
    for (int i=0; i<counter-1; i++){
      if (percentage[i]>=userPercentage){
        System.out.println(word[i]);
      }
    }
  }
  public static void totalVowelPercentage(){
    String [] word = new String [1000];
    char[] vowel = new char[]{'a','e','i','o','u'};
    double totalLetters=0;
    double accumulator=0;
    double percentage;
    int counter=0;
    for (int i=0; i<word.length; i++){
      System.out.println("Enter a word");
      word[i] = myScanner.nextLine();
      counter+=1;
      if (word[i].equals("quit")){
        break;
      }
    }
    for (int x=0; x<counter-1; x++){//Using 3 for loops to accumulate total vowel amount then accumulating total word count and dividing them to find total percentage of vowels
      for (int a=0; a<word[x].length(); a++){
        for (int i=0; i<vowel.length; i++){
          if (word[x].charAt(a)==vowel[i]){
            accumulator+=1;
          }
        }
      }
    }
    for (int i=0; i<counter-1; i++){
      totalLetters += word[i].length();
    }
    percentage = (accumulator/totalLetters)*100;
    System.out.println("The total percentage of vowels to the number of letters entered is "+percentage+"%");
  }
}
  
    