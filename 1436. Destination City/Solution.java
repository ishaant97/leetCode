import java.util.*;

class Solution {
    public String destCity(List<List<String>> paths) {
        if (paths.size() == 1) {
            return paths.get(0).get(1);
        }
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < paths.size(); i++) {
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }

        for (List<String> path : paths) {
            if (!map.containsKey(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }
}