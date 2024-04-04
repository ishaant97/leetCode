class Solution {
    public int lengthOfLastWord(String s) {
        // String[] arrOfStr = s.split(" ");
        // return arrOfStr[arrOfStr.length-1].length();
        int count = 0;
        int r = s.length() - 1;
        while(r>=0){
            if(s.charAt(r) == ' '){
                r--;
            }
            else{
                break;
            }
        }
        for(int i = r; i>=0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}