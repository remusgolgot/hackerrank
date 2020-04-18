package hackerrank.challenges.datastructures.queues.queuewithtwostacks;

import java.util.*;

/**
 * Created by remus.golgot on 04/18/2020.
 * <p>
 * https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
 */
public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Queue<String> q = new Queue<>();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            if (s.contains(" ")) {
                q.queue(s.split(" ")[1]);
            }
            if (s.equals("2")) {
                q.dequeue();
            }
            if (s.equals("3")) {
                System.out.println(q.peek());
            }
        }

    }

    static class Queue<E> {

        private Stack<E> inbox = new Stack<>();
        private Stack<E> outbox = new Stack<>();

        public int outboxSize() {
            return this.outbox.size();
        }

        public int inboxSize() {
            return this.inbox.size();
        }

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

        public E peek() {
            if (outbox.isEmpty()) {
                while (!inbox.isEmpty()) {
                    outbox.push(inbox.pop());
                }
            }
            return outbox.peek();
        }


    }
}