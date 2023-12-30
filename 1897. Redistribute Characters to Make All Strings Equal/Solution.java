import java.util.*;;

class Solution {
    public boolean makeEqual(String[] words) {
        StringBuilder whole = new StringBuilder();
        int length = words.length;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            whole.append(words[i]);
        }
        String whole1 = whole.toString();
        for (int i = 0; i < whole1.length(); i++) {
            if (map.containsKey(whole1.charAt(i))) {
                map.put(whole1.charAt(i), map.get(whole1.charAt(i)) + 1);
            } else {
                map.put(whole1.charAt(i), 1);
            }
        }
        for (int count : map.values()) {
            if (count % length != 0) {
                return false;
            }
        }
        return true;
    }
}