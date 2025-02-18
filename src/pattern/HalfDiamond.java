package pattern;

public class HalfDiamond {
    public static void main(String[] args) {
        diamondPattern(5);
    }

    private static void diamondPattern(int i) {
        for (int row = 0; row < 2 * i; row++) {
            int c = row > i ? 2 * i-row : row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
