import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\code\\io\\copy.mp4");//输出流，程序把数据输出给本地文件，就是写入文件
        FileInputStream fis = new FileInputStream("D:\\test\\video.mp4");//输入流，本地文件把数据输入给程序，就是读取文件
        byte[] buffer = new byte[1024*1024*5];
        int length;
        while((length=fis.read(buffer))!=-1){
            fos.write(buffer,0,length);
    }

    fos.close();
    }
}
