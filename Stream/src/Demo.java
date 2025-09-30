import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("aa",111);
        hm.put("bb",111);
        hm.put("cc",111);

        hm.keySet().forEach(s -> System.out.println(s));

    }
}