/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1
 */

import java.util.*;

public class Isomorphic_Strings{

    public static boolean f(String s1, String s2){

        int n = s1.length();

        int[] m1 = new int[26];

        int[] m2 = new int[26];

        for(int i = 0; i < 26; i++){
            m1[i] = -1;

            m2[i] = -1;
        }

        for(int i = 0; i < n; i++){
            
            int x = s1.charAt(i) - 'a';

            int y = s2.charAt(i) - 'a';

            if(m1[x] != -1 || m2[y] != -1){

                if(m1[x] != y || m2[y] != x){
                    return false;
                }
            }

            m1[x] = y;

            m2[y] = x;
        }

        return true;
    }

    public static void main(String[] args){

        String s1 = "aab";

        String s2 = "xyz";

        boolean res = f(s1, s2);

        System.out.println(res);
    }
}