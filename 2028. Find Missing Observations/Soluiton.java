class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sumOfRolls = 0;
        int len = rolls.length;
        for (int roll : rolls) {
            sumOfRolls = sumOfRolls + roll;
        }
        int totalOb = len + n;
        int totalSum = mean * totalOb;
        int neededSum = totalSum - sumOfRolls;

        if (neededSum > 6 * n || neededSum < n) {
            int arr[] = {};
            return arr;
        }

        int result[] = new int[n];
        int base = neededSum / n;
        int remainder = neededSum % n;

        for (int i = 0; i < n; i++) {
            result[i] = base + (i < remainder ? 1 : 0);
        }
        return result;
    }
}