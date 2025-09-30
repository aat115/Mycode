import java.util.*;
import java.util.Scanner;
public class exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] Ni = new int[n];
        int[] Mi = new int[m];
        for (int i = 0; i < n; i++) {
            Ni[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            Mi[i] = sc.nextInt();
        }
        int []sum = new int[n+m];
        for (int i = 0; i < n; i++) {
            sum[i] = Ni[i];
        }
        for (int i = 0; i < m; i++) {
            sum[n+i] = Mi[i];
        }
        Arrays.sort(sum);
        for(int a:sum)
            System.out.print(a+" ");
}
}
