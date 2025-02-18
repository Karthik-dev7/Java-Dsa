package BinarySearch;

public class Practice {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 5, 7, 8, 10, 12, 14, 15};
//        int target = 17;
//        int ans = binarySearch(arr, target);
        char[] letters = {'j', 'l', 'm', 'o'};
        char target = 'n';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);

    }
    public static char nextGreatestLetter(char[] letters, char target) {
//        public char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length -1;

            while(start <= end){
                int mid = start+(end-start) / 2;

                if(target < letters[mid]){
                    end  = mid - 1;
                } else if (target > letters[mid]) {
                    start = mid +1;
                }
                else{
                    return target;
                }
            }
            return letters[start % letters.length];
        }

    }


//}
//
//    private static int binarySearch(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length -1;
//
//        while(start <= end){
//            int mid = start+(end-start) / 2;
//
//            if(target < arr[mid]){
//                end  = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid +1;
//            }
//            else return mid;
//        }
//        return start;
//    }
//}