import java.util.Scanner;

public class exercise30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Solution(x));
    }
        public static int Solution(int x) {
            int res = 0;
            while(x!=0) {
                int tmp = x%10;
                if (res>214748364 || (res==214748364 && tmp>7)) {
                    return 0;
                }if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                    return 0;
                }
                res = res*10 + tmp;
                x /= 10;
            }
            return res;
        }
    }