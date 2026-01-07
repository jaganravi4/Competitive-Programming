/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/key-pair5616/1
 */

import java.util.*;

public class Two_Sum{

    public static boolean f_brute(int[] arr, int target){
        
        int n = arr.length;

        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){

                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean f_better(int[] arr, int target){
        int n = arr.length;

        Arrays.sort(arr);

        int low = 0;

        int high = n - 1;

        while(low < high){
            int sum = arr[low] + arr[high];

            if(sum == target){
                return true;
            }else if(sum > target){
                high--;
            }else{
                low++;
            }
        }

        return false;
    }

    public static void main(String[] args){
        int[] arr = {0, -1, 2, -3, 1};

        int target = -2;

        // boolean res = f_brute(arr, target);

        boolean res = f_better(arr, target);

        System.out.println(res);
    }
}