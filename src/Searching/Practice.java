package Searching;

public class Practice {

    static int SearchHighInt(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {45, 65, 75, 85, 95, 105, 1000};

        int ans = SearchHighInt(arr);
        System.out.println(ans);

    }
}