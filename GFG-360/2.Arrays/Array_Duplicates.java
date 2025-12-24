/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
 */

import java.util.*;

public class Array_Duplicates{

    public static List<Integer> f(int[] arr){
        int n = arr.length;

        int[] map = new int[n + 1];

        for(int i = 0; i < n; i++){
            map[arr[i]]++;
        }

        List<Integer> res = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(map[i] > 1){
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 1, 2, 3};

        List<Integer> res = f(arr);

        System.out.println(res);
    }
}