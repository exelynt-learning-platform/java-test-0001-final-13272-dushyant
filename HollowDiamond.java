public class HollowDiamond {
    public static void main(String[] args) {
        int n = 5; // The number of rows for the upper half

        // Upper half of the diamond (including the middle row)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print the first star
            System.out.print("*");

            // Print inner spaces and the second star (if not the first row)
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print the first star
            System.out.print("*");

            // Print inner spaces and the second star (if not the last row)
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}