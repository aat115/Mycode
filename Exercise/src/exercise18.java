import java.util.Scanner;
public class exercise18 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            System.out.println(encryptPassword(password));
        }

        public static String encryptPassword(String password) {
            StringBuilder encrypted = new StringBuilder();

            for (char c : password.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    int offset = (c - base + 5) % 26;
                    encrypted.append((char)(base + offset));
                } else if (Character.isDigit(c)) {
                    int digit = Character.getNumericValue(c);
                    digit = (digit + 5) % 10;
                    encrypted.append(digit);
                } else {
                    encrypted.append(c);
                }
            }

            return encrypted.toString();
        }
    }