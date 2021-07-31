package com.xms.strategy;

/**
 * @author dpc
 * @create 2021-06-23 下午 4:12
 * 用来制定所有算法需要之心规定操作
 */
public interface MyPredicate {
    boolean test(Employee employee);
}
