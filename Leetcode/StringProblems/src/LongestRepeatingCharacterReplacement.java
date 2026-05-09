public class LongestRepeatingCharacterReplacement {

    // Leetcode: https://leetcode.com/problems/longest-repeating-character-replacement/description/

    // Reference for solution: https://www.youtube.com/watch?v=ExY8svHF_Eo

    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFreq = 0, maxWindow = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            // update the current frequency of the character u come across
            freq[s.charAt(right) - 'A']++; // freq[s.charAt(right)] = freq[s.charAt(right)] + 1;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // characters to be changed = maxWindow - maxFreq

            // int windowLength = right - left + 1; don't use like this
            while (right - left + 1 - maxFreq > k) { // if true, we need to reduce the window size (remove the left index and left++)
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // windowLength = right - left + 1;
            maxWindow = Math.max(maxWindow, right - left + 1);
        }
        return maxWindow;
    }
}
