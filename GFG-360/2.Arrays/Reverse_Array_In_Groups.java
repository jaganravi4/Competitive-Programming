/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1
 */

public class Reverse_Array_In_Groups{

    public static void f(int[] arr, int k){
        
        int n = arr.length;

        int i = 0;

        while(i < n){
            if(n - i < k){
                reverse(arr, i, n - 1);
                break;
            }
            reverse(arr, i, i + k - 1);
            i = i + k;
        }
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
        int n = arr.length;

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};

        int k = 3;

        f(arr, k);

        print(arr);
    }
}