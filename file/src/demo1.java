import java.io.File;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
//    File f1 =new File("D:\\code\\file\\a.txt");
//        boolean b =f1.createNewFile();
//        System.out.println(b);

        File f2 =new File("D:\\code\\file\\a.txt");
        boolean b =f2.delete();
        System.out.println(b);


//        File f3 =new File("D:\\code\\file\\a.txt");
//        boolean b =f3.mkdir();
//        System.out.println(b);

//        File f4 =new File("D:\\code\\file\\a.txt\\b");
//        boolean b =f4.mkdirs();
//        System.out.println(b);


}
}