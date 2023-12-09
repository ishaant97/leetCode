class Solution {
    public String largestOddNumber(String num) {
        char[] ch = num.toCharArray();
        for(int i = ch.length - 1; i >= 0; i--){
            int b = ch[i] - '0';
            if(b % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}