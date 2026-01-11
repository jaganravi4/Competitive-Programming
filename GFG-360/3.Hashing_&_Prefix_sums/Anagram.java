/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/anagram-1587115620/1
 */

import java.util.*;

public class Anagram{

    public static boolean f(String s1, String s2){

        int n = s1.length();

        int m = s2.length();

        // edge case
        if(n != m){
            return false;
        }

        int[] map = new int[26];

        for(int i = 0; i < n; i++){
            int x = s1.charAt(i) - 'a';

            int y = s2.charAt(i) - 'a';

            map[x]++;

            map[y]--;
        }

        for(int i = 0; i < 26; i++){
            
            if(map[i] != 0){
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args){
        String s1 = "geeks";

        String s2 = "kseeg";

        boolean res = f(s1, s2);

        System.out.println(res);
    }
}