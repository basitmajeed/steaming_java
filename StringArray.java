import java.util.Scanner;
import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        String longest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i].length() > longest.length()) {
                longest = arr[i];
            }
        }

        System.out.println(longest);

        sc.close();
    }
}