import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        if(s1.length != t1.length){
            return false;
        }

        int[] freq = new int[26];

        for(int i =0;i<s1.length;i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;

        }

        for(int count : freq){
            if(count != 0){
                return false;
            }
        }

        return true;

    }
}