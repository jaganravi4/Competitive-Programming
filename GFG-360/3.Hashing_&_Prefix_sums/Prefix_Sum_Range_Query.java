/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/prefix-sum-range-query/1
 */

import java.util.*;

public class Prefix_Sum_Range_Query{

    public static List<Integer> f(int[] arr, int[][] queries){

        int n = arr.length;

        int[] p = new int[n + 1];

        for(int i = 0; i < n; i++){
            p[i + 1] = p[i] + arr[i];
        }

        List<Integer> res = new ArrayList<>();

        for(int[] range : queries){

            int l = range[0];

            int r = range[1];

            int sum = p[r + 1] - p[l];

            res.add(sum);
        }
        
        return res;
    }

    public static void main(String[] args){

        int[] arr = {2, 4, 6, 8, 10};

        int[][] queries = { {1, 3}, {0, 2} };

        List<Integer> res = f(arr, queries);

        System.out.println(res);
    }
}