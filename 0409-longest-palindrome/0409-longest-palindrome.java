class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] res = s.toCharArray();
        for(int i = 0;i<res.length;i++){
            if(map.containsKey(res[i])){
                map.put(res[i],map.get(res[i])+1);
            }else{
                map.put(res[i],1);
            }
        }
         int length = 0;
         boolean mid = false;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int count =  entry.getValue();
            if(count % 2 == 0){
                length += count;
            }else{
                length += count -1;
                mid = true;
            }
        }
        
        if(mid){
            length += 1;
        }
        
        return length;
    }
}