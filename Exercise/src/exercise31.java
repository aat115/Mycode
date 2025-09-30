import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class exercise31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int []arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public int solution(int[] A) {
        int answer = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >A[i+1]) {
                answer = i;
            }
        }
        return answer;
    }
}
