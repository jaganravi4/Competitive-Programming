/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/lcm-of-two-numbers/1
 */

public class LCM{

    /**
     *  using formula -> lcm(a, b) * gcd(a, b) = a * b
     *  we need to find lcm(a, b)  => lcm(a, b) = (a * b) / gcd(a, b)
     *     for eg: a = 12, b = 4
     *             a * b = 12 * 4 => 36
     *             gcd(a, b) = 4
     *      => lcm(a, b) = 36 / 4 -> 9
     * 
     *      lcm(a, b) * gcd(a, b) = a * b
     *      -> 9 * 4 = 36 [hence proved]
     */
    public static int f(int a, int b){
        int gcd = findGcd(a, b);

        int res = (a * b) / gcd;

        return res;
    }

    public static int findGcd(int a, int b){
        if(a < b){
            return findGcd(b, a);
        }

        if(a % b == 0){
            return b;
        }

        return findGcd(b, a % b);
    }

    public static void main(String[] args){
        int a = 12;
        int b = 18;

        int res = f(a, b);

        System.out.println(res);
    }
}