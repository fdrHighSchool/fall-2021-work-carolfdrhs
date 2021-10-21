import java.util.*;
import java.util.Random;


class numbergame {
  //global scanner
  static Scanner ask = new Scanner(System.in);

  public static void main(String[] args) {
    String restart = "";

    do{//restart loop
      //ask user for difficulty
      System.out.println("Hello, what difficulty would you like when playing this number guessing game? \neasy \nmedium \nhard \ncustom");
      String difficulty = ask.nextLine();
      difficulty = difficulty.toLowerCase(); //in case of capital letters


    //print ending statement when user wins
      if (difficulty.equals("easy")) {
        gameStart(1,10);
      }//end if
      else if (difficulty.equals("medium")) {
        gameStart(1,100);
      }//end else if
      else if (difficulty.equals("hard")) {
        gameStart(1,1000);
      }//end else if
      else if (difficulty.equals("custom")) {
        System.out.println("choose a number to be the maximum");
        int customPick = ask.nextInt();
        gameStart(1,customPick);
      }//end else if

      //ask user if they would like to play again
      System.out.println("would you like to play again? (yes or no)");
      restart = ask.nextLine();
      restart = restart.toLowerCase();



    }//end loop
    while (!restart.equals("no"));
  }//end main



//game function
  public static void gameStart(int min, int max) {
    //find random number between the ranges
    Random random = new Random();
    int number = random.nextInt(max) + 1;

    //ask the user for their number guess thing
    System.out.println("Guess a number from 1-"+ max);
    int guess = ask.nextInt();


    //setting up variables for while statement
    int numGuess = 1;
    int maxNum = max;
    int minNum = min;

    do{

      if (guess > number) {
        maxNum = guess - 1;
        System.out.println("Wrong too high! Pick another number from " + minNum + "-" + maxNum); //changes range based on the guess
        guess = ask.nextInt(); //stores the users next guess

      }//end if
      else if (guess < number) {
        minNum = guess + 1;
        System.out.println("Wrong too low! Pick another number from " + minNum + "-" + maxNum);//changes range based on the guess
        guess = ask.nextInt();//stores the users next guess

      }//end else if
      numGuess++;//stores the number of guesses


    }//end loop
    while (guess != number); //loops until the user guesses right

    System.out.println("Correct, it took " + numGuess + " tries");//winning print statement



  }//end gameStart function


}//end class
