import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingTwoQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int data) {
        // Add the new element to queue1
        queue1.add(data);
        // Move all elements from queue2 to queue1
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
        // Swap the references of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        // Pop the element from queue2
        return queue2.poll();
    }

    public int top() {
        if (isEmpty())
            return -1;
        // Peek the top element from queue2
        return queue2.peek();
    }

    public int size() {
        // Size is equal to the size of queue2
        return queue2.size();
    }

    public boolean isEmpty() {
        // Check if queue2 is empty
        return queue2.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Size: " + stack.size()); // Output: 3

        System.out.println("Pop: " + stack.pop()); // Output: 3

        System.out.println("Is empty? " + stack.isEmpty()); // Output: false
        System.out.println("Size: " + stack.size()); // Output: 2
    }
}
