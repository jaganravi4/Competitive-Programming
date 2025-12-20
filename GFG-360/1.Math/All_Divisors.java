/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/all-divisors/1
 */

import java.util.*;

public class All_Divisors{

    public static List<Integer> f(int n){

        List<Integer> res = new ArrayList<>();

        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                res.add(i);

                if((n / i) != i){
                    res.add((n / i));
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int n = 100;

        List<Integer> res = f(n);

        System.out.println(res);
    }
}