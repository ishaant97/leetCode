class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> map1 = new HashMap<>();
        HashMap <Character,Integer> map2 = new HashMap<>();

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        // int size = t.length();

        for(char ch : arr1){
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch) + 1);
            }
            else{
                map1.put(ch, 1);
            }
        }

        for(char ch : arr2){
            if(map2.containsKey(ch)){
                map2.put(ch,map2.get(ch) + 1);
            }
            else{
                map2.put(ch, 1);
            }
        }

        // int count = 0;

        // for(Character key : map2.keySet()){
        //     if(map1.containsKey(key)){
        //         if(map2.get(key) == map1.get(key)){
        //             count++;
        //         }
        //     }
        // }

        // System.out.print(count);
        // System.out.print(size);

        // if(count == size){
        //     return true;
        // }

        // for(Character key : map1.keySet()){
        //     System.out.println("Key : " + key + " value : " + map1.get(key));
        // }

        // System.out.print("-----------");

        // for(Character key : map2.keySet()){
        //     System.out.println("Key : " + key + " value : " + map2.get(key));
        // }

        return map1.equals(map2);
        
    }
}