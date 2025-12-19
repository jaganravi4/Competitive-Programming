/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
 */

public class Sum_Of_Digits{

    public static int f(int n){
        int sum = 0;

        while(n > 0){
            int lastDigit = n % 10;

            sum += lastDigit;

            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args){
        int n = 678;

        int sum = f(n);

        System.out.println(sum);
    }
}