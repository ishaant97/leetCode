class Solution {
    public int findSpecialInteger(int[] arr) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i = 0 ; i< arr.length; i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i], map.get(arr[i])+1);
        //     }
        //     else{
        //         map.put(arr[i],1);
        //     }
        // }
        // int max = 0;
        // int specialInteger = 0;
        // for (Integer key : map.keySet()) {
        //     int value = map.get(key);
        //     if (value > max) {
        //         max = value;
        //         specialInteger = key;
        //     }
        // }
        // return specialInteger;





        int size = arr.length;
        int qtr = size / 4;
        int cnt = 1;
        int p = arr[0];

        for(int i = 1; i < size; i++){
            if(p == arr[i]){
                cnt++;
            }
            else{
                cnt = 1;
            }

            if(cnt > qtr){
                return arr[i];
            }

            p = arr[i];
        }
        return p;
    }
}