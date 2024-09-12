class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] arr = allowed.toCharArray();
        int count = 0;
        HashSet<Character> map = new HashSet<>();
        for(char i : arr){
            map.add(i);
        }
        outerLoop:
        for(String i : words){
            for(char j : i.toCharArray()){
                if(!map.contains(j)){
                    continue outerLoop;
                }
            }
            count++;
        }
        return count;
    }
}