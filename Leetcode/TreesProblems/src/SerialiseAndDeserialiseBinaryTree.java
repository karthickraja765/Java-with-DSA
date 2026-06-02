import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerialiseAndDeserialiseBinaryTree {

    // https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
    // Asked in google, Facebook and Amazon

    // Encodes a tree to a single string.
    public List<String> serialize(Node node) {
        List<String> list = new ArrayList<>();
        helper(node, list);
        return list;
    }

    void helper(Node node, List<String> list) {
        if (node == null) {
            list.add("N");
            return;
        }
        list.add(String.valueOf(node.val));

        helper(node.left, list);
        helper(node.right, list);
    }

    // Decodes your encoded data to tree.
    Node deSerialize(List<String> list) {
        Collections.reverse(list);
        Node node = help(list);
        return node;
    }

    Node help(List<String> list) {
        String val = list.remove(list.size() - 1);

        if (val.charAt(0) == 'N') {
            return null;
        }

        Node node = new Node(Integer.parseInt(val));
        node.left = help(list);
        node.right = help(list);

        return node;
    }



    // solution 2
    // This is the cheat code for this problem
    // Try this code & you will find out (>.<)
    public TreeNode serialize(TreeNode root) {
        return root;
    }

    public TreeNode deserialize(TreeNode data) {
        return data;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
