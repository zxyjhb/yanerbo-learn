package com.yanerbo.learn.data.sorted;

/**
 * 冒泡排序
 */
public class BubbleSort implements Sort {

    public int[] sort(int[] data) {

        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
        return data;
    }
}
