public class Rocketship{

  public static void main(String[] args){

    ship("triangle");
    ship("box");
    System.out.println(" |United|");
    System.out.println(" |States|");
    ship("box");
    ship("triangle");

  }//end main

  public static void ship(String place) {
    if (place.equals("box")) {
      System.out.println(" +------+");
      System.out.println(" |      |");
      System.out.println(" |      |");
      System.out.println(" +------+");

    }
    if (place.equals("triangle")) {
      System.out.println("   /  \\  ");
      System.out.println("  /    \\ ");
      System.out.println(" /      \\ ");
    }

  }


}//end class
