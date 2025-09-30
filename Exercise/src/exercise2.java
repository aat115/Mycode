import java.util.*;
public class exercise2
{ public static void main(String []args)
{
    Scanner i = new Scanner (System.in);
    int n = i.nextInt();
    int score =0;
    if (n>=0&&n<=10)
        score = n * 6;
    if (n>=11&&n<=20)
        score = 60 + (n-10)*2;
    if (n>=21&&n<=40)
        score = 80 + (n-20)*1;
    System.out.println(score);
}

}
