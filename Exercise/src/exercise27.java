public class exercise27 {
        public int maxScore(String s) {
            int maxScore = 0;
            int totalOnes = 0;
            int leftZeros = 0;
            int leftOnes = 0;

            // Count total number of '1's in the string
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    totalOnes++;
                }
            }

            // Iterate through each possible split point
            for (int i = 0; i < s.length() - 1; i++) {
                char current = s.charAt(i);
                if (current == '0') {
                    leftZeros++;
                } else {
                    leftOnes++;
                }
                int rightOnes = totalOnes - leftOnes;
                int currentScore = leftZeros + rightOnes;
                if (currentScore > maxScore) {
                    maxScore = currentScore;
                }
            }

            return maxScore;
        }
    }
