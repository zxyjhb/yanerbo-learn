package com.yanerbo.learn.data.search;

/**
 * @author yanerbo
 */
public interface Search {

    /**
     * 查找指定元素
     *
     * @param array
     * @param data
     * @return
     */
    int find(int[] array, int data);

    /**
     * 查找第一个等于给定值的元素
     *
     * @param array
     * @param data
     * @return
     */
    int findFirst(int[] array, int data);

    /**
     * 查找最后一个等于给定值的元素
     *
     * @param array
     * @param data
     * @return
     */
    int findLast(int[] array, int data);

    /**
     * 查找第一个大于等于给定值的元素
     *
     * @param array
     * @param data
     * @return
     */
    int findGeFirst(int[] array, int data);

    /**
     * 查找最后一个大于等于给定值的元素
     *
     * @param array
     * @param data
     * @return
     */
    int findLeLast(int[] array, int data);

}
