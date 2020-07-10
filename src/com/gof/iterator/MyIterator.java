package com.gof.iterator;

/**
 * 遍历集合的接口
 */
public interface MyIterator {

    /**
     * 判断是否存在下一个元素
     */
    public abstract boolean hasNext();

    /**
     * 获取下一个元素
     * @return
     */
    public abstract Object next();
}
