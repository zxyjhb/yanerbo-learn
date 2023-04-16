package com.yanerbo.learn.data.queue;

/**
 * 有界队列，超过之后拒绝入队（数组实现）
 */
public class PriorityArrayQueue implements Queue {

    private final String[] queue = new String[5];

    private int size = 0;

    public boolean enqueue(String data) {
        if (size == queue.length) {
            System.out.println("enqueue fail, queue is full");
            return false;
        }
        queue[size] = data;
        size++;
        return true;
    }

    public String dequeue() {
        if (size == 0) {
            System.out.println("dequeue fail, queue is empty");
            return null;
        }
        String data = queue[0];
        System.arraycopy(queue, 1, queue, 0, size - 1);
        queue[size - 1] = null;
        size--;
        return data;
    }

    public String[] toArray() {
        return queue;
    }
}
