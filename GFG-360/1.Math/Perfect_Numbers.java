/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/perfect-numbers3207/1
 */

public class Perfect_Numbers{

    public static boolean f(int n){
        int sum = sumOfDivisors(n);

        return sum == n;
    }

    public static int sumOfDivisors(int n){
        int sum = 1;

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                sum += i;

                if((n / i) != i){
                    sum += (n / i);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int n = 6;

        boolean res = f(n);

        System.out.println(res);
    }
}