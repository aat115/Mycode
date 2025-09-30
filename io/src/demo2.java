import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\code\\io\\a.txt");

        int b;
        while((b=fis.read())!=-1){
            System.out.print((char) b);
        }
        //read的参数不一样时b表示也不一样
        fis.close();


    }
}
