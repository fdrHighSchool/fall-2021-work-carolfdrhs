import java.util.*;

public class selfdivisor{
  public static void main(String[] args){
    System.out.println(Arrays.toString(firstNumSelfDivisors(10,3)));

  }


  public static boolean isSelfDivisor(int num){
    int mod = 0;
    int div = num;
    while(div>0){
      mod = div%10;
      if(mod == 0){
        return false;
      }
      if(div%mod != 0){
        return false;
      }
      div /= 10;
    }
    return true;
  }
  public static int[] firstNumSelfDivisors(int start,int num){
    int count = 0;
    int[] selfDivisors = new int[num];
    for(int i = start;count < num ;i++){
      if(isSelfDivisor(i)){
        selfDivisors[count] = i;
        count++;
      }

    }
    return selfDivisors;
  }
}
