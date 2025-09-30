import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        Arrays.stream(arr).forEach(s->System.out.println(s));

    }
}
