class Solution {
    public int maxProduct(int[] nums) {
        // My Solution but not optimized
        // int length = nums.length;
        // int maxProduct = 0;
        // for(int i = 0; i < length; i++){
        // for(int jaxProduct = (nums[i]-1)*(nums[j]-1);
        // } = i+1; j < length; j++){
        // if((nums[i]-1)*(nums[j]-1) > maxProduct){
        // m
        // }
        // }
        // return maxProduct;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return ((max1 - 1) * (max2 - 1));
    }
}