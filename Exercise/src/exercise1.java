import java.util.*;
public class exercise1
{
    public static void main (String [] args)
    {
        Scanner i = new Scanner(System.in);
        int number = i.nextInt();
        int a,b,c;
        a = number/100;
        b = number/10%10;
        c = number%10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
