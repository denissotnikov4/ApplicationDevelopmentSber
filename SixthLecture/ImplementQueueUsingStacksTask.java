package SixthLecture;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStacksTask {
    private final Deque<Integer> incoming = new ArrayDeque<>();
    private final Deque<Integer> outgoing = new ArrayDeque<>();

    public ImplementQueueUsingStacksTask() {
    }

    public void push(int x) {
        incoming.push(x);
    }

    public int pop() {
        moveIfNeeded();
        return outgoing.pop();
    }

    public int peek() {
        moveIfNeeded();
        return outgoing.peek();
    }

    public boolean empty() {
        return incoming.isEmpty() && outgoing.isEmpty();
    }

    private void moveIfNeeded() {
        if (outgoing.isEmpty()) {
            while (!incoming.isEmpty()) {
                outgoing.push(incoming.pop());
            }
        }
    }
}
