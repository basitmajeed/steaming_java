import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        int x, y, diff = 0;
        System.out.print("Enter two numbers: \n");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        diff = x - y;
        System.out.print("Difference of " + x + " and " + y + " is: " + diff);
        s.close();
    }
}
