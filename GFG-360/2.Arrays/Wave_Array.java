/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/wave-array-1587115621/1
 */

public class Wave_Array{

    public static void f(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i+= 2){
           swap(arr, i, i + 1);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];

        arr[i] = arr[j];

        arr[j] = temp;
    }

    public static void print(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};

        f(arr);

        print(arr);
    }
}