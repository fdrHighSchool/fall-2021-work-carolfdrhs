import java.util.*;

public class calc{
  public static void main(String[] args){
    Scanner ask = new Scanner(System.in);
    System.out.println("input your equation:");
    String equation = ask.nextLine();

    String operand1 = equation.substring(0,equation.indexOf(" "));
    String operand2 = equation.substring(equation.lastIndexOf(" ")+1);

    System.out.println(operand1);
    System.out.println(operand2);

    System.out.println(findNum(operand1));
    System.out.println(findNum(operand2));

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
    if(operand.indexOf("_") != -1){
        return Integer.parseInt(operand.substring(operand.indexOf("/")+1));
      }
    }

    
    public static int findWhole(String operand){
      return Integer.parseInt(operand.substring(0, operand.indexOf("_")));

    }

}
