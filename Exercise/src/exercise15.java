import java.util.Scanner;
public class exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int smallCount = 0;
        int number = 0;
        int symbol =0;

        if(str.length()<8||str.length()>16){
            System.out.println("false");
        }
        else if(str.charAt(0)<='A'&&str.charAt(0)>='Z'){
            System.out.println("false");
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
             if(c>='a'&&c<='z'){
                smallCount++;
            }
            else if(c>='0'&&c<='9') {
                 number++;
             }
            else if (c=='~'||c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='*') {
                symbol++;
             }
        }

            if(smallCount==0){
                System.out.println("false");
            }
            else if(number==0){
                System.out.println("false");
            }
            else if(symbol==0){
                System.out.println("false");
            }
            else{
                System.out.println("true");
            }
            }
        }
