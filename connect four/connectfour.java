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

    while(win){
      System.out.println("Enter a column number: ");
      int userCol = s.nextInt(); //1 greater than actual index cause starts at 1 instead of 0

      //loop to check for the empty space
      for(int i = board.length-1; i > -1;i--){
        if(board[i][userCol-1].equals("[ ]")){
          board[i][userCol-1] = letter;
          break;
        }
      }
      displayBoard(board);

      //alternate between X and O
      if(letter.equals("[X]")){
        letter = "[O]";
      }
      else{
        letter = "[X]";
      }

      //win conditions?


    }








  } // end main method


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
