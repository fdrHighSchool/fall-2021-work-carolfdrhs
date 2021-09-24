public class Rocketship{

  public static void main(String[] args){

    ship("triangle");
    ship("middle");
    ship("middle");
    ship("middle");

  }//end main

  public static void ship(String place, String text) {
    if (place.equals("middle")) {
      System.out.println(" +------+");
      System.out.println(" |      |");
      System.out.println(" |      |");
    
    }
    if (place.equals("triangle")) {
      System.out.println("   /  \\  ");
      System.out.println("  /    \\ ");
      System.out.println(" /      \\ ");
    }

  }


}//end class
/*
PLAN
function for the top and bottom triangles
another function for the lines on the top and bottom

LOOK at it horizontally not vertically
*/
