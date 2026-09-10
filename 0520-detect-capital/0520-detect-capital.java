class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int count =0;
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        char c = word.charAt(0);

        if(count == n || count == 1 && Character.isUpperCase(c) || count == 0){
            return true;
        }else{
            return false;
        }
        
    }
}