import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
                ArrayList<String> list1 = new ArrayList<String>();
         ArrayList<String> list2 = new ArrayList<String>();
        Collections.addAll(list1, "aee", "bcc", "caa", "ddd", "bee","ddd");
        Collections.addAll(list2, "aee", "bcc", "caa", "ddd", "bee","ddd");
        //list1.stream().distinct().forEach(s->System.out.println(s));
        Stream.concat(list1.stream(),list2.stream()).forEach(s -> System.out.println(s));
    }
}
