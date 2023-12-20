class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(Integer k : prices){
            if(k < min1){
                min2 = min1;
                min1 = k;
            }
            else if(k < min2){
                min2 = k;
            }
        }

        int result = money - min1 - min2;

        if(result >= 0){
            return result; 
        }
        else{
            return money;
        }
    }
}