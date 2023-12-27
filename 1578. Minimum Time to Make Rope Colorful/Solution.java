//Not my solution but I understood
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int cost = 0;
        int i = 0, j = 0;
        int currentTotal;
        int currentMax;

        while(i < neededTime.length && j < neededTime.length){
            currentTotal = currentMax = 0;

            while(j < neededTime.length && colors.charAt(i) == colors.charAt(j)){
                currentTotal += neededTime[j];
                currentMax = Math.max(currentMax, neededTime[j]);
                j++;
            }

            cost += currentTotal - currentMax;
            i = j;
        }
        return cost;        
    }
}