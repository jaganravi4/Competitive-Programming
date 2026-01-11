/**
 *  Problem link -> https://codeforces.com/problemset/problem/1900/A
 */

import java.util.*;

public class A_Cover_in_Water{

    public static int f(String s, int n){

        int res = 0;

        int maxLen = 0;

        int len = 0;

        for(int i = 0; i < n; i++){
            
            char c = s.charAt(i);

            len = (c == '.' ? len + 1 : 0);

            res = (c == '.' ? res + 1 : res);

            maxLen = Math.max(len, maxLen);
        }

        if(maxLen > 2){
            res = 2;
        }

        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            String s = sc.next();

            int res = f(s, n);

            System.out.println(res);
        }

        sc.close();
    }
}