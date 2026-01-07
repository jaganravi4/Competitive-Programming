/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/count-even-letters/1
 */

public class Count_Even_Letters{

    public static int f(String s, int n){

        int[] map = new int[26];

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);

            map[c - 'a']++;
        }

        int count = 0;

        for(int i = 0; i < 26; i++){

            if(map[i] != 0 && map[i] % 2 == 0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){

        String s = "abacaba";

        int n = s.length();

        int res = f(s, n);

        System.out.println(res);
    }
}