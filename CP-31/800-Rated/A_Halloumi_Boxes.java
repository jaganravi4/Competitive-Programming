/**
 *  Problem link -> https://codeforces.com/problemset/problem/1903/A
 */

import java.util.*;

public class A_Halloumi_Boxes{

    public static boolean f(int[] arr, int n, int k){
        if(k > 1){
            return true;
        }

        // check if the array is sorted
        boolean flag = true;
        for(int i = 1; i < n; i++){
            if(arr[i - 1] > arr[i]){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int k = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            boolean res = f(arr, n, k);

            System.out.println(res ? "YES" : "NO");
        }

        sc.close();
    }
}