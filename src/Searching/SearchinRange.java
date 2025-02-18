package Searching;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {35, 1, 65, 7, 88, 90};
        int target = 35;
        int ans = SearchRange(arr, target, 2, 5);
        System.out.println(ans);
    }

     static int  SearchRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }

            for (int index = start; index <= end; index++) {
                int element = arr[index];
                if(element == target){
                    return index;
                }
            }

        return Integer.MAX_VALUE;
    }
}
