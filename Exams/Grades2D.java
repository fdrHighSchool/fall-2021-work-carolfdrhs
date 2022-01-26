import java.util.*;

public class Grades2D{
  public static void main(String[] args){
    int[][] studentGrades = new int[15][5];


    for(int i = 0; i<studentGrades.length; i++){
      for(int j = 0; j<studentGrades[i].length;j++){
        studentGrades[i][j] =(int)(Math.random() * 46) + 55;
      }
    }
    System.out.println(Arrays.deepToString(studentGrades));
  }


}
