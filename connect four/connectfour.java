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
      if(round%2 == 0){//even
        letter = "[O]";
      }
      else{
        letter = "[X]";
      }

      round++;
      System.out.println(round);
    //  win = vertical(board,userCol,round);


    }//end while

  }//end main
// win conditions?
  public static boolean vertical(String[][] board, int userInput, int round){
    //check if 4 pieces were put into a column?
    int win = 0;
    if(round%2 == 0){
      for(int i = 0; i>board.length; i++){
        if(board[i][userInput].equals("[X]")){
          win++;
          System.out.println(win);
        }
        else{
          win = 0;
        }
      }
    }
    else{
      for(int i = 0; i>board.length; i++){
        if(board[i][userInput].equals("[O]")){
          win++;
          System.out.println(win);
        }
        else{
          win = 0;
        }
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
