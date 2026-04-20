import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms (N): ");
        int n = sc.nextInt();

        int term = 2;

        System.out.print("Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(term);

            if (i < n) {
                System.out.print(", ");
            }

            if (i % 2 == 1) {
                term = term * 3;
            } else {
                term = term + 1;
            }
        }

        System.out.println();
        sc.close();
    }
}