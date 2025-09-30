public class exercise25 {
public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    boolean conditionA = Math.abs(arr[i] - arr[j]) <= a;
                    boolean conditionB = Math.abs(arr[j] - arr[k]) <= b;
                    boolean conditionC = Math.abs(arr[i] - arr[k]) <= c;

                    if (conditionA && conditionB && conditionC) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
