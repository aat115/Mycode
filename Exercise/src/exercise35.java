public class exercise35 {
}
class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] s = blocks.toCharArray();
        int cntW = 0;
        for (int i = 0; i < k; i++) {
            cntW += s[i] & 1;
        }
        int ans = cntW;
        for (int i = k; i < s.length; i++) {
            cntW += (s[i] & 1) - (s[i - k] & 1);
            ans = Math.min(ans, cntW);
        }
        return ans;
    }
}
