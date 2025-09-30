import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        grilFriend gg = new grilFriend();

        while (true) {
            try {
                System.out.println("请输入名字");
                String name = sc.nextLine();
                gg.setName(name);

                System.out.println("请输入年龄");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gg.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄格式有误");
                continue;
            } catch (RuntimeException e) {
                System.out.println("年龄范围有误");
                continue;
            }
        }
        System.out.println(gg);
    }
}