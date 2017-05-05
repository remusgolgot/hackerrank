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

    }

    private static void pop() {
        if (!stack.isEmpty()) {
            Integer i = stack.pop();
            if (Objects.equals(i, min)) {
                if (!stack.isEmpty()) {
                    min = stack.pop();
                    System.out.println("Popped " + i + " and current min is " + min);
                } else {
                    min = null;
                    System.out.println("Popped " + i + " and current stack is empty");
                }
            }
        } else {
            System.out.println("Nothing to pop. Stack is empty");
        }
    }

    private static void push(int i) {
        if (min == null) {
            min = i;
        } else {
            if (min > i) {
                stack.push(min);
                min = i;
            }
        }
        stack.push(i);
        System.out.println("Pushed " + i + " and current min is " + min);
    }
}
