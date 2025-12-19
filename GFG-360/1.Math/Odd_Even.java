/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/odd-or-even3618/1
 */

import java.util.*;

public class Odd_Even{

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static boolean isEvenByLastBit(int n){
        return (n & 1) == 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // boolean check = isEven(n);

        boolean check = isEvenByLastBit(n);

        System.out.println(check);

        sc.close();
    }
}