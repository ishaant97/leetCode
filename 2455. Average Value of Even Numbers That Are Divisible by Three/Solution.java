class Solution {
    public int averageValue(int[] nums) {
        int size = 0;
        int count = 0;
        for (Integer k : nums) {
            if (k % 2 == 0 && k % 3 == 0) {
                count += k;
                size++;
            }
        }
        if (size == 0) {
            return 0;
        }
        return Math.round(count / size);
    }
}