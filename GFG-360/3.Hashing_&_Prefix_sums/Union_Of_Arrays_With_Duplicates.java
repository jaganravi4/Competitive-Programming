/** 
 *  Problem link -> https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
 */

import java.util.*;

public class Union_Of_Arrays_With_Duplicates{

    public static List<Integer> f(int[] a, int[] b){

        int n = a.length;

        int m = b.length;

        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < n; i++){

            if(!map.containsKey(a[i])){
                res.add(a[i]);
            }

            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        for(int i = 0; i < m; i++){

            if(!map.containsKey(b[i])){
                res.add(b[i]);
            }

            map.put(b[i], map.getOrDefault(b[i], 0) + 1);
        }

        return res;
    }

    public static void main(String[] args){
        int[] a = {1, 2, 3};

        int[] b = {4, 5, 6};

        List<Integer> res = f(a, b);

        System.out.println(res);
    }
}