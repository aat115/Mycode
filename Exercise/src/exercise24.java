import java.util.Scanner;
public class exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
            switch (n % 2) {
                case 1:
                    System.out.println(n * 2);
                    break;
                case 0:
                    System.out.println(n);
                    break;
            }
        }
    }
