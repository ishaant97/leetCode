import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityElement = nums[0];
        int majoritySize = Integer.MIN_VALUE;

        for (Integer k : nums) {
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + 1);
            } else {
                map.put(k, 1);
            }
        }

        for (Integer k : map.keySet()) {
            if (map.get(k) > majoritySize) {
                majorityElement = k;
                majoritySize = map.get(k);
            }
        }

        return majorityElement;
    }
}
