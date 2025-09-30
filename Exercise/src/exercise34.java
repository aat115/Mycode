public class exercise34 {
    public int similarPairs(String[] words) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int ans = 0;
        for (String s : words) {
            int mask = 0;
            for (char c : s.toCharArray()) {
                mask |= 1 << (c - 'a');
            }
            int c = cnt.getOrDefault(mask, 0);
            ans += c;
            cnt.put(mask, c + 1);
        }
        return ans;
    }
}
