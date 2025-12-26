/**
 *  Problem link -> https://www.geeksforgeeks.org/problems/majority-element-1587115620/1
 */

public class Majority_Element{

    public static int f_brute(int[] arr){
        int n = arr.length;

        int[] map = new int[100001];

        for(int i = 0; i < n; i++){
            map[arr[i]]++;
        }

        int res = -1;

        for(int i = 1; i < map.length; i++){
            if(map[i] > (n / 2)){
                res = i;
                break;
            }
        }

        return res;
    }

    public static int f_optimal(int[] arr){
        int n = arr.length;

        int count = 1;
        
        int elt = arr[0]; // Assume arr[0] as majority element

        for(int i = 1; i < n; i++){
            if(count == 0){
                elt = arr[i];
                count = 1;
            }else if (arr[i] == elt){
                count++;
            }else{
                count--;
            }
        }

        count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == elt){
                count++;
            }
        }

        return count > (n / 2) ? elt : -1;
    }

    public static void main(String[] args){

        int[] arr = {1, 1, 2, 1, 3, 5, 1};

        // int res = f_brute(arr);

        int res = f_optimal(arr);

        System.out.println(res);
    }
}