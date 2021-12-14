import java.util.*;

public class CentralMeasure{
  public static void main(String[] args){
    //make list of random values
    int[] randomArray = new int[10];
    for(int i = 0; i < randomArray.length; i++) {
      int value = (int)((Math.random() * 10) + 1);
      randomArray[i] = value;
    }

    //print list check
    System.out.println(Arrays.toString(randomArray));

    //find the max value of the list (check the randomArray list)
    int max = 0;
    for(int i = 0; i < randomArray.length; i++){
      if(max<randomArray[i]){
        max = randomArray[i];
      }
    }

    //make an array of that size (fill all values with 0)
    int[] frequency = new int[max];
    for(int i = 0; i< frequency.length; i++){
      frequency[i] = 0;
    }
    System.out.println(Arrays.toString(frequency));

    //tally the frequency of occurance of each unique number
    for(int i = 0; i < randomArray.length; i++){
       frequency[randomArray[i]-1] += 1;
    }
    System.out.println(Arrays.toString(frequency));

    int max2 = 0;
    int place = 0;

    //find which has the largest frequency
    for(int i = 0; i < frequency.length; i++){
      if(max2 < frequency[i]){
        max2 = frequency[i];
        place = i;
      }
      //what about if they have the same frequency?

    }
    System.out.println(place+1);





  }//end main
}//end class
