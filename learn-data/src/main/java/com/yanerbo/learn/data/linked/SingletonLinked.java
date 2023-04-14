package com.yanerbo.learn.data.linked;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

public class SingletonLinked implements Linked {


    private SingletonNode head;

    private int size;

    public boolean add(String data) {
        return false;
    }

    public boolean add(String data, int index) {
        return false;
    }

    public boolean remove(String data) {
        return false;
    }

    public boolean remove(int index) {
        return false;
    }

    public boolean set(String data, int index) {
        return false;
    }

    public String find(int index) {
        return null;
    }

    public String[] toArray() {
        return new String[0];
    }


    @Data
    @ToString
    @AllArgsConstructor
    static class SingletonNode {

        private String data;

        private SingletonNode next;
    }
}
