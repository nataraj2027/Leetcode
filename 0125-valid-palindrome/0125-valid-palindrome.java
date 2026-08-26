class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        String res = new StringBuilder(s).reverse().toString();
        if(s.equalsIgnoreCase(res)){
            return true;

        }    

        return false;


    }
}