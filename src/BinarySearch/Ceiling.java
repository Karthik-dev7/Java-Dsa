package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 8, 9, 11, 12, 13, 14};
        int target = 10;
        int ans = Findceiling(arr, target);
        System.out.println(ans);

    }

    private static int Findceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
               end = mid -1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
