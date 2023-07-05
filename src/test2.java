import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print(j == i || i == 0 || i == n - 1 || j == n - 1 ? "*" : " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
