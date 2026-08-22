class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
        String rev = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(rev);
         
        
        
    }
}