import java.util.*;

public class connectfour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[][] board = new String[6][7];

    System.out.println("\u001B[32mConnect Four!\nPress enter to start.");
    s.nextLine();

    fillBoard(board);
    displayBoard(board);

    String letter = "[X]";
    boolean win = true;
    int round = 0;
    //System.out.println(board.length); 6
    //System.out.println(board[0].length); 7
    while(win){
      if(letter.equals("[X]")){
        System.out.println("Player X, enter a column number: ");
      }
      else{
        System.out.println("Player O, enter a column number: ");
      }
      int userCol = s.nextInt();
      playRound(userCol,board,letter);
      round++;
      win = vertical(board,userCol,letter);

      //alternate between X and O
      if(round%2 == 0){//even
        letter = "[X]";
      }
      else{
        letter = "[O]";
      }
    }//end while

    if(round%2 == 0){
      System.out.println("win player 2(O)");
    }
    else{
      System.out.println("win player 1(X)");
    }


  }//end main

  public static void playRound(int userCol, String[][] board, String letter){
    //loop to check for the empty space
    for(int i = board.length-1; i > -1;i--){
      if(board[i][userCol-1].equals("[ ]")){
        board[i][userCol-1] = letter;
        break;
      }
    }
    displayBoard(board);
  }



// win conditions?


  public static boolean vertical(String[][] board, int userInput, String letter){
    int win = 0;
    for(int i = 0;i<board.length;i++){
      if(board[i][userInput-1].equals(letter)){//bug with if statement
        win++;
        System.out.println(win);
      }
      else{
        win = 0;
      }
    }
    if(win == 4){
       return false;
     }
    else{
       return true;
     }
 }









  public static void fillBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        board[row][col] = "[ ]";
      } // end inner loop
    } // end outer loop
  } // end fillBoard method

  public static void displayBoard(String[][] board) {
    System.out.println("\033[H\033[2J"); // clear the terminal
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " ");
      } // end inner for loop
      System.out.println();
    } // end outer for loop
  } // end displayBoard method


} // end class
