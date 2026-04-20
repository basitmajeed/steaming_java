import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int num = sc.nextInt();

        if (num < 10 || num > 99) {
            System.out.println("Please enter a valid two-digit number.");
        } else {
            int digit1 = num / 10;
            int digit2 = num % 10;

            int sum = digit1 + digit2;
            int product = digit1 * digit2;

            int result = sum + product;

            System.out.println("Sum of digits = " + sum);
            System.out.println("Product of digits = " + product);
            System.out.println("Sum + Product = " + result);

            if (result == num) {
                System.out.println(num + " is a Special Number.");
            } else {
                System.out.println(num + " is NOT a Special Number.");
            }
        }

        sc.close();
    }
}