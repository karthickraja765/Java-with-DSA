import java.util.Stack;

public class Extras {

    // This is not necessary to learn.
    // concept: DFS using stacks (iterative)

    void dfsStack(Node node) {
        if(node == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()) {
            Node removed = stack.pop();
            System.out.print(removed.val + " ");
            // right first and then left for Pre-order traversal
            if(removed.right != null) {
                stack.push(removed.right);
            }
            if(removed.left != null) {
                stack.push(removed.left);
            }
        }
    }
}
