// Not my solution
class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        // Initialize the DP array
        int[] dp = new int[n + 1];
        dp[n] = 1; // There is one way to decode an empty string

        // Fill in the DP array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Check for leading zero
            if (s.charAt(i) == '0') {
                dp[i] = 0;
            } else {
                // Decode single digit
                dp[i] += dp[i + 1];

                // Decode two digits if possible
                if (i + 1 < n && Integer.parseInt(s.substring(i, i + 2)) <= 26) {
                    dp[i] += dp[i + 2];
                }
            }
        }

        return dp[0];
    }
}