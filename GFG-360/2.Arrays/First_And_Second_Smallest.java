/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1
 */

import java.util.*;

public class First_And_Second_Smallest{

    public static List<Integer> f(int[] arr, int n){

        int smallest = 100001; // 1 <= arr[i] <= 10^5
        
        int sec_smallest = -1;

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < n; i++){
            // check if current element is smaller than smallest
            if(arr[i] < smallest){
                // update second smallest element
                sec_smallest = smallest;

                smallest = arr[i];
            }else if (arr[i] != smallest && arr[i] < sec_smallest){
                sec_smallest = arr[i];
            }
        }

        if(sec_smallest == 100001){
            res.add(-1);
            return res;
        }

        res.add(smallest);

        res.add(sec_smallest);

        return res;
    }

    public static void main(String[] args){

        int[] arr = {1, 1, 1};

        int n = arr.length;

        List<Integer> res = f(arr, n);

        System.out.println(res);
    }
}