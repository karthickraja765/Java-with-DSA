import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    // Leetcode: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

    public int lengthOfLongestSubstring(String s) { // optimal solution
        Set<Character> charMap = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (charMap.contains(s.charAt(right))) {
                charMap.remove(s.charAt(left));
                left++;
            }
            charMap.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
