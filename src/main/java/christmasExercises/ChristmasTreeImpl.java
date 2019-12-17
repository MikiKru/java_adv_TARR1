package christmasExercises;

public class ChristmasTreeImpl implements ChristmasTree {


    @Override
    public void drawChristmasTree(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                if (j <= (n - i)) {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= (2 * n - 1); k++) {
                if (i==1 && k==1) {
                    System.out.print("^");
                }
                else if (k <= (2 * i - 1)) {
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i == n) {
                for (int l = 1; l < (2 * i - 1); l++) {
                    if (l <= (2*n - 1)/2) {
                        System.out.print(" ");
                    }
                }
                System.out.println("H");
            }
        }

    }

    public static void main(String[] args) {
        new ChristmasTreeImpl().drawChristmasTree(10);
    }
}