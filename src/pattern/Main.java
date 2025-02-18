package pattern;

public class Main {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int i) {
        for (int row = 1; row <= i; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row+ " ");
            }
            System.out.println();
        }
    }
}
