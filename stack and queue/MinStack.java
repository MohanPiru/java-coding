/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

1. Push(num): Push the given number in the stack.
2. Pop: Remove and return the top element from the stack if present, else return -1.
3. Top: return the top element of the stack if present, else return -1.
4. getMin: Returns minimum element of the stack if present, else return -1.
*/



import java.util.Stack;
public class Main{

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(1);

        System.out.println("Top element: " + minStack.top()); // Output: 1
        System.out.println("Minimum element: " + minStack.getMin()); // Output: 1

        minStack.pop(); // Remove top element (1)
        System.out.println("Minimum element after popping: " + minStack.getMin()); // Output: 2
       
        
    }
}



class MinStack {
    private Stack<Integer> stack;
    private int minElement;

    public MinStack() {
        stack = new Stack<>();
        minElement = Integer.MAX_VALUE;
    }

    public void push(int num) {
        if (num <= minElement) {
            stack.push(minElement);
            minElement = num;
        }
        stack.push(num);
    }

    public int pop() {
        if (stack.isEmpty())
            return -1;

        int popped = stack.pop();
        if (popped == minElement) {
            minElement = stack.pop(); // Update minElement to the previous minimum
        }
        return popped;
    }

    public int top() {
        if (stack.isEmpty())
            return -1;
        return stack.peek();
    }

    public int getMin() {
        if (stack.isEmpty())
            return -1;
        return minElement;
    }
    
    
}
