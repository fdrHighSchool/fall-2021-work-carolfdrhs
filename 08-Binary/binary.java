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
    do{ //loop bug where the intro prints twice
      System.out.println("Type binary for binary->decimal and decimal for decimal->binary(quit to exit): ");
      String converter = s.nextLine();
      restart = converter.toLowerCase();

      if(converter.equals("binary")){
        System.out.println("Input Binary: ");
        String binary = s.nextLine();
        System.out.println(binary(binary));
      }

      else if (converter.equals("decimal")){
        System.out.println("Input Decimal: ");
        int decimal = s.nextInt();
        System.out.println(decimal(decimal));
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


  public static int decimal(int decimal){
    int exponent = 0;
    String binary = "1";
    for(int i = 0; decimal>=Math.pow(2,i); i++){
        exponent = i;
    }
    decimal -= Math.pow(2,exponent);
    for(int i = 1; decimal != 0; i++){
      if(Math.pow(2,exponent-i) <= decimal){
        decimal -= Math.pow(2,exponent-i);
        binary += "1";

      }
      else{
        binary += "0";
      }

    }


    return Integer.parseInt(binary);
  }



}
