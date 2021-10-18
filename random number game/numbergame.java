import java.util.Scanner;
import java.util.Random;


class numbergame {
  public static void main(String[] args) {
    //ask user for their name
    Scanner askName = new Scanner(System.in);
    System.out.println("What is your name?");
    String userName = askName.nextLine();

    String restart = "0";
    int restartCheck = 1;
    do{
      //ask user for difficulty
      Scanner askMode = new Scanner(System.in);
      System.out.println("Hello " + userName + ", what difficulty would you like when playing this number guessing game? \neasy \nmedium \nhard \ncustom");
      String difficulty = askMode.nextLine();
      difficulty = difficulty.toLowerCase(); //in case of capital letters

      int easy = difficulty.compareTo("easy");
      int medium = difficulty.compareTo("medium");
      int hard = difficulty.compareTo("hard");
      int custom = difficulty.compareTo("custom");
    //print ending statement when user wins
      if (easy == 0) {
        System.out.println("Correct "+ userName + ", it took " + gameStart(1,10) + " tries");
      }
      if (medium == 0) {
        System.out.println("Correct "+ userName + ", it took " + gameStart(1,100) + " tries");
      }
      if (hard == 0) {
        System.out.println("Correct "+ userName + ", it took " + gameStart(1,1000) + " tries");
      }
      if (custom == 0) {
        System.out.println("choose a number to be the maximum");
        int customPick = askMode.nextInt();
        System.out.println("Correct "+ userName + ", it took " + gameStart(1,customPick) + " tries");
      }


    //ask if wanna play again
      Scanner askRestart = new Scanner(System.in);
      System.out.println("would you like to play again? (yes or no)");
      restart = askRestart.nextLine();
      restart = restart.toLowerCase();
      restartCheck = restart.compareTo("no");
    }
    while (restartCheck != 0);
  }



//game function
  public static int gameStart(int min, int max) {
    //find random number between the ranges
    Random random = new Random();
    int number = random.nextInt(max) + 1;

    //ask the user for their number guess thing
    Scanner askGuess = new Scanner(System.in);
    System.out.println("Guess a number from 1-"+ max);
    int guess = askGuess.nextInt();


    //setting up variables for while statement
    int numGuess = 1;
    int maxNum = max;
    int minNum = min;

    do{
      if (guess > number) {
        maxNum = guess - 1;
        System.out.println("Wrong too high! Pick another number from " + minNum + "-" + maxNum);
        guess = askGuess.nextInt();

      }
      else if (guess < number) {
        minNum = guess + 1;
        System.out.println("Wrong too low! Pick another number from " + minNum + "-" + maxNum);
        guess = askGuess.nextInt();

      }
      numGuess++;

    }
    while (guess != number);

    return(numGuess);


  }


}
