class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length();
        if (len <= 2) {
            return "";
        }
        char[] c = s.toCharArray();
        StringBuilder newString = new StringBuilder();
        int open = 0;
        for (int i = 0; i < len; i++) {
            if (c[i] == '(') {
                open++;
                if (open > 1) {
                    newString.append('(');
                }
            } else {
                if (open > 1) {
                    newString.append(')');
                }
                open--;
            }
        }
        return newString.toString();
    }
}