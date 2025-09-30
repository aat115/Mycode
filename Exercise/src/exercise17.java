import java.util.Scanner;
public class exercise17 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double M = scanner.nextDouble();
            int N = scanner.nextInt();

            double height = M;
            double distance = 0;

            for (int i = 1; i <= N; i++) {
                distance += height;
                height /= 2;
                distance += height;
            }

            distance -= height;

            System.out.printf("%.2f\n%.2f\n", height, distance);
        }
    }
