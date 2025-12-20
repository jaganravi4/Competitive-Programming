/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/decimal-to-binary-1587115620/1
 */

import java.util.*;

public class Decimal_To_Binary{

    public static String f(int n, String s){
        if(n == 0){
            return reverse(s);
        }

        return f(n >> 1, s + n % 2);
    }

    public static String reverse(String s){
        
        return new StringBuilder(s).reverse().toString();
    }

    public static String f_optimal(int n){
        StringBuilder sb = new StringBuilder();

        while(n > 0){
            sb.append(n % 2);
            n = n >> 1;
        }

        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args){
        int n = 15;

        // String res = f(n, "");

        String res = f_optimal(n);

        System.out.println(res);
    }
}