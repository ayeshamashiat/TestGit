import java.util.Stack;

public class MaxStack {
    Stack<Integer> mainStack;
    Stack<Integer> maxStack;

    public MaxStack() {
        mainStack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int value) {
        mainStack.push(value);

        if (maxStack.isEmpty() || value >= maxStack.peek()) {
            maxStack.push(value);
        }
    }

    public int pop() {
        // Pop from mainStack
        int poppedValue = mainStack.pop();

        if (poppedValue == maxStack.peek()) {
            maxStack.pop();
        }

        return poppedValue;
    }

    public int max() {
        return maxStack.peek();
    }
}
