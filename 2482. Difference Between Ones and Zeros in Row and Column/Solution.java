class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        //My solution, it's brute force and it also exceeds time limit
        // int row = grid.length;
        // int column = grid[0].length;
        // int[][] diff = new int[row][column];
        // int onesRow = 0;
        // int onesCol = 0;
        // int zerosRow = 0;
        // int zerosCol = 0;
        // int value;

        // for(int i = 0; i < row; i++){
        //     for(int j = 0; j < column; j++){
        //         for(int k = 0; k < row; k++){
        //             if(grid[k][j] == 0){
        //                 zerosRow++;
        //             }
        //             if(grid[k][j] == 1){
        //                 onesRow++;
        //             }
        //         }  
        //         for(int k = 0; k < column; k++){
        //             if(grid[i][k] == 0){
        //                 zerosCol++;
        //             }
        //             if(grid[i][k] == 1){
        //                 onesCol++;
        //             }
        //         }
        //         diff[i][j] = onesRow + onesCol - zerosRow - zerosCol;
        //         onesRow = onesCol = zerosRow = zerosCol = 0;         
        //     }
        // }

        // return diff;

        int[] rowOnes = new int[grid.length];
        int[] colOnes = new int[grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                rowOnes[i] += grid[i][j];
                colOnes[j] += grid[i][j];
            }
        }

        int[][] diff = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                diff[i][j] = rowOnes[i] + colOnes[j] - (grid.length - rowOnes[i]) - (grid[0].  length - colOnes[j]);                
            }
        }

        return diff;
    }
}