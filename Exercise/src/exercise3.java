import java.util.*;
public class exercise3
{
    public static void main(String[] args)
    {
        Scanner i =new Scanner(System.in);
        int n = i.nextInt();
        if (n>1&&n<100)
        {
            int sum = 0;
            for(int j=1;j<=n;j++)
            {
                int a = i.nextInt();
                sum += a;
            }
            double avg = (double) sum /n;
            System.out.printf("%.2f",avg);
        }
    }
}
