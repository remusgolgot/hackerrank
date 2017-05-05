package algorithms.minstack;

import java.util.Objects;
import java.util.Stack;

/**
 * Created by remus.golgot on 5/5/2017.
 *
 */
public class MinStack {


    private static Stack<Integer> stack = new Stack<>();
    private static Integer min = null;

    public static void main(String[] args) {

        push(6);
        push(3);
        push(7);
        push(2);
        push(8);
        push(2);
        push(5);
        push(1);
        push(8);

        pop();
        pop();
        pop();
        push(1);
        pop();
        pop();
        pop();
        pop();
        pop();

        push(1);
        pop();

        pop();
        pop();

        // empty stack
        pop();

    }

    private static void pop() {
        if (!stack.isEmpty()) {
            Integer i = stack.pop();
            if (Objects.equals(i, min)) {
                if (!stack.isEmpty()) {
                        min = stack.pop();
                } else {
                    min = null;
                    System.out.println("Popped " + i + " and current stack is empty");
                    return;
                }
            }
            System.out.println("Popped " + i + " and current min is " + min + " and stack size is " + stack.size());
        } else {
            System.out.println("Nothing to pop. Stack is empty");
        }
    }

    private static void push(int i) {
        if (min == null) {
            min = i;
        } else {
            if (min >= i) { // if we push current min value , we need to push min again
                stack.push(min);
                min = i;
            }
        }
        stack.push(i);
        System.out.println("Pushed " + i + " and current min is " + min  + " and stack size is " + stack.size());
    }
}
