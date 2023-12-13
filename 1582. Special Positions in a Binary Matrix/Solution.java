class Solution {
    public int numSpecial(int[][] mat) {
        int rows = mat.length;
        int column = mat[0].length;
        int specialPosition = 0;

        for(int i  = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                if(mat[i][j] == 1){
                    boolean isSpecial = true;

                    for(int k = 0; k < rows; k++){
                        if(mat[k][j] == 1 && k!=i){
                            isSpecial = false;
                            break;
                        }
                    }
                    
                    for(int k = 0; k < column; k++){
                        if(mat[i][k] == 1 && k!=j){
                            isSpecial = false;
                            break;
                        }
                    }

                    if(isSpecial){
                        specialPosition++;
                    }
                }
            }
        }
        return specialPosition;                
    }
}