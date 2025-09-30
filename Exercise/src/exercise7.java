import java.util.*;
public class exercise7
{
    public static void main(String[]args)
    {
        int result;
     for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                result=i*j;
                System.out.printf("%d * %d = %d    ",i,j,result);
            }
            System.out.println();
        }
    }
}
