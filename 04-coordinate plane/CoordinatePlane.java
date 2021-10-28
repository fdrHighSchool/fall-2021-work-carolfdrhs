import java.util.*;

//2 methods: crowdistance (take 2 points and calculate) and cartesian(taxi cab) distance(|y2-y1|+|x2-x1|)

public class CoordinatePlane {

  public static void main(String[] args){
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



  }//end main
  public static void cabDist(int x1, int y1, int x2, int y2){
    



  }
  //public static void crowDist(int x, int y, int x2, int y2)

/*
Name:
Purpose:
Input:
Return:


*/
  public static int findX(String point){
    //get the x and y values
    String x = point.substring(1,point.indexOf(","));
    //System.out.println(x);

    //convert String to int  Integer.parseInt();
    int x1 = Integer.parseInt(x);
    //System.out.println(x1);

    //return x value
    return(x1);


  }
  public static int findY(String point){
    //get the x and y values
    String y = point.substring(point.lastIndexOf(",")+1,point.length()-1);
    //System.out.println(y);

    //convert String to int  Integer.parseInt();
    int y1 = Integer.parseInt(y);
    //System.out.println(y1);

    //return y value
    return(y1);


  }




}//end class
