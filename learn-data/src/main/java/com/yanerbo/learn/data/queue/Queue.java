package com.yanerbo.learn.data.queue;

/**
 * 队列：
 * 1、先进先出
 * 2、从尾插入，从头删除
 */
public interface Queue {

    /**
     * 入队
     * @param data 数据
     * @return 是否成功
     */
    boolean enqueue(String data);

    /**
     * 出队
     * @return 数据
     */
    String dequeue();

    /**
     * 转换数组
     *
     * @return 转换结果
     */
    String[] toArray();

}
