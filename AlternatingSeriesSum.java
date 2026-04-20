import java.util.Scanner;

public class AlternatingSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms (N): ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }

        System.out.println("Final Sum = " + sum);

        sc.close();
    }
}