package com.yanerbo.learn.data.stack;

/**
 * 栈：
 * 1、先进后出
 * 2、栈顶插入，栈顶删除
 */
public interface Stack {

    /**
     * 初始化
     * @param capacity 容量
     * @return 是否成功
     */
    boolean init(int capacity);

    /**
     * 入栈
     *
     * @param data 数据
     * @return 是否成功
     */
    boolean pop(String data);

    /**
     * 出栈
     *
     * @return 是否成功
     */
    String push();

    /**
     * 转换数组
     *
     * @return 转换结果
     */
    String[] toArray();

}
