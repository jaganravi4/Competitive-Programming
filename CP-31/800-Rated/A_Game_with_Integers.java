/** 
 *  Problem link -> https://codeforces.com/problemset/problem/1899/A
 */

import java.util.*;

public class A_Game_with_Integers{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            if(n % 3 != 0){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }

        sc.close();
    }
}