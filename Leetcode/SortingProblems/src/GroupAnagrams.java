import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(strs);
    }

    // Leetcode: https://leetcode.com/problems/group-anagrams/
    static List<List<String>> groupAnagrams(String[] strs) { //Brute force: not working
        List<List<String>> res = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            char[] base = strs[i].toCharArray();
            Arrays.sort(base);

            for (int j = i + 1; j < strs.length; j++) {

                if (visited[j]) continue;

                char[] compare = strs[j].toCharArray();
                Arrays.sort(compare);

                if (Arrays.equals(base, compare)) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            res.add(group);
        }
        return res;
    }
}
