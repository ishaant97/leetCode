class Solution {
    public boolean isPalindrome(String s) {
        // s = s.toUpperCase();
        // List<Character> newArr = new ArrayList<>();
        // for(char a: s.toCharArray()){
        //     int ac = (int) a;
        //     if(48 <= ac && ac <= 57){
        //         newArr.add(a);
        //     }
        //     if(65 <= ac && ac <= 89){
        //         newArr.add(a);
        //     }
        // }
        // for(int i = 0; i < newArr.size() - 1; i++){
        //     if(!(newArr.get(i) == newArr.get(newArr.size() - i))){
        //         return false;
        //     }
        // }

        int start = 0;
        int end = s.length() - 1;

        while(start <= end){
            char currStart = s.charAt(start);
            char currEnd = s.charAt(end);
            if(!(Character.isLetterOrDigit(currStart))){
                start++;
            }
            else if(!(Character.isLetterOrDigit(currEnd))){
                end--;
            }
            else{
                if(Character.toLowerCase(currStart) != Character.toLowerCase(currEnd)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}