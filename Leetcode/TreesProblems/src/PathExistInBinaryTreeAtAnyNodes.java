import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PathExistInBinaryTreeAtAnyNodes {

    // space (worst case): o(n)
    // time (worse case): o(n^2) if tree is not balanced and o(n log n) if tree is balanced.
    int countPaths(Node node, int sum) {
        List<Integer> path = new ArrayList<>();
        return helper(node, sum, path);
    }
    int helper(Node node, int sum, List<Integer> path) {
        if(node == null) {
            return 0;
        }
        path.add(node.val);
        int count = 0;
        int s = 0;

        // how many paths I can make
        ListIterator<Integer> itr = path.listIterator(path.size());
        while (itr.hasPrevious()) {
            s += itr.previous();

            if (s == sum) {
                count++;
            }
        }
        count += helper(node.left, s, path) + helper(node.right, sum, path);

        // backtrack
        path.remove(path.size() - 1);
        return count;

    }

    // Printing all the path in the List of list.
    // put in a list
    List<List<Integer>> findPaths(Node node, int sum) { // time and space: o(n log n)
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(node, sum, path);
        return paths;
    }

    void helper(Node node, int sum, List<Integer> path, List<List<Integer>> paths) {
        if(node == null) {
            return;
        }
        path.add(node.val);

        // if leaf node
        if (node.val == sum && node.left == null && node.right == null) {
            paths.add(new ArrayList<>(path));
        } else {
            helper(node.left, sum-node.val, path, paths);
            helper(node.right, sum-node.val, path, paths);
        }

        // backtrack
        path.remove(path.size() - 1);
    }
}
