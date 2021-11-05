import java.util.*;

//2 methods: crowdistance (take 2 points and calculate) and cartesian(taxi cab) distance(|y2-y1|+|x2-x1|)

public class CoordinatePlane {

  public static void main(String[] args){
    Scanner ask = new Scanner(System.in);
    System.out.println("Which of the following do you want?");
    System.out.print("1.Distance \n2.Area calculator\n");

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
  public static void drawSquare(int d){
    for (int row = 0; row < d; row++){
      for(int col = 0; col <d; col++){
        System.out.println("*  ");
      }//end of row
      System.out.println();
    }//end of square
  }


  /*
  -check that all sides are equal
    distance()
  -check for right angles
    slope()
  */
  public static void square(){
    Scanner ask = new Scanner(System.in);

        System.out.println("Please go in clockwise order");
        System.out.print("Enter the first point: ");

        // get points and parse out x and y
        // point 1
        String point1 = ask.nextLine();
        int x1 = findX(point1);
        int y1 = findY(point1);

        // point 2
        System.out.print("Enter the second point: ");
        String point2 = ask.nextLine();
        int x2 = findX(point2);
        int y2 = findY(point2);

        // point 3
        System.out.print("Enter the third point: ");
        String point3 = ask.nextLine();
        int x3 = findX(point3);
        int y3 = findY(point3);

        // point 4
        System.out.print("Enter the fourth point: ");
        String point4 = ask.nextLine();
        int x4 = findX(point4);
        int y4 = findY(point4);

        // calculate 4 distances
        double distance1 = crowDist(x1, y1, x2, y2);
        double distance2 = crowDist(x2, y2, x3, y3);
        double distance3 = crowDist(x3, y3, x4, y4);
        double distance4 = crowDist(x4, y4, x1, y1);

        // test if all sides are congruent
        if (distance1 == distance2 && distance2 == distance3 && distance3 == distance4) {
          System.out.println("Passes distance test");
          double slope1 = slope(x1,y1,x2,y2);
          double slope2 = slope(x2,y2,x3,y3);
          if ((slope1 * slope2 == -1) || (slope1 == Integer.MAX_VALUE && slope2 == 0) || (slope1 == 0 && slope2 == Integer.MAX_VALUE)){
            System.out.println("is a square");
            //drawSquare((int)distance1);
          }
        } // end if statement
        else {
          System.out.println("Fails distance test");
        }




  }

/*
Name: Slope
Purpose:find the slope between 2 points
Input: 2 points
Return: double

*/

public static double slope(double x1, double y1, double x2, double y2){
  if(x1 != x2){
    return (y2-y1)/(x2-x1);
  }
    return Integer.MAX_VALUE;
  }//end slope







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

    System.out.println("the crow distance is: " + crowDist(x1,y1,x2,y2));
    System.out.println("the cab distance is: " + cabDist(x1,y1,x2,y2));

    System.out.println(slope(x1,y1,x2,y2));
  }//end distance


  public static int cabDist(int x1, int y1, int x2, int y2){
    int cabDist = Math.abs(y2-y1) + Math.abs(x2-x1);
    return cabDist;

  }//end cabDist


  public static double crowDist(int x1, int y1, int x2, int y2){
    double crowDist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    return crowDist;
  }//end crowDist

/*
Name:findX
Purpose:get the value of x from the string coordinate
Input:the coordinate
Return:x value as an int
*/

  public static int findX(String point){
    //get the x and y values
    String x = point.substring(1,point.indexOf(","));

    //convert String to int  Integer.parseInt();
    int x1 = Integer.parseInt(x.trim());

    //return x value
    return x1;
  }//end findX



  public static int findY(String point){
    //get the x and y values
    String y = point.substring(point.indexOf(",")+1,point.length()-1);

    //convert String to int  Integer.parseInt();
    int y1 = Integer.parseInt(y.trim());

    //return y value
    return y1;


  }//end findY




}//end class
