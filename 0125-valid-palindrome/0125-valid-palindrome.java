class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        System.out.println(s);
       int left = 0;
       int Right = s.length()-1;
       while(left < Right){
        if(s.charAt(left) != s.charAt(Right)){
            return false;
        }
        left++;
        Right--;
       }

       return true;
    }
        
}