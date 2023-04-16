package com.yanerbo.learn.data.linked;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.apache.commons.lang.StringUtils;

/**
 * 双向链表失效
 */
public class DoubleLinked implements Linked {

    private DoubleNode head;

    private DoubleNode tail;

    private int size;

    /**
     * 采用头插法
     */
    public boolean add(String data) {

        DoubleNode temp = head;
        final DoubleNode node = new DoubleNode(data, null, temp);
        head = node;
        //插入头节点前面
        if (temp == null) {
            tail = node;
        } else {
            temp.prev = node;
        }
        size++;
        return true;
    }

    public boolean add(String data, int index) {
        //插入头节点
        if (index == 0) {
            add(data);
        } else {
            DoubleNode next = node(index);
            DoubleNode prev = next.prev;
            DoubleNode node = new DoubleNode(data, prev, next);
            next.prev = node;
            prev.next = node;
            size++;
        }
        return true;
    }

    public boolean remove(String data) {

        if (head == null) {
            System.out.println("remove fail, cause head is empty");
            return false;
        }
        for (DoubleNode temp = head; temp != null; temp = temp.next) {
            if (StringUtils.equals(temp.data, data)) {
                unlink(temp);
            }
        }
        return true;
    }

    public boolean remove(int index) {
        if (head == null) {
            System.out.println("remove fail, cause head is empty");
            return false;
        }
        validateIndex(index);
        unlink(node(index));
        return true;
    }

    public boolean set(String data, int index) {
        validateIndex(index);
        node(index).data = data;
        return true;
    }

    public String find(int index) {
        validateIndex(index);
        return node(index).data;
    }

    public String[] toArray() {
        String[] array = new String[size];
        DoubleNode temp = head;
        for (int i = 0; i < size; i++) {
            array[i] = temp.data;
            temp = temp.next;
        }
        return array;
    }

    private DoubleNode node(int index) {
        validateIndex(index);
        DoubleNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index = " + index + ", size=" + size);
        }
    }


    private void unlink(DoubleNode node) {

        final DoubleNode next = node.next;
        final DoubleNode prev = node.prev;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            node.prev = null;
        }

        if (next == null) {
            tail = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }
        size--;
    }


    @Data
    @ToString
    @AllArgsConstructor
    static class DoubleNode {

        private String data;

        private DoubleNode prev;

        private DoubleNode next;
    }
}
