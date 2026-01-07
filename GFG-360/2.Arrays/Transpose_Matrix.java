/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1
 */

import java.util.*;

public class Transpose_Matrix{

    public static List<List<Integer>> f(int[][] mat){
        int n = mat.length;

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < n; i++){

            List<Integer> row = new ArrayList<>();

            for(int j = 0; j < n; j++){
                row.add(mat[j][i]);
            }

            res.add(new ArrayList<>(row));
        }

        return res;
    }

    public static List<List<Integer>> f_optimal(int[][] mat){

        int n = mat.length;

        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){

                swap(mat, i, j);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
    
        for(int i = 0; i < n; i++){

            List<Integer> row = new ArrayList<>();
            
            for(int j = 0; j < n; j++){

                row.add(mat[i][j]);
            }

            res.add(new ArrayList<>(row));
        }

        return res;
    }

    public static void swap(int[][] mat, int i, int j){

        int temp = mat[i][j];

        mat[i][j] = mat[j][i];

        mat[j][i] = temp;
    }

    public static void main(String[] args){
        int[][] mat = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // List<List<Integer>> res = f(mat);

        List<List<Integer>> res = f_optimal(mat);

        System.out.println(res);
    }
}