import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
         char[] S = s.toCharArray();
        char[] T = t.toCharArray();

          if (S.length != T.length) return false;

        int[] freq = new int[26]; // For lowercase English letters

        // Count characters from s and subtract for t
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        // If all counts are zero, it's an anagram
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;

    }
}