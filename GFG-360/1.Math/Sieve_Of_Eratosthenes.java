/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1
 */

import java.util.*;

public class Sieve_Of_Eratosthenes{

    private static boolean[] sieve;

    public static void createSieve(int n){
        
        // initialize sieve array
        sieve = new boolean[n + 1];

        for(int i = 2; i <= n; i++){
            sieve[i] = true;
        }

        for(int i = 2; i <= n; i++){
            if(sieve[i] == true){
                
                for(int j = i * i; j <= n; j += i){
                    sieve[j] = false;
                }
            }
        }
    }

    public static void main(String[] args){

        int n = 10;
        
        // precompute
        createSieve(n);

        List<Integer> res = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            if(sieve[i]){
                res.add(i);
            }
        }

        System.out.println(res);
    }
}