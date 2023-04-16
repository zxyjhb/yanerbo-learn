package com.yanerbo.learn.data.queue;

/**
 * 无界队列（数组实现）
 */
public class ArrayQueue implements Queue {

    private String[] queue = new String[5];

    private int size = 0;

    public boolean enqueue(String data) {
        //数组满了，那么进行扩容
        if (size == queue.length) {
            String[] newQueue = new String[queue.length * 2];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;
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
