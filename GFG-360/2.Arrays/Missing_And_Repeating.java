/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
 */

import java.util.*;

public class Missing_And_Repeating{

    public static List<Integer> f(int[] arr){
        int n = arr.length;

        int[] map = new int[n + 1];

        for(int i = 0; i < n; i++){
            map[arr[i]]++;
        }

        int m = -1;  // missing number
        int r = -1;  // duplicate number

        for(int i = 1; i <= n; i++){
            if(map[i] == 0){
                m = i;
            }

            if(map[i] > 1){
                r = i;
            }
        }

        List<Integer> res = new ArrayList<>();

        res.add(r);

        res.add(m);

        return res;
    }

    public static void main(String[] args){
        int[] arr = {4, 3, 6, 2, 1, 1};

        List<Integer> res = f(arr);

        System.out.println(res);
    }
}