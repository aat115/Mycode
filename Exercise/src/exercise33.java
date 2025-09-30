public class exercise33{
    public int maximumSum(int[] nums) {
        int ans = -1;
        int[] mx = new int[82];
        for (int num : nums) {
            int s = 0;
            for (int x = num; x > 0; x /= 10) {
                s += x % 10;
            }
            if (mx[s] > 0) {
                ans = Math.max(ans, mx[s] + num);
            }
            mx[s] = Math.max(mx[s], num);
        }
        return ans;
    }
}

