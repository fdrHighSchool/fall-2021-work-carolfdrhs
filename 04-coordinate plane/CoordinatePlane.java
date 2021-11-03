import java.util.*;

//2 methods: crowdistance (take 2 points and calculate) and cartesian(taxi cab) distance(|y2-y1|+|x2-x1|)

public class CoordinatePlane {

  public static void main(String[] args){
    Scanner ask = new Scanner(System.in);
    System.out.println("Which of the following do you want?");
    System.out.print("1.Distance \n2.Area calculator");

    int choice = ask.nextInt();
    if (choice == 1){
      distance();
    }
    else{
      area();
    }


  }//end main
  public static void area(){
    Scanner ask = new Scanner(System.in);
    System.out.println("What shape do you want to know the area of?");
    System.out.print("1.Square\n");
    int choice = ask.nextInt();
    if (choice == 1){
      square();
    }
  }//end area method
  public static void square(){
    Scanner ask = new Scanner(System.in);
    for(i = 1; i<5, i++){
      
    }



  }









  public static void distance(){
    Scanner ask = new Scanner(System.in);
    //ask for the coordinate
    System.out.println("first point?");
    String point1 = ask.nextLine();
    int x1 =findX(point1);
    int y1 =findY(point1);


    System.out.println("second point?");
    String point2 = ask.nextLine();
    int x2 = findX(point2);
    int y2 = findY(point2);

    cabDist(x1,y1,x2,y2);
    crowDist(x1,y1,x2,y2);
  }

  public static void cabDist(int x1, int y1, int x2, int y2){
    int cabDist = Math.abs(y2-y1) + Math.abs(x2-x1);
    System.out.println("This is the cab distance: " + cabDist);

  }
  public static void crowDist(int x1, int y1, int x2, int y2){
    double crowDist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    System.out.println("This is the crow distance: " + crowDist);
  }

/*
Name:findX
Purpose:get the value of x from the string coordinate
Input:the coordinate
Return:x value
*/

  public static int findX(String point){
    //get the x and y values
    String x = point.substring(1,point.indexOf(","));
    //System.out.println(x);

    //convert String to int  Integer.parseInt();
    int x1 = Integer.parseInt(x.trim());
    //System.out.println(x1);

    //return x value
    return(x1);
  }//end findX

/*
Name:findY
Purpose:get the value of y from the string coordinate
Input:the coordinate
Return:y value
*/


  public static int findY(String point){
    //get the x and y values
    String y = point.substring(point.indexOf(",")+1,point.length()-1);
    //System.out.println(y);

    //convert String to int  Integer.parseInt();
    int y1 = Integer.parseInt(y.trim());
    //System.out.println(y1);

    //return y value
    return(y1);


  }//end findY




}//end class
