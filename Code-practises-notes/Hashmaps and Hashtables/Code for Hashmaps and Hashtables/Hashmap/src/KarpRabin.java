public class KarpRabin {
    private static final int PRIME = 101; // A prime number for modulo operations to reduce collisions

    private long calculateHash(String str) {
        long hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash = (long) (hash + str.charAt(i) * Math.pow(PRIME, i)); // This is a polynomial rolling hash: char value at i * Prime ^ position
        }
        return hash;
    }

    private long updateHash(long prevHash, char oldChar, char newChar, int patternLength) {
        long newHash = (prevHash - oldChar) / PRIME; // removes the oldChar
        newHash = (long) (newHash  + newChar * Math.pow(PRIME, patternLength - 1));
        return newHash;
    }

    public void search(String text, String pattern) { // Searches for occurrences of pattern in text
        int patternLength = pattern.length();
        long patternHash = calculateHash(pattern);
        long textHash = calculateHash(text.substring(0 , patternLength)); // calculating the hash for the text

        for (int i = 0; i < text.length() - patternLength; i++) {
            if (textHash == patternHash) { // checking the hashcode
                if (text.substring(i, i + patternLength).equals(pattern)) { // checking the actual string is same or not
                    System.out.println("Pattern found at index " + i);
                }
            }
            // At this point, above if condition is false. Then, we have to move to the next window
            if (i < text.length() - patternLength) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);
            }
        }
    }

    public static class RabinKarpOptimized {

        private static final int BASE = 256;   // number of possible characters
        /*
         * The radix of the polynomial hash.
         * 256 assumes extended ASCII (each character fits in one byte).
         * Conceptually, the string is treated like a number in base-256.
        */

        private static final int PRIME = 1_000_000_007; // large prime to avoid overflow
        /*
         * Large prime modulus.
         * Keeps hash values bounded and reduces collision probability.
         * Ensures arithmetic stays within long without overflow.
        */

        public void search(String text, String pattern) {
            int n = text.length(); // Whole string length
            int m = pattern.length(); // answer string length

            if (m > n) return; // If pattern is longer than text → impossible match → exit early

            long patternHash = 0; // hash of the pattern
            long textHash = 0; // hash of the text

            /*
            Precompute highest power: BASE^(m - 1) % prime.  Why?
            * When removing the first character from the pattern during sliding the window:
            oldChar * BASE^(m-1)
            * This lets you subtract its contribution in O(1).
            */
            long highestPower = 1; // BASE^ (m - 1);
            for (int i = 0; i < m - 1; i++) {
                highestPower = (highestPower * BASE) % PRIME;
            }

            // Compute initial hashes
            for (int i = 0; i < m; i++) {
                patternHash = (patternHash * BASE + pattern.charAt(i)) % PRIME;
                /*
                * This builds hashes like -> Eg: for "abc" -> hash = ((a * BASE + b) * BASE + c)
                * Why this structure:
                 * No exponentiation
                 * Efficient rolling update
                 * Stable under modulo
                */
                textHash = (textHash * BASE + text.charAt(i)) % PRIME;
            }

            // Sliding window
            for (int i = 0; i <= n - m; i++) { // <= is critical → includes last window
                if (patternHash == textHash) { // Step 1: Compare hash
                    if (text.substring(i, i + m).equals(pattern)) { // Step 2: Verify to avoid collision
                        System.out.println("Pattern found at index " + i);
                    }
                }
                if (i < n - m) { // Step 3: Roll the hash : this if check is for Preventing i to going out of bounds
                    textHash = (textHash - text.charAt(i) * highestPower % PRIME + PRIME) % PRIME;
                    /*
                    Break it down:
                    * text.charAt(i) → character leaving window
                    * Multiply by BASE^(m-1) → its weight in hash
                    * Subtract from current hash

                    Why + MOD?
                    * Subtraction may make value negative
                    * Adding MOD ensures it stays positive before % MOD
                    */
                    textHash = (textHash * BASE + text.charAt(i + m)) % PRIME;
                    /*
                     * Multiply by BASE → shifts all characters left
                     * Add new character at the end
                    */
                }
            }
        }
        /*
        Time complexity:
        * Initial hash: O(m)
        * Sliding window: O(n)
        * Total: O(n + m) average

        Worst case:
        * If many collisions → O(n × m), but rare with good MOD
        */
    }

    public static void main(String[] args) {
        KarpRabin karp = new KarpRabin();
        String a = "Satoru";
        String b = "NanamiYujiShokoSatoruSuguSatoruruHibara";
        karp.search(b, a);

        RabinKarpOptimized rk = new RabinKarpOptimized();
        rk.search("NanamiYujiShokoSatoruSuguruHibara", "Satoru");
    }
}