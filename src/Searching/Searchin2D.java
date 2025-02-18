package Searching;

public class Searchin2D {
    public static void main(String[] args) {

        int[][] arr = { {75, 85, 95, 105},
                        {88, 78, 68},
                        {33, 43, 53, 63, 73},
                        {22, 12},
        };

        int target = 22;
        int[] ans = Search(arr, target);
//        System.out.println(Arrays.toString(ans)); // finding index of the number

        System.out.println(max(arr)); // finding maximum no.
    }

    // returning maximum number in a 2D array
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    // searching number in a 2D array
     static int[] Search(int[][] arr, int target) {

         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if(arr[row][col] == target){
                     return new int[]{row, col};
                 }
             }
         }
         return new int[]{-1, -1};
    }
}
