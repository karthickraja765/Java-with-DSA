import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplementStacksUsingQueues {

    // Leetcode: https://leetcode.com/problems/implement-stack-using-queues/description/?envType=problem-list-v2&envId=stack
    // Asked in Google
}

// Insert efficient
class MyStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) { // Time: o(1)
        first.push(x);
    }

    public int pop() throws Exception{
        while(!first.isEmpty()) { // Move the elements to the second.
            second.push(first.pop());
        }
        int removed = second.pop(); // Remove the top element.
        while (!second.isEmpty()) { // And Put it back again.
            first.push(second.pop());
        }
        return removed;
    }

    public int top() throws Exception { // Peek in Queue means showing the top most element. Same as the pop, but instead of removing it. Display it.
        while(!first.isEmpty()) { // Move the elements to the second.
            second.push(first.pop());
        }
        int peek = second.peek(); // Peek the top element.
        while (!second.isEmpty()) { // And Put it back again.
            first.push(second.pop());
        }
        return peek;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}

// Remove efficient
class MyStack1 {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyStack1() {
        first = new Stack<>();
        second = new Stack<>();
    }

    // store elements in reverse order so that it becomes Remove efficient
    public void push(int x) throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(x);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public int pop() {
        return first.pop();
    }

    public int top() throws Exception {
        return first.peek();
    }

    public boolean empty() {
        return first.isEmpty();
    }
}

// Implement stack using Queues. // optimal solution: using 1 Queues
class MyStack2 {
    private Queue<Integer> queue;

    public MyStack2() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.offer(x); // Adds the new element at the rear of the queue.
        int size = queue.size(); // store the current size of the queue

        // rotate previous elements behind the new one -> In other words, Rotate all old elements.
        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll()); // poll: Retrieves and removes the head of this queue
        }
    }

    public int pop() {
        if (empty()) throw new RuntimeException("Stack is empty");
        return queue.poll();
    }

    public int top() {
        if (empty()) throw new RuntimeException("Stack is empty");
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

class MyStack3 { // Optimal solution: Using 2 Queues
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack3() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.offer(x); // Offer: Inserts the specified element into this queue

        while (!q1.isEmpty()) {
            q2.offer(q1.poll()); // Poll: Retrieves and removes the head of this queue, or returns null if this queue is empty.
        }

        // swap q1 and q2: Swap is done for reassigning the helper queue to the Original Queue.
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
//        if (empty()) throw new RuntimeException("Stack is empty");
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
