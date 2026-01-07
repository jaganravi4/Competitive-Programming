/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
 */

import java.math.*;

public class Kadanes_Algorithm{

    public static int f_brute(int[] arr){
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            
            int sum = 0;

            for(int j = i; j < n; j++){
                sum += arr[j];

                maxSum = Math.max(sum, maxSum);
            }
        }

        return maxSum;
    }

    public static int f_optimal(int[] arr){
        
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;
        
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum = Math.max(sum + arr[i], arr[i]);

            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args){
        
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        // int res = f_brute(arr);

        int res = f_optimal(arr);

        System.out.println(res);
    }
}