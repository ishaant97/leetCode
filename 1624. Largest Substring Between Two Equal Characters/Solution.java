//My solution but not optimized
// class Solution {
//     public int maxLengthBetweenEqualCharacters(String s) {
//         int max = -1;
//         for(int i = 0; i < s.length(); i++){
//             for(int j = i+1; j < s.length(); j++){
//                 if(s.charAt(i) == s.charAt(j)){
//                     max = Math.max(max , j - i - 1);
//                 }
//             }
//         }
//         return max;
//     }
// }

//Optimized solution
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> firstIndex = new HashMap();
        int ans = -1;
        
        for (int i = 0; i < s.length(); i++) {
            if (firstIndex.containsKey(s.charAt(i))) {
                ans = Math.max(ans, i - firstIndex.get(s.charAt(i)) - 1);
            } else {
                firstIndex.put(s.charAt(i), i);
            }
        }
        
        return ans;
    }
}
