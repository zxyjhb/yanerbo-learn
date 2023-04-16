package com.yanerbo.learn.data.linked;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.apache.commons.lang.StringUtils;

/**
 * 单向链表实现
 */
public class SingleLinked implements Linked {

    private SingleNode head;

    private int size;

    /**
     * 这里采用头插入法实现
     */
    public boolean add(String data) {
        SingleNode node = new SingleNode(data, null);
        //插入头节点前面
        if (head != null) {
            node.next = head;
        }
        //当前设置头节点
        head = node;
        size++;
        return true;
    }

    /**
     *
     */
    public boolean add(String data, int index) {
        //插入头节点
        if (index == 0) {
            add(data);
        } else {
            validateIndex(index);
            SingleNode prev = node(index - 1);
            SingleNode node = new SingleNode(data, null);
            //下面操作反了，会指针丢失
            //设置当前next为前驱next
            node.next = prev.next;
            //当前节点设置前驱节点
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
        //如果是删除头节点
        if (StringUtils.equals(head.data, data)) {
            SingleNode node = head;
            head = head.next;
            node.next = null;
            size--;
        } else {
            SingleNode temp = head;
            while (temp.next != null) {
                //查询前驱节点
                if (StringUtils.equals(temp.next.data, data)) {
                    SingleNode node = temp.next;
                    temp.next = node.next;
                    node.next = null;
                    size--;
                } else {
                    //如果非前驱节点，那么继续找
                    temp = temp.next;
                }
            }
        }
        return true;
    }

    public boolean remove(int index) {
        if (head == null) {
            System.out.println("remove fail, cause head is empty");
            return false;
        }
        if (index == 0) {
            SingleNode node = head;
            head = head.next;
            node.next = null;
            size--;
        } else {
            SingleNode prev = node(index - 1);
            SingleNode node = prev.next;
            prev.next = node.next;
            node.next = null;
            size--;
        }
        return true;
    }

    public boolean set(String data, int index) {
        validateIndex(index);
        SingleNode node = node(index);
        node.data = data;
        return true;
    }

    public String find(int index) {
        validateIndex(index);
        SingleNode node = node(index);
        return node.data;
    }

    public String[] toArray() {
        String[] array = new String[size];
        SingleNode temp = head;
        for (int i = 0; i < size; i++) {
            array[i] = temp.data;
            temp = temp.next;
        }
        return array;
    }

    private SingleNode node(int index) {
        validateIndex(index);
        SingleNode temp = head;
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

    @Data
    @ToString
    @AllArgsConstructor
    static class SingleNode {

        private String data;

        private SingleNode next;
    }

}

