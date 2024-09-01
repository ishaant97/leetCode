class Solution {
    public int reverse(int x) {
        int temp = x;
        int rev = 0;
        if(x < 0){
            x = Math.abs(x);
        }
        while(x > 0){
            int digit = x % 10;
            if (rev > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            rev = (rev * 10) + digit;
            x = x / 10;
        }
        if(temp < 0){
            return rev*(-1);
        }
        return rev;
    }
}