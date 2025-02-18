package BinarySearch;

public class RotatedBS {
    public static void main(String[] args) {

    }
    static int search (int[] nums, int target){
        int pivot = findPivot(nums);

        //if you can't able to find pivot, the array is not rotated
        if(pivot == -1){
            //just apply normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        //if pivot is found, you have two ascending sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

//This will not in duplicate values
     static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start+(end-start)/2;
            //4 cases
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    static int findPivotwithDupilcate(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start+(end-start)/2;
            //4 cases
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            //if the elements in start, middle and end are equal, skip the duplicates
            if(arr[mid] == start && arr[mid] == end){
                //skipping the duplicates
                //NOTE: what if the elements at start and end were pivots ?
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                //check whether the end is pivot
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted, so the pivot lies on right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
