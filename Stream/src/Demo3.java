import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "aee", "bcc", "caa", "ddd", "bee","ddd");
        //list.stream().filter(s->s.startsWith("a")).forEach(s->System.out.println(s));
        list.stream().limit(3).skip(2).forEach(s->System.out.println(s));
    }
}
