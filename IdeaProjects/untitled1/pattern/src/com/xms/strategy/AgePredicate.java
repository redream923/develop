package com.xms.strategy;

/**
 * @author dpc
 * @create 2021-06-23 下午 4:15
 * 具体算法提供具体操作
 */
public class AgePredicate implements MyPredicate {


    @Override
    public boolean test(Employee employee) {
        return employee.age>40;
    }
}
