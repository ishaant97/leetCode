class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cookiesNums = s.length;
        if(cookiesNums == 0)  return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren = 0;

        int cookieIndex = cookiesNums - 1;
        int childIndex = g.length - 1;

       while( cookieIndex >= 0 && childIndex >= 0){
           if(g[childIndex] <= s[cookieIndex]){
               contentChildren++;
               cookieIndex--;
               childIndex--;
           }
           else{
               childIndex--;
           }
       }
        return contentChildren;
    }
}