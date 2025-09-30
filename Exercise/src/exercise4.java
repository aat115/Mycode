import java.util.*;
public class exercise4
{
    public static void main(String []arg)
    {
      Scanner i=new Scanner(System.in);
      int n=i.nextInt();
      double PI=3.14;
      double squareArea=n*n;
      double circleArea=PI*n*n/4;
      double result=squareArea-circleArea;
      System.out.printf("%.2f",result);
    }
}
