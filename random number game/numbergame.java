import java.util.*;
import java.util.Random;


class numbergame {
  static Scanner ask = new Scanner(System.in);

  public static void main(String[] args) {
    //ask user for their name
    System.out.println("What is your name?");
    String userName = ask.nextLine();

    do{//restart loop
      //ask user for difficulty

      System.out.println("Hello " + userName + ", what difficulty would you like when playing this number guessing game? \neasy \nmedium \nhard \ncustom");
      String difficulty = ask.nextLine();
      difficulty = difficulty.toLowerCase(); //in case of capital letters


    //print ending statement when user wins
      if (difficulty.equals("easy")) {
        System.out.println("Correct "+ userName + ", it took " + gameStart(1,10) + " tries");
      }
      if (difficulty.equals("medium")) {
        System.out.println("Correct "+ userName + ", it took " + gameStart(1,100) + " tries");
      }
      if (difficulty.equals("hard")) {
        System.out.println("Correct "+ userName + ", it took " + gameStart(1,1000) + " tries");
      }
      if (difficulty.equals("custom")) {
        System.out.println("choose a number to be the maximum");
        int customPick = ask.nextInt();
        System.out.println("Correct "+ userName + ", it took " + gameStart(1,customPick) + " tries");
      }
      if (difficulty.equals("quit")){
        break;
      }

    }
    while ();//in progress
  }



//game function
  public static int gameStart(int min, int max) {
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
        System.out.println("Wrong too high! Pick another number from " + minNum + "-" + maxNum);
        guess = ask.nextInt();

      }
      else if (guess < number) {
        minNum = guess + 1;
        System.out.println("Wrong too low! Pick another number from " + minNum + "-" + maxNum);
        guess = ask.nextInt();

      }
      numGuess++;

    }
    while (guess != number);

    return(numGuess);


  }


}
