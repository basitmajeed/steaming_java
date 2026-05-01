import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int classes = sc.nextInt();
        int students = sc.nextInt();
        int subjects = sc.nextInt();

        int[][][] marks = new int[classes][students][subjects];

        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < students; j++) {
                for (int k = 0; k < subjects; k++) {
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < students; j++) {
                int total = 0;
                for (int k = 0; k < subjects; k++) {
                    total += marks[i][j][k];
                }
                System.out.println(total);
            }
        }

        sc.close();
    }
}