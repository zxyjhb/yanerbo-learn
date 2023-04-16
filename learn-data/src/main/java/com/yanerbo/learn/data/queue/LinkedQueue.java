package com.yanerbo.learn.data.queue;

import java.util.LinkedList;

/**
 * 无界队列（链表实现）
 */
public class LinkedQueue implements Queue {

    LinkedList<String> queue = new LinkedList<String>();

    public boolean enqueue(String data) {
        queue.add(data);
        return true;
    }

    public String dequeue() {
        if(queue.isEmpty()) {
            System.out.println("dequeue fail, queue is empty");
            return null;
        }
        return queue.removeFirst();
    }

    public String[] toArray() {
        String[] array = new String[queue.size()];
        return queue.toArray(array);
    }
}
