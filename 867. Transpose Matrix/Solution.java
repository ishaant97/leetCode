class Solution {
    public int[][] transpose(int[][] matrix) {
        int coloumn = matrix.length;
        int rows = matrix[0].length;
        int[][] result = new int[rows][coloumn];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j < coloumn ; j++){
                result[i][j] = matrix[j][i]; 
            }
        }
        return result;
    }
}