import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "a", "b", "c");
        list.stream().forEach(s->System.out.println(s));
    }
}
