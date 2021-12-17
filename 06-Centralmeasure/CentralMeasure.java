import java.util.*;
import java.io.*;

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
    int max = findMax(randomArray,1);
    //make an array of that size (fill all values with 0)
    int[] frequency = new int[max+1];


    //tally the frequency of occurance of each unique number
    for(int i = 0; i < randomArray.length; i++){
       frequency[randomArray[i]]++;
    }
    System.out.println(Arrays.toString(frequency));

    // System.out.println("The range is: " + range(randomArray));
    // System.out.println("The mode is: " + mode(frequency));
    // System.out.println("The mean is: " + average(randomArray));
    System.out.println(median(frequency,max));

  }//end main


  public static int median(int[] arr, int max){
    int [] sort = new int[max];
    for(int j = 0; j<arr.length; j++){
      //go through the list
      for(int i = 1; i < arr[i]+1; i++){
        //add the index based on the number
        sort[i-1] = frequency[i]; //?

      }
    }
    return 0;
  }

  public static int mode(int[] arr){


    //find which has the largest frequency


    //if findMax == 1 return no mode
    if (findMax(arr,2) == 1){
      return 0;
    }
    else{
      return findMax(arr,2);
    }





    }//end mode
  public static double average(int[] arr) {
   // declare accumulator variable
   double total = 0.0;

   // add up all of the data
   for(int i = 0; i < arr.length; i++) {
     total += arr[i];
   }

   // divide total by number of data values
   return total / arr.length;
  } // end average method


  public static int range(int[] arr){
    //find the max and min; subtract
    return findMax(arr,1)-findMin(arr);

  }//end range


  public static int findMax(int[] arr,int choice){
  int max = arr[0];
  int place = 0;
  for(int i = 0; i < arr.length; i++){
    if(max < arr[i]){
      max = arr[i];
      place = i;
    }
  }
  //System.out.println(max);
  if (choice == 2){
    return(place); //index return
  }
  else{
    return max;
  }
}//end findMax


  public static int findMin(int[] arr){
  int min = arr[0];
  int place = 0;
  for(int i = 0; i < arr.length; i++){
    if(min > arr[i]){
      min = arr[i];
      place = i;
    }

  }
  //System.out.println(min);

  //return(place+1); //index return
  return min;
  }//end findMin


/*
MEDIAN
if theres an odd length there is only one number
if theres an even length there are 2 numbers so find the average
*/



}//end class
