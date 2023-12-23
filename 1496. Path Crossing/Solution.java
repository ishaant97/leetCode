import java.util.*;

class Pair {
    int a;
    int b;

    Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<Pair<Integer, Integer>> visited = new HashSet<>();
        visited.add(new Pair(0, 0));

        int x = 0;
        int y = 0;

        for (Character c : path.toCharArray()) {
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else {
                x--;
            }
            Pair<Integer, Integer> pair = new Pair(x, y);
            if (visited.contains(pair)) {
                return true;
            }
            visited.add(pair);
        }
        return false;
    }
}