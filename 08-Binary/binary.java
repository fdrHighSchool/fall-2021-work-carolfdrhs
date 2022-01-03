import java.util.*;
/*
Binary to Decimal Converter
Your program should:
• Take in user input in the form of a binary number (A string of 1’s and 0’s)
• Convert the value to base 10
• Repeat until the user doesn’t want to input another value
• Extra credit: Have a menu to allow the user to convert decimal to binary also.

*/
public class binary{
  public static void main(String[] args){
    String restart = "";
    Scanner s = new Scanner(System.in);
    do{
      System.out.println("Input binary(quit to exit): ");
      String binary = s.nextLine();
      restart = binary.toLowerCase();
      if (!binary.equals("quit")){
        System.out.println(binary(binary));
      }

    }
    while(!restart.equals("quit"));

  }
  public static int binary(String binary){
     int exponent = binary.length()-1;
     int total = 0;
     for(int i = 0; exponent-i > -1; i++){//bug with for loop conditional
       if(Integer.parseInt(String.valueOf(binary.charAt(i))) == 1){
         total += Math.pow(2,exponent-i);
       }
     }
     return total;
  }



}
