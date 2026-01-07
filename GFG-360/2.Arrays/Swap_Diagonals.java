/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/swap-major-and-minor-diagonals-of-a-square-matrix/1
 */

public class Swap_Diagonals{

    public static void f(int[][] mat){
        int n = mat.length;

        int m = mat[0].length;

        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < m; j++){

                if(i == j){
                    swap(mat, i, j, m - j - 1);
                }
            }
        }
    }

    public static void swap(int[][] mat, int i, int j, int k){
        int temp = mat[i][j];

        mat[i][j] = mat[i][k];

        mat[i][k] = temp;
    }

    public static void print(int[][] mat){
        int n = mat.length;

        int m = mat[0].length;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){

                System.out.print(mat[i][j] + " ");
            }

            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        int[][] mat = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        f(mat);

        print(mat);
    }
}