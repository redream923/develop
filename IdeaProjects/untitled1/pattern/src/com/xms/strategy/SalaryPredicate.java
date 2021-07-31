package com.xms.strategy;

/**
 * @author dpc
 * @create 2021-06-23 下午 4:17
 */
public class SalaryPredicate implements MyPredicate {


    @Override
    public boolean test(Employee employee) {
        return employee.salary<7000;
    }
}
