package dpWorld;

//{2,1,5,7,3,4,0,6,-1,8} => sum should be 5

import java.util.HashSet;
import java.util.Set;

public class SumOfArrays {

    public static void sum(int[] arr , int sum){
        Set<Integer> set = new HashSet<>();
        int temp;
        for(int i:arr){
            temp = sum -i;
            if(set.contains(temp)){
                System.out.println("sum of pair is "+i+" and "+temp);
            }
            set.add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,7,3,4,0,6,-1,8};
        int sum = 5;
        sum(arr,sum);
    }
}
