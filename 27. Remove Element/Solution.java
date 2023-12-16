class Solution {
    public int removeElement(int[] nums, int val) {
        int newSize = 0;
        for(Integer k : nums){
            if(k != val){
                nums[newSize++] = k;
            }
        }
        return newSize;
    }
}