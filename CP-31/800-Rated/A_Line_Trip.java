/**
 *  Problem link -> https://codeforces.com/problemset/problem/1901/A
 */

import java.util.*;

public class A_Line_Trip{

    public static int f(int[] arr, int n, int x){
        
        int min_fuel = arr[0];

        for(int i = 1; i < n; i++){
            int fuel = arr[i] - arr[i - 1];

            if(fuel > min_fuel){
                min_fuel = fuel;
            }
        }

        int fuel = (x - arr[n - 1]) * 2;

        if(fuel > min_fuel){
            min_fuel = fuel;
        }

        return min_fuel;
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int x = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int res = f(arr, n, x);

            System.out.println(res);
        }

        sc.close();
    }
}