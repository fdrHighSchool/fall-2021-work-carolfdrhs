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
      return 1;//take whole number

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

    public static int simplify(int num, int den, int which){
      for (int i = 1; i<num || i<den; i++){
        if (num%i == 0 && den%i == 0){
          num = num/i;
          den = den/i;
        }
      }
      if (which == 1){
        return num;
      }
      else{
        return den;
      }
    }
    public static int add(int whole1, int whole2, int num1, int den1, int num2, int den2, int which){
      int addWhole = whole1 + whole2;
      int commonDen = den1 * den2;
      int addNum = (num1*den2) + (num2*den1);
      if (which == 1){
        return addNum;
      }
      else if (which == 2){
        return commonDen;
      }
      else{
        return addWhole;
      }



    }



    public static int produceAnswer(String operand1, String operand2, String operator){
      int whole1 = findWhole(operand1);
      int num1 = findNum(operand1);
      int den1 = findDen(operand1);

      int whole2 = findWhole(operand2);
      int num2 = findNum(operand2);
      int den2 = findDen(operand2);

      if (operator.equals("+")){
        int addNum =
        System.out.println(add(whole1,whole2,num1,den1,num2,den2,1));
        System.out.println(add(whole1,whole2,num1,den1,num2,den2,2));

        simplify
        return add(whole1,whole2,num1,den1,num2,den2,1);


      }
      if (operator.equals("*")){
        improperNum(whole1, num1, den1);
        return 0;
      }
      return 0;
    }






    }
