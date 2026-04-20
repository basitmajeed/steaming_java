import java.util.Scanner;

public class Cartesian {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter X Co-ordinate: ");
        float x = s.nextFloat();
        System.out.print("Enter Y Co-ordinate: ");
        float y = s.nextFloat();

        if (x >= 0) {
            if (y >= 0) {
                System.out.println("The point lies in the FIRST quadrant");
            } else {
                System.out.println("The point lies in the FOURTH quadrant");

            }
        } else {
            if (y >= 0) {
                System.out.println("The point lies in the SECOND quadrant");
            } else {
                System.out.println("The point lies in the THIRD quadrant");

            }
        }
        s.close();
    }
}
