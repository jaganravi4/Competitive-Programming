/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
 */

public class GCD{

    public static int f(int a, int b){
        if(a < b){
            return f(b, a);
        }

        if(a % b == 0){
            return b;
        }

        while(b > 0){
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    public static int f_Rec(int a, int b){
        if(a < b){
            return f_Rec(b, a);
        }

        if(a % b == 0){
            return b;
        }

        return f_Rec(b, a % b);
    }

    public static void main(String[] args){
        int a = 20, b = 28;

        // int res = f(a, b);

        int res = f_Rec(a, b);

        System.out.println(res);
    }
}