import java.util.Scanner;
public class exercise19 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String S = sc.nextLine();
            String A  = sc.nextLine();
            String B  = sc.nextLine();

            String C  = S.replace(A,B);
            System.out.println(C);
                }
            }