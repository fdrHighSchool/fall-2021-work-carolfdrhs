import java.util.*;

public class calc{
  public static void main(String[] args){
    //ask user input
    Scanner ask = new Scanner(System.in);
    System.out.println("input your equation:");
    String equation = ask.nextLine();


    //split the different operands and operator
    String operand1 = equation.substring(0,equation.indexOf(" "));
    String operand2 = equation.substring(equation.lastIndexOf(" ")+1);
    String operator = equation.substring(equation.indexOf(" ")+1, equation.lastIndexOf(" "));

    //call method that evaluates answer
    produceAnswer(operand1,operand2,operator);


  }//end main method


  public static int findNum(String operand){
    if (operand.indexOf("_")!= -1){//if there is a _ meaning its a mixed number fraction thing
      return Integer.parseInt(operand.substring(operand.indexOf("_")+1,operand.indexOf("/")));//returns the numerator
    }
    else if (operand.indexOf("/") == -1) { //if there is not a / meaning it is a whole number
        return Integer.parseInt(operand); //returns the whole number as the numerator
      }
    else {
      return Integer.parseInt(operand.substring(0,operand.indexOf("/"))); //just a regular fraction so return numerator
    }
  }//end findNum


  public static int findDen(String operand){
    if (operand.indexOf("/") == -1){//if there isnt a slash it means that its a whole number
      return 1;//whole number denominator = 1

    }
    else{//if theres a slash
      return Integer.parseInt(operand.substring(operand.indexOf("/")+1)); //take denominator
    }

  }//end findDen


    public static int findWhole(String operand){
      if (operand.indexOf("_")!= -1){//if there is a _
        return Integer.parseInt(operand.substring(0, operand.indexOf("_"))); //return the whole
    }
      else{
        return 0; //if not return 0
      }
    }//end findWhole

    public static int improperNum(int whole, int num, int den){
       return whole * den + num;//returns numerator of the improper fraction

    }//end improperNum

    public static int simplify(int num, int den, int which){
      for (int i = 1; i<num && i<den; i++){//divides by a factor until the fraction is simplified completely
        if (num%i == 0 && den%i == 0){ //checks for factors
          num = num/i;
          den = den/i;
          //i = 1;
        }
      }
      //to return which value
      if (which == 1){
        return num;
      }
      else{
        return den;
      }
    }//end simplify

    public static void addSub(int num1,int num2,int den1,int den2,String operator){
      int Num = 0;//declare variable
      int commonDen = (den1*den2);
      if (operator.equals("+"))
        Num = (num1*den2)+(num2*den1);
      else{
        Num = (num1*den2)-(num2*den1);
      }


      int newNum = simplify(Num,commonDen,1);
      int newDen = simplify(Num,commonDen,2);

      if (newNum>newDen){//if the numerator > denominator convert to mixed or whole number
        if (newNum % newDen == 0){//if there is no remainder
          System.out.println(newNum/newDen);//convert to whole number
        }
        else{//if there is a remainder
          //convert to mixed number
          int newWhole = (int)newNum/newDen;//the whole
          System.out.println("The answer is: "+newWhole+"_"+newNum%newDen+"/"+newDen);
        }
    }
}//end addSub




    public static void produceAnswer(String operand1, String operand2, String operator){
      //list the values of each operand
      int whole1 = findWhole(operand1);
      int num1 = findNum(operand1);
      int den1 = findDen(operand1);

      int whole2 = findWhole(operand2);
      int num2 = findNum(operand2);
      int den2 = findDen(operand2);


      //convert to improper
      if (whole1 != 0){//if operand1 is a mixed number
        num1 = improperNum(whole1,num1,den1);//convert to improper number
      }
      if (whole2 != 0){//if operand2 is a mixed number
        num2 = improperNum(whole2,num2,den2);
      }

      if (operator.equals("+")){
        addSub(num1,num2,den1,den2,"+");

      }
      if (operator.equals("-")){
        addSub(num1,num2,den1,den2,"-");

      }

      if (operator.equals("*")){
        int multiplyNum = simplify(num1 * num2,den1 * den2,1);
        int multiplyDen = simplify(num1 * num2,den1 * den2,2);
        System.out.println(multiplyNum);
        System.out.println(multiplyDen);

        System.out.println(multiplyNum + "/" + multiplyDen);



      }
      if (operator.equals("/")){
        int divideNum = simplify(num1 * den2,den1*num2,1);
        int divideDen = simplify(num1 * den2,den1*num2,2);
        // System.out.println(divideNum);
        // System.out.println(divideDen);

        System.out.println(divideNum + "/" + divideDen);





      }

    }

}//end class
