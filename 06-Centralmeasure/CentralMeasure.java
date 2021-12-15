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

  }//end main

    public static int mode(int[] arr){
      //find the max value of the list (check the randomArray list)
      int max = findMax(arr);

      //make an array of that size (fill all values with 0)
      int[] frequency = new int[max+1];
      for(int i = 0; i< frequency.length; i++){
        frequency[i] = 0;
      }
      //System.out.println(Arrays.toString(frequency));

      //tally the frequency of occurance of each unique number
      for(int i = 0; i < arr.length; i++){
         frequency[arr[i]1]++;
      }
      //System.out.println(Arrays.toString(frequency));

      //find which has the largest frequency
      //findMax()
      return 0;



    }//end mode



    public static int findMax(int[] arr){
    int max = arr[0];
    int place = 0;
    for(int i = 0; i < arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
        place = i;
      }
      //what about if they have the same frequency?
    }
    System.out.println(max);

    //return(place+1);
    return max;
  }//end findMax






}//end class
