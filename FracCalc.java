import java.util.*;

public class FracCalc{
  public static void main(String[] args){
    Scanner ask = new Scanner(System.in);
    System.out.println("input your equation:");
    String equation = ask.nextLine();
    findNum(equation,2);
  }






    public static void findNum(String equation, int term){
      if (term == 1){

        if (equation.indexOf("/") > equation.indexOf(" ")){ //if there isnt a / in the first term indexOf =-1
          System.out.println(equation.substring(0,equation.indexOf(" ")));//stores the whole number
        }
        else{
          System.out.println(equation.substring(0,equation.indexOf("/")));//stores the numerator

        }

      }

      else{
        String term2 = equation.substring(equation.lastIndexOf(" "));
        if (term2.indexOf("/") == -1){ //if there isnt a / in the second term
          System.out.println(equation.substring(equation.lastIndexOf(" ")+1));//takes the whole number

        }
        else{
          System.out.println(equation.substring(equation.lastIndexOf(" ")+1,equation.lastIndexOf("/")));


        }
        //System.out.println(equation.substring(equation.indexOf(" ")+3)); //term 2
      }


    }







}
