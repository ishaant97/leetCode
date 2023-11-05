class Solution {
    // my solution but never ran this solution because I is incomplete
    // public int getWinner(int[] arr, int k) {
    //     int[] temp1;
    //     int[] temp2 = new int[ temp1.length+2 ];
    //     int[] temp3;
    //     int[] temp4 = new int[temp3.length+1];
    //     int winCounter;
    //     int winItem;
    //     for(int i = 0; i<arr.length; i++ ){
    //         if(arr[i]>arr[i+1]){
    //             for(int j = 0; j<arr.length-2; j++){
    //                 temp1[j] = arr[j+2];
    //             }
    //             temp2[0] = arr[0];
    //             temp2[temp2.length-1] = arr[1];
    //             for(int j = 0; j<arr.length-2; j++){
    //                 temp2[j+1] = temp1[j];
    //             }
    //             arr = temp2;
    //             winItems = arr[i];
    //             winCounter++;
    //             if(winCounter == k){
    //                 return arr[i];
    //             }
    //             else if()
    //         }
    //         else{
    //             for(int j = 0; j<arr.length-1; j++){
    //                 temp3[j] = arr[j+1];
    //             }
    //             temp4[temp4.length-1] = arr[0];
    //             for(int j = 0; j<arr.length-1; j++){
    //                 temp4[0] = arr[j+1];
    //             }
    //             arr = temp4;
    //             winItems = arr[i+1];
    //             winCounter++;
    //         }
    //     }
    // }


    public int getWinner(int[] arr, int k) {
        int winner;
        int count = 0;
        winner = arr[0];

        if(k > arr.length){
            return Arrays.stream(arr).max().getAsInt();
        }

        if(arr.length == 2){
            if(arr[0]>arr[1]){
                return arr[0];
            }
            else{
                return arr[1];
            }
        }

        for(int i = 1; i<arr.length; i++){
            if(winner>arr[i]){
                count++;
            }
            else{
                winner = arr[i];
                count = 1;
            }

            if(count == k){
                break;
            }
        }
        return winner;
    }
}