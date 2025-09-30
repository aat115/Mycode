import java.util.Scanner;

public class exercise29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exercise29 sol = new exercise29();
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.println(sol.number(x));
    }

    public boolean number(int x) {
        if(x<10&&x>0)
            return true;
        if(x<0)
            return false;
        if(x % 10 == 0)
            return false;
        int a = 0;
        while (x > a) {
            a = a * 10 + x % 10;
            x /= 10;
        }
        return x == a|| x ==a/10;
    }
}