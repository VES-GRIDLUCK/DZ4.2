import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++)  {
            for (int j = n; j > i; j--)  {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j == i || j == 0 || i == n - 1 ? "*" : " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++)  {
            for (int j = n; j > i; j--)  {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
