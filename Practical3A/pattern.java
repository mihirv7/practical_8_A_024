public class pattern {
    public static void main(String[] args) {

        int rows = 5;

        // upper pyramid
        for (int i = 1; i <= rows; i++) {

            // spaces
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower pyramid
        for (int i = rows - 1; i >= 1; i--) {

            // spaces
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}