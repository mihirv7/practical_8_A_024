import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter symbol: ");
        String symbol = sc.next();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}