/** 
 *  Problem link -> https://www.geeksforgeeks.org/problems/most-frequent-element-in-an-array/1
 */

import java.util.*;

public class Most_Frequent_Element_In_An_Array{

    public static int f(int[] arr, int n){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxCount = 0;

        for(int x : map.values()){
            if(x > maxCount){
                maxCount = x;
            }
        }

        int res = Integer.MIN_VALUE;

        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() == maxCount){
                res = Math.max(res, e.getKey());
            }
        }

        return res;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 2, 2, 3, 4};

        int n = arr.length;

        int res = f(arr, n);

        System.out.println(res);
    }
}