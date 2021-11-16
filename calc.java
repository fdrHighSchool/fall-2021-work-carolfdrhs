import java.util.*;

public class calc{
  public static void main(String[] args){
    Scanner ask = new Scanner(System.in);
    System.out.println("input your equation:");
    String equation = ask.nextLine();

    String operand1 = equation.substring(0,equation.indexOf(" "));
    String operand2 = equation.substring(equation.lastIndexOf(" ")+1);
    String operator = equation.substring(equation.indexOf(" ")+1, equation.lastIndexOf(" "));
    produceAnswer(operand1,operand2,operator);

  }
  public static int findNum(String operand){
    if (operand.indexOf("_")!= -1){
      return Integer.parseInt(operand.substring(operand.indexOf("_")+1,operand.indexOf("/")));
    }
    else if (operand.indexOf("/") == -1) {
        return Integer.parseInt(operand);
      }
    else {
      return Integer.parseInt(operand.substring(0,operand.indexOf("/")));
    }
  }


  public static int findDen(String operand){
    if (operand.indexOf("/") == -1){//if there isnt a slash
      return Integer.parseInt(operand);//take whole number

    }
    else{//if theres a slash
      return Integer.parseInt(operand.substring(operand.indexOf("/")+1)); //take denominator
    }

    }


    public static int findWhole(String operand){
      if (operand.indexOf("_")!= -1){//if there is a _
        return Integer.parseInt(operand.substring(0, operand.indexOf("_")));
    }
      else{
        return 0;
      }
    }
    public static int improperNum(int whole, int num, int den){
       return whole * den + num;//returns numerator of the improper fraction

    }

    public static int add(int num1, int num2){
      return num1 + num2;
    }
    public static int commonDen(int num1, int den1, int num2, int den2){
      int deno1= den1 * den2;
      int nume1 = num1 * den2;
      int nume2 = num2 * den1;
      int deno2 = den2 * den1;


    }

    public static void produceAnswer(String operand1, String operand2, String operator){
      int whole1 = findWhole(operand1);
      int num1 = findNum(operand1);
      int den1 = findDen(operand1);

      int whole2 = findWhole(operand2);
      int num2 = findNum(operand2);
      int den2 = findDen(operand2);

      if (operator.equals("+")){
        int addWhole = add(whole1,whole2);

      }
      if (operator.equals("*")){
        improperNum(whole1, num1, den1);
      }






    }

}
