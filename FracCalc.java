import java.util.*;

public class FracCalc{
  public static void main(String[] args){
    Scanner ask = new Scanner(System.in);
    System.out.println("input your equation:");
    String equation = ask.nextLine();
    findNum(equation,1);
    findDen(equation,1);

    findNum(equation,2);
    findDen(equation,2);

    operator(equation);

  }









    public static int findNum(String equation, int operand){
      if (operand == 1){

        if (equation.indexOf("/") > equation.indexOf(" ") || equation.indexOf("/") == -1){ //if there isnt a / in the first term indexOf =-1
          System.out.println("num1 is " +equation.substring(0,equation.indexOf(" ")));//stores the whole number
          return Integer.parseInt(equation.substring(0,equation.indexOf(" ")));

        }
        else{
          System.out.println("num1 is " +equation.substring(0,equation.indexOf("/")));//stores the numerator
          return Integer.parseInt(equation.substring(0,equation.indexOf("/")));

        }

      }

      else{
        String operand2 = equation.substring(equation.lastIndexOf(" "));
        if (operand2.indexOf("/") == -1){ //if there isnt a / in the second term
          System.out.println("num2 is:" + equation.substring(equation.lastIndexOf(" ")+1));//takes the whole number
          return Integer.parseInt(equation.substring(equation.lastIndexOf(" ")+1));

        }
        else{
          System.out.println("num2 is:" + equation.substring(equation.lastIndexOf(" ")+1,equation.lastIndexOf("/")));
          return Integer.parseInt(equation.substring(equation.lastIndexOf(" ")+1,equation.lastIndexOf("/")));
        }
        //System.out.println(equation.substring(equation.indexOf(" ")+3)); //term 2
      }


    }//end findNum


    public static void operator(String equation){
      System.out.println("operator is: " + equation.substring(equation.indexOf(" ")+1,equation.lastIndexOf(" ")));
    }





    public static int findDen(String equation,int operand){
      if (operand == 1){
        if (equation.indexOf("/") > equation.indexOf(" ")|| equation.indexOf("/") == -1){ //if there isnt a / in the first term indexOf =-1
          System.out.println("den1 is: " + equation.substring(0,equation.indexOf(" ")));//stores the whole number (for now)
          return Integer.parseInt(equation.substring(0,equation.indexOf(" ")));
        }
        else{
          System.out.println("den1 is: " + equation.substring(equation.indexOf("/")+1,equation.indexOf(" ")));//stores the denominator
          return Integer.parseInt(equation.substring(equation.indexOf("/")+1,equation.indexOf(" ")));
        }
      }
      else{
        String operand2 = equation.substring(equation.lastIndexOf(" "));
        if (operand2.indexOf("/") == -1){ //if there isnt a / in the second term
          System.out.println("den2 is:" + equation.substring(equation.lastIndexOf(" ")+1));//takes the whole number
          return Integer.parseInt(equation.substring(equation.lastIndexOf(" ")+1));

        }
        else{
          System.out.println("den2 is:" + equation.substring(equation.lastIndexOf("/")+1));
          return Integer.parseInt(equation.substring(equation.lastIndexOf("/")+1));
        }

      }
    }










}//end main
