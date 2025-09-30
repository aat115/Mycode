import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\code\\io\\a.txt",true);//1.创建对象

//        byte[] bytes={97,98,99,100,101};
//        fos.write(bytes,1,2);
//        fos.close();
        //2.写出数据
        String str ="abcde";
        fos.write(str.getBytes());

        String str1 ="\r\n";
        fos.write(str1.getBytes());

        String str3 ="6666";
        fos.write(str3.getBytes());

        fos.close();
    }
}



