class Solution {
    public int[] findErrorNums(int[] nums) {
        int length = nums.length;
        int[] k = new int[length+1];
        for(int i = 0; i < length; i++){
            k[nums[i]]++;
        }
        int dup = 0;
        int miss = 0;
        for(int i = 1; i<k.length; i++){
            if(k[i] == 2){
                dup = i;
            }
            if(k[i] == 0){
                miss = i;
            }
        }
        int[] arr = new int[2];
        arr[0] = dup;
        arr[1] = miss;
        return arr;
    }
}