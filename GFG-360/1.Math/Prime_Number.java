/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/prime-number2314/1
 */

public class Prime_Number{

    public static boolean f(int n){
        int count = 0;

        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                count++;

                if((n / i) != i){
                    count++;
                }
            }
        }

        return count == 2;
    }

    public static boolean f_optimal(int n){

        for(int i = 2; i * i <= n; i++){
            
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        int n = 10;

        boolean res = f(n);

        // boolean res = f_optimal(n);

        System.out.println(res);
    }
}