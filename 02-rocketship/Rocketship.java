public class Rocketship{

  public static void main(String[] args){

    ship("triangle");
    ship("box");
    System.out.println(" |United| \n |States|");
    ship("box");
    ship("triangle");

  }//end main

  public static void ship(String place) {
    if (place.equals("box")) {
      System.out.println(" +------+ \n |      | \n |      | \n +------+");
    }
    if (place.equals("triangle")) {
      System.out.println("   /  \\ \n  /    \\ \n /      \\  ");
    }

  }


}//end class
