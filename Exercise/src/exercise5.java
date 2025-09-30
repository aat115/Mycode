import java.util.Scanner;
public class exercise5
{
    public static void main(String[] arg)
    {
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        int a = i.nextInt();
        int a1 = 0;
        int Sn = 0;
        for (int n1 = 0; n1 < n; n1++)
        {
            a1 = a1 * 10 + a;
            Sn += a1;
        }
        System.out.println(Sn);
    }

}
