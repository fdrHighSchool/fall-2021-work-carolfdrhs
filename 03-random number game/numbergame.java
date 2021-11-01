import java.util.*;
import java.util.Random;


class numbergame {

  public static void main(String[] args) {
    String restart = "";
    Scanner ask = new Scanner(System.in);
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
        gameStart(1, customPick);
      }//end else if

      //asking if the user wants to play again
      System.out.println("would you like to play again? (yes or no)");
      restart = ask.nextLine();
      restart = restart.toLowerCase();

    }//ends loop when restart equals no
    while (!restart.equals("no"));
  }//end class



//game function
  public static void gameStart(int min, int max) {
    //find random number between the ranges
    Random random = new Random();
    int number = random.nextInt(max) + 1;

    Scanner numberGuess = new Scanner(System.in);

    //ask the user for their number guess thing
    System.out.println("Guess a number from 1-"+ max);
    int guess = numberGuess.nextInt();


    //setting up variables for while statement
    int numGuess = 1;
    int maxNum = max;
    int minNum = min;

    do{
      if (guess > number) {
        maxNum = guess - 1;
        System.out.println("Wrong too high! Pick another number from " + minNum + "-" + maxNum);
        guess = numberGuess.nextInt();

      }//end if
      else if (guess < number) {
        minNum = guess + 1;
        System.out.println("Wrong too low! Pick another number from " + minNum + "-" + maxNum);
        guess = numberGuess.nextInt();

      }//end else if
      numGuess++;


    }//end loop when the users guess is equal to the random number
    while (guess != number);

    System.out.println("Correct, it took " + numGuess + " tries");

  }//end gameStart function

}//end class
