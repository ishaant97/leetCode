import java.util.*;
//Brute Force
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i = 0; i<nums.length;i++){
//             for(int j = 0; j<nums.length;j++){
//                 if(nums[i]+nums[j] == target){
//                     if(i!=j){
//                         return new int[] {i,j};
//                     }
//                 }
//             }
//         }
//         return null;
//     }
// }

//Optimized
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[] { map.get(comp), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}