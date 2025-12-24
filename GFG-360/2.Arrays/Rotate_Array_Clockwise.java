/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/rotate-array-clockwise/1
 */

public class Rotate_Array_Clockwise{

    public static void f_brute(int[] arr, int k){
        int n = arr.length;

        k = k % n;

        int d = n - k;

        int[] temp = new int[d];

        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }

        for(int i = d; i < n; i++){
            arr[i - d] = arr[i];
        }

        for(int i = k; i < n; i++){
            arr[i] = temp[i - k];
        }
    }

    public static void f_optimal(int[] arr, int k){
        int n = arr.length;

        k = k % n;

        int d = n - k;

        reverse(arr, 0, d - 1);

        reverse(arr, d, n - 1);

        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int i, int j){

        while(i <= j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr){
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 6};

        int k = 2;

        // f_brute(arr, k);

        f_optimal(arr, k);

        print(arr);
    }
}