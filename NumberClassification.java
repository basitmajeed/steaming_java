import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is Positive");
        } else if (num < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }

        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

        if (num % 5 == 0) {
            System.out.println("The number is a Multiple of 5");
        } else {
            System.out.println("The number is NOT a Multiple of 5");
        }

        int absNum = Math.abs(num);
        if (absNum >= 100 && absNum <= 999) {
            System.out.println("The number is a Three-digit number");
        } else {
            System.out.println("The number is NOT a Three-digit number");
        }

        sc.close();
    }
}