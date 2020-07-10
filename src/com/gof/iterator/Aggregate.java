package com.gof.iterator;

/**
 * 表示集合的接口
 */
public interface Aggregate {

    /**
     * 生成遍历集合的迭代器
     */
    public abstract MyIterator getIterator();

}
