import java.util.*;
public class exercise10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
            char[] chars = scanner.nextLine().toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z')
            {
                chars[i] = (char)(c + 32);
            } else if (c >= 'a' && c <= 'z')
            {
                chars[i] = (char) (c - 32);
            }
        }

        System.out.println(new String(chars));
    }
    }