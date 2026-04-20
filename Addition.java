import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int x, y, sum = 0;
        System.out.print("Enter two numbers: \n");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        sum = x + y;
        System.out.print("Sum of " + x + " and " + y + " is: " + sum);
        s.close();
    }
}