class Solution {
    public boolean isPalindrome(int x) {
        if (x > 0) {
            int original = x;
            int reverse = 0;
            int digit;
            while (x > 0) {
                digit = x % 10;
                reverse = (reverse * 10) + digit;
                x = x / 10;
            }
            if (original == reverse) {
                return true;
            } else {
                return false;
            }
        } else if (x == 0) {
            return true;
        } else {
            return false;
        }
    }
}