import java.util.*;
public class exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Ni = new int[n];
        for (int i = 0; i < n; i++)
        {
            Ni[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[]a=new int[n];
        for(int i = 0; i < n; i++) {
            int j = i + m;
            if (j >= n) {
                j -= n;
            }
            a[j] = Ni[i];
        }
        for(int b:a)
        {
            System.out.print(b);
            System.out.print(" ");
        }
    }
}