package com.yanerbo.learn.data.linked;

public interface Linked {

    /**
     * 插入
     *
     * @param data 数据
     * @return 是否成功
     */
    boolean add(String data);

    /**
     * 插入指定位置
     *
     * @param data  数据
     * @param index 位置
     * @return 是否成功
     */
    boolean add(String data, int index);

    /**
     * 删除指定元素
     *
     * @param data 数据
     * @return 是否成功
     */
    boolean remove(String data);

    /**
     * 删除指定位置元素
     *
     * @param index 位置
     * @return 是否成功
     */
    boolean remove(int index);

    /**
     * 修改元素
     *
     * @param data  数据
     * @param index 位置
     * @return 是否成功
     */
    boolean set(String data, int index);

    /**
     * 查询
     *
     * @param index 位置
     * @return 数据
     */
    String find(int index);

    /**
     * 转换数组
     *
     * @return 转换结果
     */
    String[] toArray();

}
