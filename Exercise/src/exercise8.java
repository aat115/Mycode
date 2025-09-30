import java.util.*;
public class exercise8
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double t1=(double)n/1.2;
        double t2=50+(double)n/3.0;
        if(t1>t2)
            System.out.println("骑车");
        else if(t1<t2)
            System.out.println("走路");
        else
            System.out.println("一样快");
    }
}
