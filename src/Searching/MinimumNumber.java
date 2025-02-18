package Searching;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {35, 1, 65, 7, 88, 90, -2, 0, 100};
        int ans =  SearchMinimum(arr);
        System.out.println(ans);
    }

     static int SearchMinimum(int[] arr) {
        int min = arr[0];

         for (int i = 0; i < arr.length; i++) {
             if(arr[i] < min){
                min =  arr[i];
             }
         }
         return min;
    }
}
