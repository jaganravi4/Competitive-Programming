/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/frequency-of-elements--111353/1
 */

import java.util.*;

public class Frequency_Of_Elements{

    public static List<List<Integer>> f(int[] arr){
        
        int n = arr.length;

        List<List<Integer>> res = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }
        
        map.forEach((key, value) -> {
            List<Integer> pair = new ArrayList<>();

            pair.add(key);

            pair.add(value);

            res.add(pair);
        });

        return res;
    }

    public static void main(String[] args){

        int[] arr = {1, 2, 2, 3, 3, 5};

        List<List<Integer>> res = f(arr);

        System.out.println(res);
    }
}