import java.util.*;

class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer k : nums) {
            if (map.containsKey(k))
                map.put(k, map.get(k) + 1);
            else
                map.put(k, 1);
        }

        int numberOfOperation = 0;

        for (Integer k : map.values()) {
            if (k == 1) {
                return -1;
            }
            numberOfOperation += k / 3;
            if (k % 3 != 0)
                numberOfOperation++;
        }

        return numberOfOperation;
    }
}