
import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack();
    Stack<Integer> minstack = new Stack();

    public void push(int val) {
        stack.push(val);

        if (minstack.isEmpty() || val <= minstack.peek()) {
            minstack.push(val);
        }
    }

    public void pop() {
        int popped = stack.pop();
        if (popped == minstack.peek()) {
            minstack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}
