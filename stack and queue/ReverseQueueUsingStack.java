import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements from the queue to the stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Pop elements from the stack and enqueue them back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Original queue: " + queue); // Output: Original queue: [1, 2, 3]

        Queue<Integer> reversedQueue = reverseQueue(queue);

        System.out.println("Reversed queue: " + reversedQueue); // Output: Reversed queue: [3, 2, 1]
    }
}
