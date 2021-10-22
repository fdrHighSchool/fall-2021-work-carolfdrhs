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

      int max = 0;
    //print ending statement when user wins
      if (difficulty.equals("easy")) {
        max = 10;
      }
      else if (difficulty.equals("medium")) {
        max = 100;
      }
      else if (difficulty.equals("hard")) {
        max = 1000;
      }
      else if (difficulty.equals("custom")) {
        System.out.println("choose a number to be the maximum");
        max = ask.nextInt();
      }

      gameStart(1, max);

      System.out.println("would you like to play again? (yes or no)");
      restart = ask.nextLine();
      restart = restart.toLowerCase();



    }
    while (!restart.equals("no"));//in progress
  }



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
      System.out.println(numGuess); //guess check
      if (guess > number) {
        maxNum = guess - 1;
        System.out.println("Wrong too high! Pick another number from " + minNum + "-" + maxNum);
        guess = numberGuess.nextInt();

      }
      else if (guess < number) {
        minNum = guess + 1;
        System.out.println("Wrong too low! Pick another number from " + minNum + "-" + maxNum);
        guess = numberGuess.nextInt();

      }
      numGuess++;


    }
    while (guess != number);

    System.out.println("Correct, it took " + numGuess + " tries");

  }


}
