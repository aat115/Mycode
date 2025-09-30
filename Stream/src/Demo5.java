import java.util.ArrayList;
import java.util.Collections;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, "aee-1", "bcc-2", "caa-3", "ddd-4", "bee-5");
        list1.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s->System.out.println(s));

}
}
//终结forEach,count,toArrays
