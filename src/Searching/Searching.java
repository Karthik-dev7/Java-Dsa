package Searching;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {23, 64, 72, 84, 99, -2, 22, 100};
        int target = 72;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

     static int linearSearch(int[] arr, int target) {
// RETURNS -1, IF THE ARRAY WAS EMPTY
        if(arr.length == 0){
            return -1;
        }
// RETURNS THE INDEX POSITION OF THE ARRAY(IF THE TARGET ELEMENT IS FOUND)
         for(int index = 0; index < arr.length; index++) {
             int element = arr[index];
             if(element == target){
                 return index;
             }
         }
// RETURNS MAXIMUM INTEGER VALUE IF THE TARGET NOT FOUND IN THE ARRAY
         return Integer.MAX_VALUE;
    }
}
