package polymorphism;

import java.util.Arrays;

public class ModifyValue {
    public static void main(String[] args) {
        int[] arr = {34, 56, 75, 86, 100};
        Swap(arr);
//        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

}