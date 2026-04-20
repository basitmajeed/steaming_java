import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        int[] freq = new int[10];

        num = Math.abs(num);

        while (num > 0) {
            int digit = (int) (num % 10);
            freq[digit]++;
            num /= 10;
        }

        System.out.println("Digit frequencies:");

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " → " + freq[i] + (freq[i] > 1 ? " times" : " time"));
            }
        }

        sc.close();
    }
}