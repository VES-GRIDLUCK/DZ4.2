import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++)
                System.out.print(" ");
            for (int c = 1; c < 2 * n - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
