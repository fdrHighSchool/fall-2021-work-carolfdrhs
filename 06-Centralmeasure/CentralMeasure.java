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

    System.out.println("The range is: " + range(randomArray));
    System.out.println("The mode is: " + mode(randomArray));
    System.out.println("The mean is: " + average(randomArray));
    System.out.println("The median is: "+ median(randomArray));


  }//end main


  public static double median(int[] arr){

    for(int j = 0; j<arr.length; j++){
      int min = arr[j];
      int minIndex = j;
      int temp = arr[j];
      for(int i = j + 1; i < arr.length; i++){
        if(arr[i] < min) {
         min = arr[i];
         minIndex = i;
        }
      }
      arr[j] = min;
      arr[minIndex] = temp;
    }
    // System.out.println(Arrays.toString(arr));
    if (arr.length % 2 == 0){
      return (double)(arr[arr.length/2] + arr[arr.length/2-1]) / 2;
    }
    else{
      return arr[arr.length/2];
    }

}//end median

  public static int mode(int[] arr){
    //find the max value of the list (check the randomArray list)
    int max = findMax(arr,1);
    //make an array of that size (fill all values with 0)
    int[] frequency = new int[max+1];


    //tally the frequency of occurance of each unique number
    for(int i = 0; i < arr.length; i++){
       frequency[arr[i]]++;
    }
    // System.out.println(Arrays.toString(frequency));


    //find which has the largest frequency

    //if findMax == 1 return no mode
    if (findMax(frequency,2) == 1){
      return 0;
    }
    else{
      return findMax(frequency,2);
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
    return findMax(arr,1)-findMin(arr,1);

  }//end range


  public static int findMax(int[] arr,int place){
  int max = arr[0];
  int index = 0;
  for(int i = 0; i < arr.length; i++){
    if(max < arr[i]){
      max = arr[i];
      index = i;
    }
  }
  //System.out.println(max);
  if (place == 2){
    return(index); //index return
  }
  else{
    return max;
  }
}//end findMax


  public static int findMin(int[] arr,int place){
  int min = arr[0];
  int index = 0;
  for(int i = 0; i < arr.length; i++){
    if(min > arr[i]){
      min = arr[i];
      index = i;
    }

  }
  //System.out.println(min);
  if (place == 2){
    return(index); //index return
  }
  else{
    return min;
  }

  }//end findMin


/*
MEDIAN
if theres an odd length there is only one number
if theres an even length there are 2 numbers so find the average
*/



}//end class
