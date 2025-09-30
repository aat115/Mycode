import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);
        scanner.close();
    }

    public static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (num <= n * n) {
            // 从左到右填充上边
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // 从上到下填充右边
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // 从右到左填充下边
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // 从下到上填充左边
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%-4d", num);
            }
            System.out.println();
        }
    }
}
