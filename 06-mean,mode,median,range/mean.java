
import java.util.*;

public class CentralMeasures {
  public static void main(String[] args) {
    int[] testGrades = {100, 95, 90, 95};

    System.out.println(average(testGrades)); // 95

    // 100 random values in an array
    int[] randomArray = new int[10];

    // loop 100 times
    for(int i = 0; i < 10; i++) {
      // choose a random value
      int value = (int)((Math.random() * 100) + 1);

      // store the value in the array
      randomArray[i] = value;
    }

    System.out.println(Arrays.toString(randomArray));
    System.out.println(average(randomArray));
  }


  public static double average(int[] arr) {
    // declare accumulator variable
    double total = 0.0;

    // add up all of the data
    for(int i = 0; i < arr.length; i++) {
      total += arr[i];
    }

    // divide total by number of data values
    return total / arr.length;
  }
}
