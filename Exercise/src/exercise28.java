import java.util.Scanner;
public class exercise28 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入单词（用空格分隔，例如：are amy u）:");
            String input = scanner.nextLine();
            String[] words = input.split("，");

            System.out.println("请输入 left 和 right（用空格分隔，例如：0 2）:");
            int left = scanner.nextInt();
            int right = scanner.nextInt();

            int count = vowelStrings(words, left, right);
            System.out.println("元音字符串数量: " + count);

        }

        public static int vowelStrings(String[] words, int left, int right) {
            int count = 0;

            for (int i = left; i <= right; i++) {
                String word = words[i];
                if (word.isEmpty()) continue;

                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);

                if (isVowel(firstChar) && isVowel(lastChar)) {
                    count++;
                }
            }
            return count;
        }

        private static boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
    }
