import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int c = 1; c <= 2 * i - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int c = 1; c <= 2 * i - 1; c++) {
                if (c==1||c==2*i-1|| i==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
