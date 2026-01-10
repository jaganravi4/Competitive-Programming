/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/intersection-of-two-arrays-with-duplicate-elements/1
 */

import java.util.*;

public class Intersection_Of_Arrays_With_Duplicates{

    public static List<Integer> f(int[] a, int[] b){

        int n = a.length;

        int m = b.length;

        int len = 100001; // 0 <= a[i], b[i] <= 10^5

        boolean[] m1 = new boolean[len];

        for(int i = 0; i < n; i++){
            m1[a[i]] = true;
        }

        boolean[] m2 = new boolean[len];

        for(int i = 0; i < m; i++){
            m2[b[i]] = true;
        }

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < len; i++){
            if(m1[i] && m2[i]){
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args){

        int[] a = {1, 2, 1, 3, 1};

        int[] b = {3, 1, 3, 4, 1};

        List<Integer> res = f(a, b);

        System.out.println(res);
    }
}