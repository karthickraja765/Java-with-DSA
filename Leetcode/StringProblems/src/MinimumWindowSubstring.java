public class MinimumWindowSubstring {
    public static void main(String[] args) {

    }

    // Leetcode: https://leetcode.com/problems/minimum-window-substring/

    public String minWindow(String s, String t) {
        int[] sFreq = new int[256];
        int[] tFreq = new int[256];

        for (char ch : t.toCharArray()) { // create a
            tFreq[ch]++;
        }
        int left = 0, right = 0, minLength = Integer.MAX_VALUE, minStart = 0;
        
        // populate the s frequency map
        for (; right < s.length(); right++) {
            sFreq[s.charAt(right)]++; // add every char in sFreq and increase the sFreq pointer to next
            while (isContains(sFreq, tFreq)) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }
                sFreq[s.charAt(left++)]--;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }

    public boolean isContains(int[] sFreq, int[] tFreq) {
        for (int i = 0; i < 256; i++) {
            if (sFreq[i] > tFreq[i]) {
                return false;
            }
        }
        return true;
    }
}
