package com.xms.Stream;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author dpc
 * @create 2021-06-28 下午 2:43
 * Stream的终止操作
 */
public class Demo03 {
    List<Employee> list;

    @Before
    public void init() {
        list = Arrays.asList(
                new Employee("Tom", 7000, Status.FREE),
                new Employee("Tony", 5000, Status.BUSY),
                new Employee("Tomas", 6000, Status.BUSY),
                new Employee("Jerry", 8000, Status.VOCATION),
                new Employee("Lucy", 9000, Status.BUSY)
        );
    }

    //    1)匹配操作
    @Test
    public void test1() {
//        1)是否所有人都在忙
        boolean bl = list.stream().allMatch(e -> Status.BUSY.equals(e.status));
        System.out.println(bl);//false

//        2)是否有人在休假
        bl = list.stream().anyMatch(e -> Status.VOCATION.equals(e.status));
        System.out.println(bl);//false

//        3)是否所有人不空闲
        bl = list.stream().noneMatch(e -> Status.FREE.equals(e.status));
        System.out.println(bl);//false
    }

    //    2)查找操作
    @Test
    public void test2() {
//        查找第一个元素
        Optional<Employee> op = list.stream().findFirst();
        System.out.println(op.get());

//        查找任意一个元素

//        注意:fndAny()想要获取任意一个元素,流必须为并行流
//        获取任意1个在忙的员工
        Optional<Employee> op2 = list.stream().filter(e -> e.status.equals(Status.BUSY)).findAny();
        System.out.println(op2.get());
        Optional<Employee> op3 = list.parallelStream().filter(e -> e.status.equals(Status.BUSY)).findAny();
        System.out.println(op3);


//    3)获取在忙员工的总数
        long count = list.stream().filter(e -> e.status.equals(Status.BUSY)).count();
        System.out.println(count);

//        4)获取工资最高的员工
        Optional<Employee> max = list.stream().max((e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println(max.get());

    }

    @Test
//   3)规约操作
    public void test3() {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5);
//        需求:求集合中所有元素和
        Integer sum = li.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);

//        求所有员工的工资和
        Optional<Double> sumSalary = list.stream().map(e -> e.salary).reduce(Double::sum);
        System.out.println(sumSalary.get());


    }

    @Test
//   4)收集操作
    public void test4() {
//        将收集到的元素转成集合
//        1.获取所有员工姓名(List<String>)
        List<String> names = list.stream().map(e -> e.name).collect(Collectors.toList());
        System.out.println(names);
//        2.获取所有员工工资(set<Double>)
        Set<Double> salaries = list.stream().map(e -> e.salary).collect(Collectors.toSet());
        System.out.println(salaries);
//        3.获取所有员工姓名(HashSet<String>)
        HashSet<String> hs = list.stream().map(e -> e.name).collect(Collectors.toCollection(HashSet::new));
        System.out.println(hs);

//        对收集的数据进行汇总
//        1)获取收集元素的总数
//        获取新字大于5000的员工总数
        Long count = list.stream().filter(e -> e.salary > 5000).collect(Collectors.counting());
        System.out.println(count);

//        2)获取所有员工的平均薪资
        Double avg = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
        System.out.println(avg);
//        3)获取所有员工的总薪资
        Double sum = list.stream().collect(Collectors.summingDouble(e -> e.salary));
        System.out.println(sum);
//        4)获取最大薪资
        Optional<Double> max = list.stream().map(e -> e.salary).collect(Collectors.maxBy(Double::compareTo));
        System.out.println(max.get());

//        5)summarizingDouble
        DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(e -> e.salary));
        System.out.println(collect.getMax());
        System.out.println(collect.getMin());
        System.out.println(collect.getAverage());
        System.out.println(collect.getSum());
        System.out.println(collect.getCount());

//        分组
//        按照员工工作状态进行分组
        Map<Status, List<Employee>> map = list.stream().collect(Collectors.groupingBy(e -> e.status));
        map.forEach((k,v)->{
            System.out.println(k);
            v.forEach(e->System.out.println("\t"+e));
        });
        System.out.println("--------------------");

//        多级分组
//        先按照员工工作状态进行分组,同一状态按照工资进行分组
        Map<Status, Map<String, List<Employee>>> collect1 = list.stream().collect(Collectors.groupingBy(e -> e.status, Collectors.groupingBy(e -> {
            if (e.salary < 5000) {
                return "普工";
            } else if (e.salary < 8000) {
                return "技工";
            } else {
                return "高工";
            }
        })));

        collect1.forEach((k,v)->{
            System.out.println(k);
            v.forEach((n,l)->{
                System.out.println("\t"+n);
                l.forEach(e-> System.out.println("\t\t"+e));
            });
        });
        System.out.println("--------------------------");
//        分区
//        工资>=8000一个区,<8000另一个区
        Map<Boolean, List<Employee>> collect2 = list.stream().collect(Collectors.partitioningBy(e -> e.salary >= 8000));
        collect2.forEach((k,v) ->{
            String partInfo = k?">=8000":"<8000";
            System.out.println(partInfo);
            v.forEach(e-> System.out.println("\t"+e));
        });

//        连接
//        1)将所有员工的姓名进行连接
        String allNames = list.stream().map(e -> e.name).collect(Collectors.joining());
        System.out.println(allNames);

//        2)将所有员工的姓名进行连接(以,分割元素)
        String allNames2 = list.stream().map(e -> e.name).collect(Collectors.joining(","));
        System.out.println(allNames2);

//        2)将所有员工的姓名进行连接(以,分割元素,添加前缀<<,添加后缀>>)
        String allNames3 = list.stream().map(e -> e.name).collect(Collectors.joining(",","<<",">>"));
        System.out.println(allNames3);
    }
}
