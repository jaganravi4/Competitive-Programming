/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/multiply-2-matrices4144/1
 */

import java.util.*;

public class Multiply_Two_Matrices{

    public static List<List<Integer>> f(int[][] arr, int[][] brr){

        int n = arr.length;

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < n; i++){

            List<Integer> row = new ArrayList<>();

            for(int j = 0; j < n; j++){
                int sum = multiply(arr, brr, n, i, j);
                row.add(sum);
            }

            res.add(new ArrayList<>(row));
        }

        return res;
    }

    public static int multiply(int[][] arr, int[][] brr, int n, int row, int col){
        int sum = 0;

        for(int i = 0; i < n; i++){

            int a = arr[row][i];

            int b = brr[i][col];

            sum += (a * b);
        }
        return sum;
    }

    public static void main(String[] args){

        int[][] arr = { {1, 2}, {3, 4} };

        int[][] brr = { {4, 3}, {2, 1} };

        List<List<Integer>> res = f(arr, brr);

        System.out.println(res);
    }
}