package Recursion;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        //System.arraycopy Demo
//        int[] source = {12, 13, 14, 15, 16, 17, 18};
//        int[] destination = new int[7];
//
//        System.arraycopy(source, 0, destination, 0, source.length);
//        System.out.println(Arrays.toString(destination));

//         Arrays.copyOf Demo
//        int[] original = {1, 2, 3, 4, 5, 6};
//        int[] copy = Arrays.copyOf(original, 8);
//        copy[6] = 7;
//        copy[7] = 8;
//        System.out.println(Arrays.toString(copy));

           //Arrays.sort Demo
        int[] random = {10, 9, 2, 3, 4, 5, 1, 0, 8};
        Arrays.sort(random);
        System.out.println(Arrays.toString(random));

    }
}