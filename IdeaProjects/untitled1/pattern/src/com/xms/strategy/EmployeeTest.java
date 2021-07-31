package com.xms.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dpc
 * @create 2021-06-23 下午 3:54
 * 需求1:获取所有年龄大于40的员工
 * 需求2:过去所有工资<7000的员工
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("张小明", 33, 6000));
        list.add(new Employee("李小二", 23, 8000));
        list.add(new Employee("王晓芳", 43, 5000));
        list.add(new Employee("赵小龙", 63, 7000));
        list.add(new Employee("孙晓亮", 53, 9000));

//        传统做法
        List<Employee> list1 = filter1(list);
        System.out.println(list1);
        List<Employee> list2 = filter2(list);
        System.out.println(list2);
        System.out.println("----------------");

//        改进:策略模式
        List<Employee> list3 = filter3(list, new AgePredicate());
        System.out.println(list3);
        List<Employee> list4 = filter3(list, new SalaryPredicate());
        System.out.println(list4);
        System.out.println("-----------------");

//        改进2(匿名内部类)
        List<Employee> list5 = filter3(list, new MyPredicate() {
            @Override
            public boolean test(Employee employee) {
                return employee.age > 40;
            }
        });
        System.out.println(list5);

    }

    private static List<Employee> filter1(List<Employee> list) {
        List<Employee> nlist = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.age > 40) {
                nlist.add(employee);
            }
        }
        return nlist;
    }

    private static List<Employee> filter2(List<Employee> list) {
        List<Employee> nlist = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.salary < 7000) {
                nlist.add(employee);
            }
        }
        return nlist;
    }


    //    上面问题:filter1和filter2代码几乎一样,只有条件不一样
//    可以通过策略模式,制定不同的算法,提供不同的条件
    private static List<Employee> filter3(List<Employee> list, MyPredicate pre) {
        List<Employee> nlist = new ArrayList<>();
        for (Employee employee : list) {
            if (pre.test(employee)) {
                nlist.add(employee);
            }
        }
        return nlist;
    }

}
