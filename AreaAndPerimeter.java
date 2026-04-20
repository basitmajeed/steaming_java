import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(
                "MAIN MENU\n1. Area of Circle \n2. Permieter of Circle \n3. Area of Rectangle \n4. Permiter of Reactangle \nEnter your choice: ");
        int choice = s.nextInt();
        if (choice == 1 || choice == 2) {
            System.out.print("\nEnter radius of circle: ");
            float r = s.nextFloat();
            if (choice == 1) {
                float result = 3.14f * r * r;
                System.out.println("Area of Circle is: " + result);
            } else {
                float result = 2 * 3.14f * r;
                System.out.println("Permiter of Circle is: " + result);
            }
        } else {
            System.out.print("\nEnter length of rectangle: ");
            float l = s.nextFloat();
            System.out.print("Enter breadth of rectangle: ");
            float b = s.nextFloat();
            if (choice == 3) {
                float result = l * b;
                System.out.println("Area of Rectangle is: " + result);
            } else {
                float result = 2 * (l + b);
                System.out.println("Permiter of Rectangle is: " + result);
            }
        }
        s.close();
    }
}