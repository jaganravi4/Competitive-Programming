/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/sum-of-series2811/1
 */

import java.util.*;

public class Sum_Of_Natural_Numbers{

    public static int findSum(int n){
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        
        return sum;
    }

    public static int findSumOptimal(int n){
        int sum = (n * (n + 1)) / 2;
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // int res = findSum(n);

        int res = findSumOptimal(n);

        System.out.println(res);
    }
}