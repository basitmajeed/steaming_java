import java.util.Scanner;

public class ReplaceDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        String result = "";

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            if (ch == '0') {
                result += '1';
            } else if (ch == '1') {
                result += '0';
            } else {
                result += ch;
            }
        }

        System.out.println("Output: " + result);

        sc.close();
    }
}