package com.xms.test;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author dpc
 * @create 2021-06-29 下午 2:11
 * 7)现有Trader类和Transaction类
 * * class Trader{//交易员
 * * private String name;
 * * private String city;
 * * //构造,getters,setters,toString
 * * }
 * * class Transaction{//交易
 * * private Trader trader;
 * * private int year;
 * * private int value;
 * * //构造,getters,setters,toString
 * * }
 * * 需求:
 * * 1.找处2018年发生的所有交易,并按照交易额升序排序
 * * 2.交易员都在哪些城市工作过
 * * 3.查找来自上海的交易员,按照名字的字典顺序排序
 * * 4.返回所有交易员的姓名,照姓名的字典顺序排序
 * * 5.有没有交易员在苏州工作
 * * 6.打印所有在上海的交易员的所有交易总额
 * * 7.所有交易中,最高的交易额是多少
 * * 8找到交易额最小的交易
 */

public class Test07 {
    List<Trader> traders;
    List<Transaction> transactions;

    @Before
    public void init() {
        traders = new ArrayList<>();
        transactions = new ArrayList<>();
//        创建交易员
        Trader t1 = new Trader("zs", "北京");
        Trader t2 = new Trader("ls", "上海");
        Trader t3 = new Trader("ww", "上海");
        Trader t4 = new Trader("zl", "上海");
        Trader t5 = new Trader("tq", "苏州");
        traders.add(t1);
        traders.add(t2);
        traders.add(t3);
        traders.add(t4);
        traders.add(t5);
        transactions.add(new Transaction(t1, 2020, 1000));
        transactions.add(new Transaction(t2, 2018, 500));
        transactions.add(new Transaction(t3, 2021, 3000));
        transactions.add(new Transaction(t4, 2018, 6000));
        transactions.add(new Transaction(t5, 2018, 2000));
    }

    @Test
    public void test1() {
        List<Transaction> list = transactions.stream()
                .filter(t -> t.getYear() == 2018)
                .sorted((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()))
                .collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void test2() {
        List<String> cities = traders.stream().map(t -> t.getCity()).distinct().collect(Collectors.toList());
        System.out.println(cities);
    }

    @Test
    public void test3() {
        List<Trader> list = traders.stream()
                .filter(s -> s.getCity().equals("上海"))
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void test4() {
        List<String> list = traders.stream().map(t -> t.getName()).distinct().sorted().collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void test5() {
        boolean bl = traders.stream().map(t -> t.getCity()).anyMatch(c -> c.equals("苏州"));
        System.out.println(bl);
    }
    @Test
    public void test6() {
        DoubleSummaryStatistics sum = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("上海"))
                .collect(Collectors.summarizingDouble(t -> t.getValue()));//Transaction::getValue
        System.out.println(sum.getSum());
    }
    @Test
    public void test7() {
        Optional<Transaction> max = transactions.stream().collect(Collectors.maxBy((t1, t2) -> t1.getValue() - t2.getValue()));
        System.out.println(max.get().getValue());
        DoubleSummaryStatistics collect = transactions.stream().collect(Collectors.summarizingDouble(t -> t.getValue()));
        System.out.println( collect.getMax());

    }

    @Test
    public void test8() {
        Optional<Transaction> min = transactions.stream().collect(Collectors.minBy((t1, t2) -> t1.getValue() - t2.getValue()));
        System.out.println(min.get());
        Optional<Transaction> min2 = transactions.stream().min((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()));
        System.out.println(min2.get());
    }
}
