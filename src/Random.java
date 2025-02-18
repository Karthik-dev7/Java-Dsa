import java.util.Arrays;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[5][3];

        // Input values into the array
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }

        // Output the array contents
        for (int row = 0; row < 5; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        scanner.close();
    }
}
