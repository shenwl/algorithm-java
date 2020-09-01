package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * leetcode 225
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 */
public class ImplementStackUsingQueues {
    public static class MyStack {
        Queue<Integer> q1;
        Queue<Integer> q2;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            this.q1 = new LinkedList<>();
            this.q2 = new LinkedList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            q1.add(x);
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            int result = q1.remove();

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return result;
        }

        /**
         * Get the top element.
         */
        public int top() {
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            int result = q1.element();

            q2.add(q1.remove());

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return result;
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return q1.isEmpty() && q2.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack s = new ImplementStackUsingQueues.MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.top());;
    }
}
