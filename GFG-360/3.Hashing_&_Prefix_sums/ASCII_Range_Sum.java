/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/ascii-range-sum/1
 */

import java.util.*;

public class ASCII_Range_Sum{

    public static List<Integer> f(String s){

        int n = s.length();

        int[] first = new int[26];

        int[] last = new int[26];

        for(int i = 0; i < 26; i++){
            first[i] = -1;

            last[i] = -1;
        }

        for(int i = 0; i < n; i++){

            int x = s.charAt(i) -'a';

            if(first[x] == -1){
                first[x] = i;
            }else{
                last[x] = i;
            }
        }

        int[] p = new int[n];

        p[0] = s.charAt(0);

        for(int i = 1; i < n; i++){
            int x = s.charAt(i);

            p[i] = p[i - 1] + x;
        }

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < 26; i++){

            if(first[i] != -1 && last[i] != -1){
                int l = first[i];

                int r = last[i];

                int sum = p[r - 1] - p[l];

                if(sum != 0){
                    res.add(sum);
                }
            }
        }
        return res;
    }

    public static void main(String[] args){

        String s = "abacab";

        List<Integer> res = f(s);

        System.out.println(res);
    }
}