import java.util.*;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        while (!map.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> trash = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int f = entry.getKey();
                int s = entry.getValue();
                temp.add(f);
                s--;
                if (s == 0) {
                    trash.add(f);
                }
                map.put(f, s);
            }
            list.add(temp);
            for (Integer j : trash) {
                map.remove(j);
            }
        }
        return list;
    }
}