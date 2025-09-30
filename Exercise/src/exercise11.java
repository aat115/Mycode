import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1 || n == 2) {
            System.out.println(1);
            return;
        }

        int[] fib = new int[n + 1];
        fib[1] = 1;
        fib[2] = 1;

        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println(fib[n]);
    }
}
