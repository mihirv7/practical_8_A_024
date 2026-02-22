public class EvenNumbers {
    public static void main(String[] args) {

        int sum = 0, count = 0;

        System.out.println("Even numbers from 1 to 50:");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }

        System.out.println("\n\nThree minimum even numbers: 2 4 6");
        System.out.println("Three maximum even numbers: 44 46 48");

        double avg = (double) sum / count;
        System.out.println("Average of even numbers: " + avg);
    }
}