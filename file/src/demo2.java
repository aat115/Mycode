import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\code\\file");
        File []files =f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
