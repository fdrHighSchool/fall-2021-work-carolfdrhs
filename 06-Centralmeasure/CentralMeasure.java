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

    System.out.println(range(randomArray));

  }//end main

  public static int mode(int[] arr){
    //find the max value of the list (check the randomArray list)
    int max = findMax(arr);

    //make an array of that size (fill all values with 0)
    int[] frequency = new int[max+1];

    //System.out.println(Arrays.toString(frequency));

    //tally the frequency of occurance of each unique number
    for(int i = 0; i < arr.length; i++){
       frequency[arr[i]]++;
    }
    //System.out.println(Arrays.toString(frequency));

    //find which has the largest frequency
    //findMax()
    return 0;



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
    return findMax(arr)-findMin(arr);



  }


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
  //System.out.println(max);

  //return(place+1); //index return
  return max;
}//end findMax


public static int findMin(int[] arr){
int min = arr[0];
int place = 0;
for(int i = 0; i < arr.length; i++){
  if(min > arr[i]){
    min = arr[i];
    place = i;
  }
  //what about if they have the same frequency?
}
//System.out.println(min);

//return(place+1); //index return
return min;
}//end findMin






}//end class
