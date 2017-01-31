package algorithms.queuewithtwostacks;

import java.util.Stack;

/**
 * Created by remus.golgot on 1/31/2017.
 *
 *
 */
public class Solution {


    public static void main(String[] args) {

    }

    static class Queue<E> {

        private Stack<E> inbox = new Stack<>();
        private Stack<E> outbox = new Stack<>();

        public void queue(E item) {
            inbox.push(item);
        }

        public E dequeue() {
            if (outbox.isEmpty()) {
                while (!inbox.isEmpty()) {
                    outbox.push(inbox.pop());
                }
            }
            return outbox.pop();
        }

    }
}
